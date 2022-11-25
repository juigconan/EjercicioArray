package EjerciciosVariados.BarajaCartas;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		int intercambios;
		
		do {
			do {
				System.out.printf("¿Cuantas cartas deseas intercambiar? (Introduce un 0 para cerrar el programa)");
				intercambios = Entrada.entero();
			} while (intercambios < 0);
			baraja.baraja(intercambios);
		} while (intercambios != 0);
		
		System.out.print("¡Hasta luego!");

	}

}
