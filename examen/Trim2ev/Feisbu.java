package ud08.examen.Trim2ev;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.HashSet;

public class Feisbu {

    private Map<String, Usuario> usuarios;
    private Map<String, Grupo> grupos;
    public Feisbu() {
        usuarios = new HashMap<>();
        grupos = new HashMap<>();
        cargaUsuariosGrupos();
        cargaRelacionesAmistad();
    }
    

    /**
     * Lee por la entrada estandar lineas de datos que contienen
     * cada una información de un usuario de la red social Feisbu
     */
    private void cargaUsuariosGrupos(){
        Scanner sc = new Scanner(System.in);
        String linea = sc.nextLine();
        while(!linea.equals("FIN")){
            String[] datos = linea.split(";");
            int longitud = datos.length;
            String nombreUsuario = datos[0];
            String nombreCompleto = datos[1]
            char genero = datos[longitud - 4].charAt(0);
            String anio = datos[longitud-3];
            String mes = datos[longitud-2];
            String dia = datos[longitud-1];            
            LocalDate fechaRegistro = getFecha(anio, mes, dia);
            Usuario usuario = new Usuario(nombreUsuario, nombreCompleto, genero, fechaRegistro);

            for (int i = 2; i < longitud -4; i++) {
                String nombreGrupo = datos[i];
                Grupo grupo = buscaGrupo(nombreGrupo);
                if (grupo == null)
                    grupo = new Grupo(nombreGrupo);
                agregaGrupo(grupo);
                usuario.agregarGrupo(grupo);
            } agregaUsuario(usuario);
            linea = sc.nextLine();
        }
    }
        

    /**
     * Lee por la entrada estandar lineas de datos que contienen
     * cada una las relaciones de amistad de cada usuario de la red 
     * social Feisbu
     */

    private void cargaRelacionesAmistad(){    
        Scanner sc = new Scanner(System.in);
        while(true){
            String[] datos = sc.nextLine().split(":");
            if(datos[0].equals("FIN")) break;
            Usuario usuario = buscaUsuario(datos[0]);
            String[] amigos = datos[1].split(";");
            for (String amigo : amigos) {
                usuario.agregarAmigo(buscaUsuario(amigo));
            }
        }
    }
    
    /**
     * Devuelve un objeto LocalDate que se corresponde con el 
     * anio, mes y dia pasados como parámetro
     */
    private LocalDate getFecha(String anio, String mes, String dia){
        int a = Integer.parseInt(anio);
        int m = Integer.parseInt(mes);
        int d = Integer.parseInt(dia);
        return LocalDate.of(a,m,d);
    }

    /**
     * Devuelve el objeto Usuario que tiene el en nombre de usuario
     * pasado como parámetro. Si no lo encuentra devulve null;
     */
    public Usuario buscaUsuario(String nombreUsuario){
        return usuarios.get(nombreUsuario);
    }

    /**
     * Devuelve el objeto Grupo que tiene en nombre de grupo
     * pasado como parámetro. Si no lo encuentra devulve null;
     */
    public Grupo buscaGrupo(String nombreGrupo){
        return grupos.get(nombreGrupo);
    }
    
    /**
     * Agrega un usuario en la estructura de datos que mantiene la red
     * social para usuarios si no puede añadirlo, lo devuelve
     */
    public Usuario agregaUsuario(Usuario unUsuario){
        return usuarios.putIfAbsent(unUsuario.getNombreCompleto(), unUsuario);
    }  

    /**
     * Agrega un grupo en la estructura de datos que mantiene la red
     * social para grupos 
     */
    public Grupo agregaGrupo(Grupo unGrupo){
        return grupos.putIfAbsent(unGrupo.getNombre(), unGrupo);
    }

    /**
     * Devuelve todos los usuarios de la red social
     */
    public Set<Usuario> getUsuarios(){
       Set<Usuario> setUsuarios = new HashSet<>(usuarios.values());
       return setUsuarios;
    }
    
    /**
     * Devuelve todos los grupos de la red social
     */
    public Set<Grupo> getGrupos(){
        Set<Grupo> setGrupos = new HashSet<>(grupos.values());
        return setGrupos;
    }

    /**
     * Devuelve un mapa ordenado por grupo alfabéticamente 
     * para cada grupo se asocia un conjunto de objetos usuario 
     * de de ese grupo de genero 'm' ordenado alfabéticamente por nombreCompleto
     */
    public Map<Grupo, Set<Usuario>> usuariosMujerGrupos(){
        Map<Grupo, Set<Usuario>> mapaGrupos = null;
        for (Grupo grupo : getGrupos()) {
            if(mapaGrupos == null)
                mapaGrupos = new TreeMap<>();
            mapaGrupos.put(grupo, new TreeSet<Usuario>());
        }
        for (Usuario usuario : getUsuarios()) {
            if(usuario.getGenero() == 'm')
                for (Grupo grupo : usuario.getGrupos()) {
                    mapaGrupos.get(grupo).add(usuario);
                }
        }
        return mapaGrupos;
    }        
    
    public static void main(String[] args) {
        Feisbu fb = new Feisbu();
        Usuario nico = fb.buscaUsuario("nico");
        Usuario antonia = fb.buscaUsuario("antonia");
        Usuario ana = fb.buscaUsuario("ana");
        Usuario amalia = fb.buscaUsuario("amalia");
        Usuario manuela = fb.buscaUsuario("manuela");

    }
}
