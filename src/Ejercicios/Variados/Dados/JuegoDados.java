package Ejercicios.Variados.Dados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class JuegoDados {

	private static final int MAX_JUGADORES = 10;
	private static final int MIN_JUGADORES = 2;
	private Jugador[] jugadores;

	public JuegoDados(int numeroJugadores) {
		comprobarNumeroJugadoresValido(numeroJugadores);
		jugadores = new Jugador[numeroJugadores];
	}

	private void comprobarNumeroJugadoresValido(int numeroJugadores) {
		if (numeroJugadores < MIN_JUGADORES || numeroJugadores > MAX_JUGADORES) {
			throw new IllegalArgumentException("ERROR: El número de jugadores no es valido");
		}
	}

	public Jugador getJugador(int posicion) {
		return jugadores[posicion];
	}

	private void comprobarNumeroJugadorValido(int numeroJugador) {
		if (numeroJugador < 0 || numeroJugador > jugadores.length) {
			throw new IllegalArgumentException("ERROR: El número del jugador no es valido");
		}
	}

	public void setJugador(int posicion, String nombre) {
		comprobarNumeroJugadorValido(posicion);
		this.jugadores[posicion] = new Jugador(nombre);
	}

	public void jugar() {
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i].jugar();
		}
	}

	public int getPuntuacionGanadora() {
		int puntuacionGanadora = 0;
		for (int i = 0; i < jugadores.length; i++) {
			if (jugadores[i].getPuntuacionTotal() > puntuacionGanadora) {
				puntuacionGanadora = jugadores[i].getPuntuacionTotal();
			}
		}
		return puntuacionGanadora;
	}

	public Jugador[] getGanadores() {
		Jugador[] ganadores;
		int numeroGanadores = 0;
		int indiceGanadores = 0;
		for (int i = 0; i < jugadores.length; i++) {
			if (jugadores[i].getPuntuacionTotal() == getPuntuacionGanadora()) {
				numeroGanadores++;
			}
		}
		ganadores = new Jugador[numeroGanadores];
		for (int i = 0; i < jugadores.length; i++) {
			if (jugadores[i].getPuntuacionTotal() == getPuntuacionGanadora()) {
				ganadores[indiceGanadores] = jugadores[i];
				indiceGanadores++;
			}
		}

		return ganadores;
	}

	@Override
	public String toString() {
		String cadenaAMostrar;
		StringBuilder sb = new StringBuilder("Han participado: ");
		for (int i = 0; i < jugadores.length; i++) {
			sb.append(jugadores[i].toString() + ",");
			sb.append(System.lineSeparator());
		}
		sb.append("la puntuacion ganadora ha sido: " + getPuntuacionGanadora() + " y el/los ganador/es son: ");
		for (int i = 0; i < getGanadores().length; i++) {
			if (getGanadores().length == 1) {
				sb.append(getGanadores()[i].getNombre());
			} else {
				sb.append(getGanadores()[i].getNombre() + ", ");
			}

		}
		cadenaAMostrar = sb.toString();
		return cadenaAMostrar;
	}

}
