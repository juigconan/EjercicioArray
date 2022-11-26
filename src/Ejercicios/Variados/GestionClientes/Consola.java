package Ejercicios.Variados.GestionClientes;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	
	private static final DireccionPostal DIRECCION_POSTAL_FICTICIA = new DireccionPostal("direccionFicticia", "localidadFicticia", "00000");
	private static final DatosContacto DATOS_CONTACTO_FICTICIOS = new DatosContacto("123456789", "correo@ficticio.com", DIRECCION_POSTAL_FICTICIA);
	
	private Consola() {
		
	}
	
	public static void mostrarMenu() {
		System.out.println("Opcion 1: Añadir clientes");
		System.out.println("Opcion 2: Borrar clientes");
		System.out.println("Opcion 3: Buscar clientes");
		System.out.println("Opcion 4: Obtener todos los clientes");
		System.out.println("Opcion 5: Listar clientes existentes");
	}
	
	public static void mostrarCabecera(String cabecera) {
		System.out.println("Menú " + cabecera);
	}
	
	public static int elegirOpcion() {
		int opcion = 0;
		do {
			System.out.print("Escoge una opcion: ");
			opcion = Entrada.entero();
		}while(opcion < 1 || opcion > 5);
		return opcion;
	}
	
	public static Cliente leerCliente() {
		//TODO: Terminar de construir
		Cliente cliente = null;
		return cliente;
	}
	
	public static Cliente leerDniCliente() {
		//TODO: Terminar de construir
		Cliente cliente = null;
		return cliente;
	}

}
