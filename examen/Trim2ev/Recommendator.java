package ud08.examen.Trim2ev;

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
		Usuario mayor = null;
		for (Usuario usuario : usuarios) {
			mayor = usuario;
			if(usuario.amigosDeGenero('m').size() > mayor.amigosDeGenero('m').size())
				mayor = usuario;
		}
		return mayor;
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

	 //<Inserta tu código aquí>


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

	 //<Inserta tu código aquí>
}