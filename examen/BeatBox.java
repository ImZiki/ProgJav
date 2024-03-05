package ud08.examen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BeatBox {
    private List<Pista> listaCanciones;
    private int numeroPistas;

    public BeatBox(){
        listaCanciones = new ArrayList<>();
        numeroPistas = 0;
    }
    public void agregarPista(Pista p){
        if (!listaCanciones.contains(p))
            listaCanciones.add(p);
            numeroPistas++;
    }

    public List<Pista> porArtista(Artista a){
        List<Pista> listadoPorArtista = new ArrayList<>();
        for (Pista pista : listaCanciones) {
            if(pista.getArtista().equals(a))
                listadoPorArtista.add(pista);

        }
        if(listadoPorArtista.isEmpty())
            return null;
        else
            return listadoPorArtista;
    }
    public List<Pista> porCancion(String palabraClave){
        List<Pista> listadoPorCancion = new ArrayList<>();
        for (Pista pista : listaCanciones) {
            if(pista.getNombreCancion().contains(palabraClave))
                listadoPorCancion.add(pista);
        }
        if(listadoPorCancion.isEmpty())
            return null;
        else
            return listadoPorCancion;
    }
    public int numPistas(){
        return numeroPistas;
    }

    public Pista hit(){
        List<Pista> listaOrdenada = new LinkedList<>(listaCanciones);
        Collections.sort(listaOrdenada);
        return listaOrdenada.get(0);
    }
    public Map<Artista, List<Pista>> cancionesArtistas(){
        Map<Artista, List<Pista>> mapaCanciones = new TreeMap<>();
        for (Pista pista : listaCanciones) {
            Artista artista = pista.getArtista();
            mapaCanciones.putIfAbsent(artista, new ArrayList<>());
            mapaCanciones.get(artista).add(pista);
        }
        return mapaCanciones;
    }
    public List<Pista> playList(int duracionMaxima){
        List<Pista> playList = new LinkedList<>();
        List<Pista> listaOrdenada = new LinkedList<>(listaCanciones);
        Collections.sort(listaOrdenada);
        int duracionActual = duracionMaxima;
        for (Pista pista : listaOrdenada) {
            if(duracionActual > pista.getDuracion())
                playList.add(pista);
        }
    }
    
    public static void main(String[] args) {
        BeatBox b1 = new BeatBox();
        Artista shakira = new Artista("Shakira");
        Artista miley = new Artista("Miley", "Cyrus");
        Artista karol = new Artista("Karol", "G");
        Artista quevedo = new Artista("Quevedo");
        Artista miko = new Artista("Young", "Miko");
        Pista p1 = new Pista("Shakira: Bzrp music sessions, Vol 53", shakira, 180);
        Pista p2 = new Pista("Flowers", miley, 190);
        Pista p3 = new Pista("TQG", karol, 185);
        Pista p4 = new Pista("Te Felicito", shakira, 175);
        Pista p5 = new Pista("Quevedo: Bzrp music sessions, Vol 52", quevedo, 183);
        Pista p6 = new Pista("Young Miko: Bzrp music sessions, Vol 58", miko, 181);

        b1.agregarPista(p1);
        System.out.println("+Agregando pista: " + p1);
        b1.agregarPista(p2);
        System.out.println("+Agregando pista: " + p2);
        b1.agregarPista(p3);
        System.out.println("+Agregando pista: " + p3);
        b1.agregarPista(p4);
        System.out.println("+Agregando pista: " + p4);
        b1.agregarPista(p5);
        System.out.println("+Agregando pista: " + p5);
        b1.agregarPista(p6);
        System.out.println("+Agregando pista: " + p6);
        System.out.println();

        p1.play();
        System.out.println("->Play: " + p1);
        p2.play();
        System.out.println("->Play: " + p2);
        p3.play();
        System.out.println("->Play: " + p3);
        p1.play();
        System.out.println("->Play: " + p1);
        p2.play();
        System.out.println("->Play: " + p2);
        p4.play();
        System.out.println("->Play: " + p4);
        p2.play();
        System.out.println("->Play: " + p2);
        p4.play();
        System.out.println("->Play: " + p4);
        System.out.println();

        System.out.println("#Hit del momento: " + b1.hit());
        System.out.println("***** Listado por artista: " + shakira + "*****");
        List<Pista> listaArtista = b1.porArtista(shakira);
        for (Pista pista : listaArtista) {
            System.out.println(pista);
        }
        System.out.println("***** Listado que incluye: Bzrp music sessions *****");
        List<Pista> listaCancion = b1.porCancion("Bzrp music sessions");
        for (Pista pista : listaCancion) {
            System.out.println(pista);
        }
        p2.play();
        System.out.println("->Play: " + p2);
        System.out.println("#Hit del momento: " + b1.hit());
        
        Map<Artista, List<Pista>> canciones = b1.cancionesArtistas();
        canciones.forEach((clave, valor) -> System.out.println(clave + ":" + valor));
    }
}
