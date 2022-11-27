package Ejercicios.Variados.GestionClientes;

import java.util.Iterator;

public class Clientes {
	
	private static final int MAX_CLIENTES = 50;
	private Cliente[] coleccionClientes;
	private int numClientes;
	
	public Clientes () {
		coleccionClientes = new Cliente[MAX_CLIENTES];
	}
	
	public Clientes (Clientes clientes) {
		setClientes(clientes);
	}

	private void setClientes(Clientes clientes) {
		
	}

	private Cliente[] copiaProfundaClientes(Cliente[] clientes) {
		Cliente[] copiaClientes = new Cliente[clientes.length];
		for (int i = 0; i < copiaClientes.length; i++) {
			copiaClientes[i] = new Cliente(clientes[i]);
		}
		return copiaClientes;
	}
	
	public Cliente[] getCliente() {
		return copiaProfundaClientes(coleccionClientes);
	}

	public int getNumClientes() {
		return numClientes;
	}
	
	public void Insertar(Cliente cliente) {
		if(indiceNoSuperaCapacidad(coleccionClientes.length)) {
			
		}
	}

	private int buscarIndiceCliente(Cliente cliente) {
		int indice = -1;
		for (int i = 0; i < coleccionClientes.length; i++) {
			if(coleccionClientes[i].equals(cliente)) {
				indice = i;
			}
		}
		if(indice == -1) {
			throw new IllegalArgumentException("No existe el cliente");
		}else {
			return indice;
		}
	}

	private boolean indiceNoSuperaTamano(int indice) {
		boolean noSuperaTamano = true;
		if(indice >= coleccionClientes.length) {
			noSuperaTamano = false;
		}
		return noSuperaTamano;
	}

	private boolean indiceNoSuperaCapacidad(int indice) {
		boolean noSuperaCapacidad = true;
		if(indice > MAX_CLIENTES) {
			noSuperaCapacidad = false;
		}
		return noSuperaCapacidad;
	}

	public Cliente buscarCliente(Cliente cliente) {
		Cliente clienteABuscar = null;
		boolean clienteExiste = false;
		for (int i = 0; i < coleccionClientes.length; i++) {
			if(coleccionClientes[i].equals(cliente)) {
				clienteExiste = true;
			}
		}
		
		return clienteABuscar;
	}

	public void borrarCliente(Cliente cliente) {
	
	}

	private void desplazarUnaPosicionHaciaIzquierda(int posicion) {
		if(posicion == 0) {
			throw new IllegalArgumentException("ERROR: La posicion 0 no se puede mover a la izquierda");
		}
		if(posicion < 0) {
			throw new IllegalArgumentException("ERROR: La posicion debe ser positiva y mayor que 0");
		}
		if(indiceNoSuperaTamano(posicion)) {
			throw new IllegalArgumentException("ERROR: La posicion debe estar dentro del array");
			
		}
		//Guardo el valor que vamos a machacar
		//Cliente clienteAux = coleccionClientes[posicion - 1];
		for (int i = posicion; i < coleccionClientes.length; i++) {
			coleccionClientes[i - 1] = coleccionClientes[i];
		}
	}
	
	public String[] representar() {
		return null;
	}
	
}
