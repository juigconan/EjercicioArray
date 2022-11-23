package Ejercicos;

import org.iesalandalus.programacion.utilidades.Entrada;

public class IMC {

	private static Sujeto crearSujeto() {
		String nombre;
		int peso;
		int altura;
		System.out.print("Introduce un nombre: ");
		nombre = Entrada.cadena();
		System.out.printf("Introduce un peso en Kg: ");
		peso = Entrada.entero();
		System.out.printf("Introduce una altura en cm: ");
		altura = Entrada.entero();
		return new Sujeto(nombre, peso, altura);
	}

	private static double calcularMedia(Sujeto[] arraySujeto) {
		double media = 0;
		for (int i = 0; i < arraySujeto.length; i++) {
			arraySujeto[i] = crearSujeto();
			media += arraySujeto[i].getImc();
		}

		media /= arraySujeto.length;
		return media;
	}

	public static void main(String[] args) {
		Sujeto[] arraySujeto;
		int cantidad;
		double mayorImc = 0;
		double menorImc = 0;
		double media = 0;
		int contEncimaMedia = 0;
		int contDebajoMedia = 0;
		Sujeto sujetoEncimaMedia = new Sujeto();
		Sujeto sujetoDebajoMedia = new Sujeto();
		sujetoEncimaMedia.setImc(0);
		sujetoDebajoMedia.setImc(100);

		do {
			System.out.print("Sujetos a introducir (minimo 2): ");
			cantidad = Entrada.entero();
		} while (cantidad < 2);

		arraySujeto = new Sujeto[cantidad];

		media = calcularMedia(arraySujeto);

		for (int i = 0; i < arraySujeto.length; i++) {
			if (arraySujeto[i].getImc() < media) {
				contDebajoMedia++;
			}
			// si es igual a la media consideramos que esta por debajo
			if (arraySujeto[i].getImc() >= media) {
				contEncimaMedia++;
			}
			if (arraySujeto[i].getImc() < sujetoDebajoMedia.getImc()) {
				sujetoDebajoMedia = new Sujeto(arraySujeto[i]);
				menorImc = sujetoDebajoMedia.getImc();
			}
			if (arraySujeto[i].getImc() > sujetoEncimaMedia.getImc()) {
				sujetoEncimaMedia = new Sujeto(arraySujeto[i]);
				mayorImc = sujetoEncimaMedia.getImc();
			}
		}

		System.out.printf(
				"Media: %2.2f%%, por encima de la media: %d, por debajo de la media: %d, mayorImc: %2.2f%%, menorImc %2.2f%%, nombre Mayor: %s, nombre menor: %s",
				media, contEncimaMedia, contDebajoMedia, mayorImc, menorImc, sujetoEncimaMedia.getNombre(),
				sujetoDebajoMedia.getNombre());
	}

}
