package Ejercicios.Variados.GestionClientes;

import java.util.Objects;

public class DireccionPostal {

	private static final String ER_CODIGO_POSTAL = "\\d{5}";
	private String direccion;
	private String localidad;
	private String codigoPostal;

	public DireccionPostal(String direccion, String localidad, String codigoPostal) {
		setDireccion(direccion);
		setLocalidad(localidad);
		setCodigoPostal(codigoPostal);
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	private void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	private void setCodigoPostal(String codigoPostal) {
		if (codigoPostal.matches(ER_CODIGO_POSTAL)) {
			this.codigoPostal = codigoPostal;
		} else {
			throw new IllegalArgumentException("ERROR: El codigo postal no es válido.");
		}
	}

	public String getDireccion() {
		return direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoPostal, direccion, localidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DireccionPostal other = (DireccionPostal) obj;
		return Objects.equals(codigoPostal, other.codigoPostal) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(localidad, other.localidad);
	}

	@Override
	public String toString() {
		return "direccion: " + direccion + ", localidad: " + localidad + ", codigoPostal: " + codigoPostal;
	}

	
	
}
