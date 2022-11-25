package EjerciciosVariados.BarajaCartas;

import java.util.Objects;

public class Carta {

	private int numero;
	private static final String[] NUMEROS_STR = { "As", "Sota", "Caballo", "Rey" };
	private Palo palo;

	public Carta(int numero, Palo palo) {
		setNumero(numero);
		setPalo(palo);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero < 1 || numero > 12) {
			throw new IllegalArgumentException("ERROR: El numero debe estar entre 1 y 12.");
		}
		this.numero = numero;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		if (palo.equals(null)) {
			throw new NullPointerException("ERROR: El palo no puede ser nulo.");
		}
		this.palo = palo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero, palo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return numero == other.numero && palo == other.palo;
	}

	@Override
	public String toString() {

		switch (getNumero()) {
		case 1: {
			return "el " + NUMEROS_STR[0] + " de " + getPalo().toString();
		}
		case 10: {
			return "la " + NUMEROS_STR[1] + " de " + getPalo().toString();
		}
		case 11: {
			return "el " + NUMEROS_STR[2] + " de " + getPalo().toString();
		}
		case 12: {
			return "el " + NUMEROS_STR[3] + " de " + getPalo().toString();
		}
		default:
			return "el " + getNumero() + " de " + getPalo().toString();
		}

	}

}
