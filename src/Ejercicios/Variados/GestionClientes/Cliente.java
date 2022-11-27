package Ejercicios.Variados.GestionClientes;

import java.util.Objects;

public class Cliente {
	
	private DatosContacto datosContacto;
	private DatosPersonales datosPersonales;
	
	public Cliente(DatosPersonales datosPersonales, DatosContacto datosContacto) {
		setDatosPersonales(datosPersonales);
		setDatosContacto(datosContacto);
	}

	public Cliente(Cliente cliente) {
		setDatosPersonales(cliente.getDatosPersonales());
		setDatosContacto(cliente.getDatosContacto());
	}

	private void setDatosPersonales(DatosPersonales datosPersonales) {
		this.datosPersonales = new DatosPersonales(datosPersonales);
	}

	public void setDatosContacto(DatosContacto datosContacto) {
		this.datosContacto = new DatosContacto(datosContacto);
	}
	
	public DatosContacto getDatosContacto() {
		return new DatosContacto(datosContacto);
	}

	public DatosPersonales getDatosPersonales() {
		return new DatosPersonales(datosPersonales);
	}

	@Override
	public int hashCode() {
		return Objects.hash(datosContacto, datosPersonales);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(datosPersonales.getDni(), other.datosPersonales.getDni());
	}

	@Override
	public String toString() {
		return datosPersonales.toString() + datosContacto.toString();
	}

}
