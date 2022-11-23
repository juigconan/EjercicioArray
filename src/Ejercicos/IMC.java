package Ejercicos;
import org.iesalandalus.programacion.utilidades.Entrada;

public class IMC {
	
	public static Sujeto crearSujeto() {
		String nombre;
		int peso;
		int altura;
		System.out.print("Introduce un nombre: ");
		nombre = Entrada.cadena();
		System.out.printf("%n Introduce un peso en Kg: ");
		peso = Entrada.entero();
		System.out.printf("%n Introduce una altura en cm: ");
		altura = Entrada.entero();
		return new Sujeto(nombre, peso, altura);
	}

	public static void main(String[] args) {
		Sujeto[] arraySujeto;
		int cantidad;
		do {
			System.out.print("Sujetos a introducir (minimo 2): ");
			cantidad = Entrada.entero();
		} while (cantidad < 2);
		
		arraySujeto = new Sujeto[cantidad];
		
		for (int i = 0; i < arraySujeto.length; i++) {
			crearSujeto();
		}
	}
	
}
