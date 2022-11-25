package Ejercicios;
import org.iesalandalus.programacion.utilidades.Entrada;

public class LetraDni {
	
	public static void main(String[] args) {
		
		char[] letraDni = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };
		int dni;
		int resto = 23;
		System.out.println("Introduce tu numero de dni");
		dni = Entrada.entero();
		resto = dni % resto;
		System.out.println("Tu dni es: "+dni+letraDni[resto]);		
		
	}

}