package Ejercicios;
import org.iesalandalus.programacion.utilidades.Entrada;

public class MayorYMenor {

	public static void main(String[] args) {

		int[] arrayNumeros;
		int cantidadACrear, aux;
		do {
			System.out.println("Introduce cuantos numeros enteros desea crear");
			cantidadACrear = Entrada.entero();
		} while (cantidadACrear < 2);

		arrayNumeros = new int[cantidadACrear];

		for (int i = 0; i < arrayNumeros.length; i++) {
			arrayNumeros[i] = (int) (Math.random() * 1000);
		}
		/*
		 * Los he ordenado por un pequeño fallo de comprension lectora for (int i = 0; i
		 * < arrayNumeros.length; i++) { for (int j = 1; j < arrayNumeros.length; j++) {
		 * if (arrayNumeros[j - 1] < arrayNumeros[j]) { aux = arrayNumeros[j - 1];
		 * arrayNumeros[j - 1] = arrayNumeros[j]; arrayNumeros[j] = aux; } }
		 * 
		 * } for (int i = 0; i < arrayNumeros.length; i++) {
		 * System.out.println(arrayNumeros[i]); }
		 */
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.println(arrayNumeros[i]);
		}
		int posMayor = 0;
		int posMenor = 0;
		int masGrande = arrayNumeros[0];
		int masPequenio = arrayNumeros[0];
		for (int i = 0; i < arrayNumeros.length; i++) {
			if (arrayNumeros[i] > masGrande) {
				masGrande = arrayNumeros[i];
				posMayor = i;
			}
			if (arrayNumeros[i] < masPequenio) {
				masPequenio = arrayNumeros[i];
				posMenor = i;
			}
		}
		System.out.println("Mayor: " + masGrande + " posicion: " + (posMayor + 1) + " Menor:" + masPequenio
				+ " posicon: " + (posMenor + 1));
	}
}
