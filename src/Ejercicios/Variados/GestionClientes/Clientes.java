package Ejercicios.Variados.GestionClientes;


public class Clientes {
	
	private static final int MAX_CLIENTES = 20;
	private Cliente[] coleccionClientes;
	private int numClientes;
	
	public Clientes () {
		coleccionClientes = new Cliente[MAX_CLIENTES];
		numClientes = 0;
	}
	
	public Clientes (Clientes clientes) {
		setClientes(clientes);
	}

	private void setClientes(Clientes clientes) {
		if(clientes == null) {
			throw new NullPointerException("Los clientes no pueden ser nulos.");
		}
		coleccionClientes = copiaProfundaClientes(clientes.coleccionClientes);
		numClientes = clientes.getNumClientes();
	}

	private Cliente[] copiaProfundaClientes(Cliente[] clientes) {
		Cliente[] copiaClientes = new Cliente[clientes.length];
		for (int i = 0; i < copiaClientes.length; i++) {
			copiaClientes[i] = new Cliente(clientes[i]);
		}
		return copiaClientes;
	}
	
	public Cliente[] getClientes() {
		return copiaProfundaClientes(coleccionClientes);
	}

	public int getNumClientes() {
		return numClientes;
	}
	
	public void insertar(Cliente cliente) {
		if(indiceNoSuperaCapacidad(getNumClientes())) {
			numClientes++;
			coleccionClientes[getNumClientes()] = cliente;
		}
		else {
			throw new IllegalArgumentException("no se pueden insertar nuevos clientes");
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
		if(indice > getNumClientes()) {
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
		int indice = buscarIndiceCliente(cliente);
		return new Cliente(coleccionClientes[indice]) ;
	}

	public void borrarCliente(Cliente cliente) {
		int indice = buscarIndiceCliente(cliente);
		desplazarUnaPosicionHaciaIzquierda(indice);
		coleccionClientes[getNumClientes()] = null;
		numClientes--;
	}

	private void desplazarUnaPosicionHaciaIzquierda(int posicion) {
		if(posicion == 0) {
			throw new IllegalArgumentException("ERROR: La posicion 0 no se puede mover a la izquierda");
		}
		if(posicion < 0) {
			throw new IllegalArgumentException("ERROR: La posicion debe ser positiva y mayor que 0");
		}
		if(!indiceNoSuperaTamano(posicion)) {
			throw new IllegalArgumentException("ERROR: La posicion debe estar dentro del array");
		}
		for (int i = posicion; i < coleccionClientes.length - 1; i++) {
			coleccionClientes[i] = coleccionClientes[i+1];
		}
	}
	
	public String[] representar() {
		String[] ClientesARepresentar = new String[getNumClientes()];
		StringBuilder sb = new StringBuilder();
	for (int i = 0; i < ClientesARepresentar.length; i++) {
		sb.append("Cliente ").append(i+1).append(": ").append(coleccionClientes[i].toString()).append("/n");
		ClientesARepresentar[i] = sb.toString();
		sb.setLength(0); //Asi vaciamos el SB
	}
		return ClientesARepresentar;
	}
	
}
