package Ejercicios.Variados.Dados;

import java.util.Random;

public class Dado {
	
	private static Random generador = new Random();
	
	private Dado() {
		
	}
	
	public static int lanzar() {
		return generador.nextInt(1,7);
	}

}
