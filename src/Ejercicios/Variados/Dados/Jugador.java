package Ejercicios.Variados.Dados;

public class Jugador {
	
	private static final int NUM_TIRADAS = 5;
	private String nombre;
	private int[] puntuacionTiradas = new int[NUM_TIRADAS];
	
	public Jugador(String nombre) {
		setNombre(nombre);	
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		if (nombre == null) {
			throw new NullPointerException("ERROR: El nombre no puede ser nulo");
		}
		this.nombre = nombre;
	}
	
	public void jugar() {
		for (int i = 0; i < puntuacionTiradas.length; i++) {
			puntuacionTiradas[i] = Dado.lanzar();
		}
	}
	
	public int getPuntuacionTotal() {
		int puntuacionTotal = 0;
		for (int i = 0; i < puntuacionTiradas.length; i++) {
			puntuacionTotal += puntuacionTiradas[i];
		}
		return puntuacionTotal;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(getNombre()+" cuyas tiradas son:");
		for (int i = 0; i < puntuacionTiradas.length; i++) {
			sb.append(" Tirada " + (i + 1) + " = " + puntuacionTiradas[i]);
		}
		sb.append(" y cuya puntuacion total es: " + getPuntuacionTotal());
		String cadenaAMostrar = sb.toString();
		return  cadenaAMostrar;
	}
	
}
