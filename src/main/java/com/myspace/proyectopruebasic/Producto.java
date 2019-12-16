package com.myspace.proyectopruebasic;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Producto")
public class Producto implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Id")
	private int id;
	@org.kie.api.definition.type.Label("Descripción")
	private java.lang.String descripcion;
	@org.kie.api.definition.type.Label("Precio")
	private Double precio;

	public Producto() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public java.lang.String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(java.lang.String descripcion) {
		this.descripcion = descripcion;
	}

	public java.lang.Double getPrecio() {
		return this.precio;
	}

	public void setPrecio(java.lang.Double precio) {
		this.precio = precio;
	}

	public Producto(int id, java.lang.String descripcion,
			java.lang.Double precio) {
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
	}

}