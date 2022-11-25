package Ejercicios.Variados.BarajaCartas;

import java.util.Random;

public class Baraja {

	private static final int MAX_CARTAS = 48;
	private Carta[] cartas;
	private static Random generador = new Random();

	public Baraja() {
		cartas = new Carta[MAX_CARTAS];
		int posicion = -1;
		/*
		 * Recorremos la baraja 12 veces por palo (bucle de la j) y tantas veces como
		 * palos tenemos (bucle de la i), usando posicion para determinar en que parte
		 * del array nos encontramos, el cual inicializamos a -1 para nada más entrar en
		 * el bucle ponerlo a 0 e ir aumentandolo antes de elegir la posicion del array
		 * y no despues.
		 */
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 12; j++) {
				posicion++;
				cartas[posicion] = new Carta(j, Palo.values()[i]);
			}
		}

	}

	public Carta getCarta(int posicion) {
		return cartas[posicion];
	}

	private void comprobarPosicion(int posicion) {
		System.out.printf("la carta en la posicion %d es %s", (posicion + 1), cartas[posicion].toString());
	}

	private void intercambia(int posicionOriginal, int posicionDestino) {

		Carta cartaAuxliar;

		cartaAuxliar = cartas[posicionDestino];
		cartas[posicionDestino] = cartas[posicionOriginal];
		cartas[posicionOriginal] = cartaAuxliar;

	}

	public void baraja(int numIntercambios) {
		int posicionOriginal;
		int posicionDestino;
		Carta cartaOriginal;
		Carta cartaNueva;
		/*
		 * Usamos las variables de posicionDestino y posicionOriginal para determinar
		 * donde acabara la carta y que carta será movida respectivamente, guardamos las
		 * cartas de ambas posiciones para despues comparar si son la misma carta
		 * determinando de esta forma si se han intercambiado o no.
		 */
		for (int i = 0; i < numIntercambios; i++) {
			posicionOriginal = generador.nextInt(MAX_CARTAS);
			cartaOriginal = cartas[posicionOriginal];
			posicionDestino = generador.nextInt(MAX_CARTAS);
			cartaNueva = cartas[posicionDestino];
			System.out.printf("%nAntes del cambio ");
			comprobarPosicion(posicionOriginal);
			intercambia(posicionOriginal, posicionDestino);
			System.out.printf("%nDespues del cambio ");
			comprobarPosicion(posicionOriginal);
			if (cartaOriginal.equals(cartaNueva)) {
				System.out.printf(" con lo cual no se ha movido%n");
			} else {
				System.out.printf(" con lo cual ha cambiado%n");
			}
		}
		//Este syso es simplemente por ordenar un poco más lo mostrado por pantalla
		System.out.println();
	}

}
