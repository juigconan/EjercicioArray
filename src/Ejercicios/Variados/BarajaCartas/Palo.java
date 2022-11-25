package Ejercicios.Variados.BarajaCartas;

public enum Palo {

	OROS("Oros"), 
	COPAS("Copas"),
	ESPADAS("Espadas"),
	BASTOS("Bastos");
	
	String cadenaAMostrar;
	
	private Palo(String cadena) {
		cadenaAMostrar = cadena;
	}
	
	@Override
	public String toString() {
		return cadenaAMostrar;
	}
	
}
