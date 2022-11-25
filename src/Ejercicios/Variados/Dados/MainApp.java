package Ejercicios.Variados.Dados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {

	private static JuegoDados juegoDados;

	public static void main(String[] args) {
		int numeroJugadores = leerNumeroJugadores();
		boolean numJugadoresValido = false;
		do {
			try {
				crearJuego(numeroJugadores);
				numJugadoresValido = true;
			} catch (IllegalArgumentException e) {
				numeroJugadores = leerNumeroJugadores();
			}
		} while (!numJugadoresValido);
		crearJugadores(numeroJugadores);
		juegoDados.jugar();
		System.out.println(juegoDados.toString());
	}

	private static void crearJuego(int numJugadores) {
		juegoDados = new JuegoDados(numJugadores);
	}

	private static int leerNumeroJugadores() {
		int numJugadores = 0;
		System.out.print("Introduce la cantidad (entre 2 y 10) de jugadores: ");
		numJugadores = Entrada.entero();
		return numJugadores;
	}

	private static void crearJugadores(int cantidadJugadores) {
		for (int i = 0; i < cantidadJugadores; i++) {
			System.out.printf("El jugador %d ", (i + 1));
			juegoDados.setJugador(i, leerNombreJugador());
		}
	}

	private static String leerNombreJugador() {
		String nombre;

		System.out.print("se llamara: ");
		nombre = Entrada.cadena();
		while (nombre.equals(null) || nombre.isBlank()) {
			System.out.printf("%nERROR: El nombre no puede estar vacio ni ser nulo. Vuelve a introducirlo: ");
			nombre = Entrada.cadena();
		}
		return nombre;
	}

}
