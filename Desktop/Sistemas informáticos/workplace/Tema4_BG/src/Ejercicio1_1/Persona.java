package Ejercicio1_1;

public class Persona {

	private String nombre;
	private int edad;
	private float altura;
	private String ocupacion;

	public Persona(String nombre) {
		this.nombre=nombre;
	}
	
	String getNombre(){
		return nombre;
	}
	
	void setNombre(String nombre){
		this.nombre=nombre;
	}
}
