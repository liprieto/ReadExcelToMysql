package com.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Altas {

    @Id
    private Integer altasId;

    private String nombre;

    private String apellido;

    private Integer cuit;

	

	public Altas(Integer altasId, String nombre, String apellido, Integer cuit) {
		super();
		this.altasId = altasId;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuit = cuit;
	}

	public Altas() {
		// TODO Esbozo de constructor generado automáticamente
	}

	public Integer getAltasId() {
		return altasId;
	}

	public void setAltasId(Integer altasId) {
		this.altasId = altasId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getCuit() {
		return cuit;
	}

	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}
    
    
    

}