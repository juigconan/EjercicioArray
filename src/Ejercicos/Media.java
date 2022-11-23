package Ejercicos;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Media {
	/*
	 * Escribir un programa java que lea por teclado la cantidad de números a
	 * generar, que deberá ser al menos 3. Cree un array de dicho tamaño y los
	 * genere aleatoriamente entre 0 y 100. Debe calcular la media de los mismos
	 * como entero y contar la cantidad de números que hay por encima, por debajo y
	 * los que son iguales a la media. También debe anotar las posiciones en las que
	 * se encuentran los números iguales a la media. Para ello ve almacenando sus
	 * posiciones en un StringBuffer separados por comas y lo muestre sólo en el
	 * caso que haya números iguales. Si solo hay uno no debe mostrar la coma final.
	 */

	public static void main(String[] args) {

		int[] arrayNumeros;
		int cantidadACrear;
		int suma = 0;
		int media = 0;
		int contMenores = 0;
		int contMayores = 0;
		int contIguales = 0;
		StringBuffer cadenaIguales = new StringBuffer();

		do {
			System.out.print("Introduce cuantos numeros enteros desea crear");
			cantidadACrear = Entrada.entero();
		} while (cantidadACrear < 3);

		arrayNumeros = new int[cantidadACrear];

		for (int i = 0; i < arrayNumeros.length; i++) {
			arrayNumeros[i] = (int) (Math.random() * 100);
		}

		for (int i = 0; i < arrayNumeros.length; i++) {
			suma += arrayNumeros[i];
		}

		media = (int) (suma / cantidadACrear);
		
		for(int i = 0; i < arrayNumeros.length; i++) {
			System.out.println(arrayNumeros[i]);
		}

		for (int i = 0; i < arrayNumeros.length; i++) {
			if (arrayNumeros[i] < media) {
				contMenores++;
			}else if (arrayNumeros[i] > media) {
				contMayores++;
			} else {
				contIguales++;
				cadenaIguales.append(" " + i);
			}
		}

		System.out.printf("La media es de %d%n", media);
		System.out.printf("Hay %d numeros mayores%n", contMayores);
		System.out.printf("Hay %d numeros menores%n", contMenores);
		System.out.printf("Hay %d numeros iguales%n", contIguales);
		if(!cadenaIguales.isEmpty()) {
			System.out.printf("Que se encuentran en las posiciones:" + cadenaIguales);
		}

	}
}
