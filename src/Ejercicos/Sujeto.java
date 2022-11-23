package Ejercicos;

public class Sujeto {

	String nombre;
	int peso;
	int altura;
	double imc;
	
	public Sujeto() {
		setNombre("Nombre defecto");
		setPeso(0);
		setAltura(0);
		setImc();
	}
	
	public Sujeto(String nombre, int peso, int altura) {
		setNombre(nombre);
		setPeso(peso);
		setAltura(altura);
		setImc();
	}
	
	public Sujeto(Sujeto sujeto) {
		if(sujeto.equals(null)) {
			throw new NullPointerException("ERROR: El sujeto no puede ser nulo");
		}
		setNombre(sujeto.getNombre());
		setPeso(sujeto.getPeso());
		setAltura(sujeto.getAltura());
		setImc();
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getImc() {
		return imc;
	}

	public void setImc() {
		this.imc = 1000*(getPeso()/Math.pow(getAltura(),2));
	}
	
	//Este es para poner un imc concreto aunque solo lo utilizaremos para cambiar los sujetos por defecto
	public void setImc(int imc) {
		this.imc = imc;
	}
	
}
