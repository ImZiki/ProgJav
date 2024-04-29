import java.util.Map;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;
import java.util.List;


public class GestorAparcabicicletas {
    private Map<String, List<Aparcabicicletas>> informeBarrio;
    private String nombre;

    public GestorAparcabicicletas(String nombre){
        this.nombre = nombre;
        informeBarrio = new TreeMap<>();
    }

    public void importarDatos(String nombreArchivo) throws IOException, FileNotFoundException {
        BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
        String fila;

        while ((fila = lector.readLine()) != null) {
            String[] datos = fila.split(";");
            if (datos[0].equals("FIN"))
                break;
            Aparcabicicletas aparcabicicletas = introducirDatos(datos);

            informeBarrio.putIfAbsent(aparcabicicletas.getBarrio(), new ArrayList<Aparcabicicletas>());
            informeBarrio.get(aparcabicicletas.getBarrio()).add(aparcabicicletas);
        }
        lector.close();
    }

    private Aparcabicicletas introducirDatos(String[] datos){
        double x = Double.parseDouble(datos[0]);
        double y = Double.parseDouble(datos[1]);
        int id = Integer.parseInt(datos[2]);
        String barrio = datos[3];
        int aros = Integer.parseInt(datos[4]);
        boolean instalado = datos[5].equals("SI") ? true : false;
        Aparcabicicletas aparcaActual = new Aparcabicicletas(x, y, id, barrio, aros, instalado);
        
        return aparcaActual;
    }

    public void muestraBarrios(){
        Iterator<String> it = informeBarrio.keySet().iterator();
        System.out.println("Ayuntamiento de " + this.nombre);
        while(it.hasNext()){
            String barrio = it.next();
            List<Aparcabicicletas> listaAparcabicicletas = informeBarrio.get(barrio);
            System.out.println("--------------------------------------------");
            System.out.println("Barrio: " + barrio);
            System.out.println("Cantidad de aparcabicicletas: " + listaAparcabicicletas.size());
            System.out.println("Cantidad de aparcabicicletas instalados: " + cuentaInstalados(listaAparcabicicletas));
            for (Aparcabicicletas aparcabicicletas : listaAparcabicicletas) {
                System.out.println("Aparcabicicletas id: " + aparcabicicletas.getId());
                System.out.println("Coordenada X: " + aparcabicicletas.getX());
                System.out.println("Coordenada Y: " + aparcabicicletas.getY());
                System.out.println("Aros: " + aparcabicicletas.getAros());
                System.out.println("Instalado: " + (aparcabicicletas.isInstalado() ? "SI" : "NO"));

            }
            System.out.println("--------------------------------------------");
        }
    }

    private Set<Aparcabicicletas> obtenerConjunto(){
        Set<Aparcabicicletas> informeId = new TreeSet<>();
        Iterator<List<Aparcabicicletas>> it = informeBarrio.values().iterator();
        while (it.hasNext()) {
            informeId.addAll(it.next());
        }
        return informeId;
    }

    public void muestraAparcabicicletas(){
        System.out.println("Ayuntamiento de " + nombre);
        Set<Aparcabicicletas> informeId = obtenerConjunto();
        for (Aparcabicicletas aparcabicicletas : informeId) {
            System.out.println("--------------------------------------------");
            System.out.println("Aparcabicicletas id: " + aparcabicicletas.getId());
            System.out.println("Coordenada X: " + aparcabicicletas.getX());
            System.out.println("Coordenada Y: " + aparcabicicletas.getY());
            System.out.println("Aros: " + aparcabicicletas.getAros());
            System.out.println("Instalado: " + (aparcabicicletas.isInstalado() ? "SI" : "NO"));
            System.out.println("--------------------------------------------");

        }
    }
    
    private int cuentaInstalados(List<Aparcabicicletas> lista){
        int contador = 0;
        for (Aparcabicicletas aparcabicicletas : lista) {
            if (aparcabicicletas.isInstalado())
                contador++;
        }
        return contador;
    }

    public static void main(String[] args) throws IOException, FileNotFoundException {
        GestorAparcabicicletas gestor = new GestorAparcabicicletas("Sevilla");
        try {
            gestor.importarDatos("test.txt");
            gestor.muestraBarrios();
            gestor.muestraAparcabicicletas();
        } catch (FileNotFoundException e1) {
            System.out.println("Fichero no encontrado");
        }
        

    }
}