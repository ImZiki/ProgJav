package ud08.examen.Trim2ev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Recommendator {

	/**
	 * Método masAmigosMujer
	 * 
	 * Devuelve el usuario que tiene más amigos mujer
	 * En caso de empate, devuelve el usuario cuya fecha de registro es más antigua.
	 * En el caso de que sigan empatando, devuelve el usuario cuyo
	 * nombre completo está antes alfabéticamente 
	 * Si no existe tal usuario, devuelve null
	 */
    
	 public static Usuario masAmigosMujer(Set<Usuario> usuarios){
		Usuario usuario = null;
		List<Usuario> masAmigos = new ArrayList<>(usuarios);
		Collections.sort(masAmigos, new AmigosComparator());
		if (!masAmigos.isEmpty())
			usuario = masAmigos.get(0);
		return usuario;
	 }
     
	/**
	 * Método puntuacionAmistad
	 * 
	 * Devuelve un entero que es la puntuación de amistad entre los dos 
	 * usuarios pasados como parámetro.
	 * La puntuación de amistad entre dos usuarios está basada
	 * en la cantidad de amigos en comun que tienen dichos usuarios.
	 * La puntuación de amistad de un usuario consigo mismo es 0
	 */

	 public static int puntuacionAmistad(Usuario u1, Usuario u2){
		int puntuacion = 0;
		if(u1 != null && u2 != null && u1 != u2){
			Set<Usuario> comun = new HashSet<>(u1.getAmigos());
			comun.retainAll(u2.getAmigos());
			puntuacion = comun.size();
		}
		return puntuacion;
	 }


	/**
	 * Método recomendarMasAmigosComun
	 * 
	 * Recomendar un amigo del conjunto de usuarios pasado
	 * como parámetro, al usuario pasado como parámetro.
	 * Se recomendará como amigo a aquel usuario con el que se 
	 * tenga la mayor cantidad de amigos en comun.
	 * Por supuesto, el usuario a recomendar no puede ser amigo ya, 
	 * ni puede ser el usuario al cual se le está recomendando un amigo.
	 */

	 public static Usuario recomendarMasAmigosComun(Usuario u, Set<Usuario> usuarios){
		int max = -1;
		Usuario posibleAmigo = null;
		for (Usuario a : usuarios) {
			if (!a.equals(u)&& !u.esAmigo(a)){
				int p = puntuacionAmistad(u, a);
				if(p>max){
					max = p;
					posibleAmigo = a;
				}
			}
		}
		return posibleAmigo;
	 }
}