package Ejercicios.Variados.GestionClientes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class DatosPersonales {

	private static final String ER_DNI = "\\d{8}[^Uu—ÒIiOo]";
	private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/uuuu");
	private String nombre;
	private String apellidos;
	private String dni;
	private LocalDate fechaNacimiento;

	public DatosPersonales(String nombre, String apellidos, String dni, LocalDate fechaNacimiento) {
		setNombre(nombre);
		setApellidos(apellidos);
		setDni(dni);
		setFechaNacimiento(fechaNacimiento);
	}

	public DatosPersonales(String nombre, String apellidos, String dni, String fechaNacimiento) {
		setNombre(nombre);
		setApellidos(apellidos);
		setDni(dni);
		setFechaNacimiento(fechaNacimiento);
	}
	
	public DatosPersonales(DatosPersonales datosPersonales) {
		setNombre(datosPersonales.getNombre());
		setApellidos(datosPersonales.getApellidos());
		setDni(datosPersonales.getDni());
		setFechaNacimiento(datosPersonales.getFechaNacimiento());
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	private void setDni(String dni) {
		if (dni.matches(ER_DNI)) {
			this.dni = dni;
		} else {
			throw new IllegalArgumentException("ERROR: El DNI no es v·lido.");
		}
	}

	private void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento.format(FORMATO_FECHA));
	}

	private void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento, FORMATO_FECHA);
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDni() {
		return dni;
	}

	public LocalDate getFechaNacimiento() {
		//Creo que asi se crea una fecha nueva, intentando evitar aliasing
		LocalDate fechaNacimiento = LocalDate.parse(this.fechaNacimiento.toString());
		return fechaNacimiento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, dni, fechaNacimiento, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DatosPersonales other = (DatosPersonales) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(dni, other.dni)
				&& Objects.equals(fechaNacimiento, other.fechaNacimiento) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "nombre: " + nombre + ", apellidos: " + apellidos + ", dni: " + dni + ", fechaNacimiento: "
				+ fechaNacimiento + ", ";
	}

}
