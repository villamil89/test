package com.myspace.proyectopruebasic;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Cliente")
public class Cliente implements java.io.Serializable {

	static final long serialVersionUID = 1L;
	
	public static final int DEFAULT_CLIENTE = 0; 
	
	public static final int SILVER_CLIENTE = 1; 
	
	public static final int GOLD_CLIENTE = 2; 
	
	@org.kie.api.definition.type.Label(value = "Nombres")
	private java.lang.String nombre;
	@org.kie.api.definition.type.Label(value = "Estado")
	private int estado;

	public Cliente() {
	}

	public java.lang.String getNombre() {
		return this.nombre;
	}

	public void setNombre(java.lang.String nombre) {
		this.nombre = nombre;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Cliente(java.lang.String nombre, int estado) {
		this.nombre = nombre;
		this.estado = estado;
	}

}