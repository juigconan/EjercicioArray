package Ejercicios.Variados.GestionClientes;

import java.util.Objects;

public class DatosContacto {

	private static final String ER_TELEFONO = "\\d{9}";
	private static final String ER_CORREO = "([a-zA-Z0-9_-])+@([a-zA-Z0-9-])+\\\\.([a-zA-Z])+";
	private DireccionPostal direccionPostal;
	private String telefono;
	private String correo;

	public DatosContacto(String telefono, String correo, DireccionPostal direccionPostal) {
		setTelefono(telefono);
		setCorreo(correo);
		setDireccionPostal(direccionPostal);
	}
	
	public DatosContacto(DatosContacto datosContacto) {
		setTelefono(datosContacto.getTelefono());
		setCorreo(datosContacto.getCorreo());
		setDireccionPostal(new DireccionPostal(datosContacto.getDireccionPostal()));
	}

	public DireccionPostal getDireccionPostal() {
		return direccionPostal;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setDireccionPostal(DireccionPostal direccionPostal) {
		this.direccionPostal = direccionPostal;
	}

	public void setTelefono(String telefono) {
		if (telefono.matches(ER_TELEFONO)) {
			this.telefono = telefono;
		}else {
			throw new IllegalArgumentException("ERROR: Telefono no válido.");
		}
	}

	public void setCorreo(String correo) {
		if (correo.matches(ER_CORREO)) {
			this.correo = correo;
		}else {
			throw new IllegalArgumentException("ERROR: Correo no válido");
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(correo, direccionPostal, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DatosContacto other = (DatosContacto) obj;
		return Objects.equals(correo, other.correo) && Objects.equals(direccionPostal, other.direccionPostal)
				&& Objects.equals(telefono, other.telefono);
	}

	@Override
	public String toString() {
		return  direccionPostal.toString() + ", telefono: " + telefono + ", correo: " + correo;
	}
	
	

}
