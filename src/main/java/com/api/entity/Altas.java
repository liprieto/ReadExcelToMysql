package com.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Altas {
	
	@Id
    private int id;
    private String motivo;
    private String operador;
    private String filial;
    private String delegacion;
    private String pos;
    private String codprestador;
    private String nombre;
    private String idprestador;
    private String cuit;
    private String calle;
    private String numero;
    private String cp;
    private String localidad;
    private String provincia;
    private String telefono;
    
    
	public Altas(String motivo, String operador, String filial, String delegacion, String pos, String codprestador, String nombre, String idprestador, String cuit, String calle, String numero, String cp, String localidad, String provincia, String telefono) {
		super();
		this.motivo = motivo;
		this.operador = operador;
		this.filial = filial;
		this.delegacion = delegacion;
		this.pos = pos;
		this.codprestador = codprestador;
		this.nombre = nombre;
		this.idprestador = idprestador;
		this.cuit = cuit;
		this.calle = calle;
		this.numero = numero;
		this.cp = cp;
		this.localidad = localidad;
		this.provincia = provincia;
		this.telefono = telefono;
		
		
		
	}


	public String getMotivo() {
		return motivo;
	}


	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}


	public String getOperador() {
		return operador;
	}


	public void setOperador(String operador) {
		this.operador = operador;
	}


	public String getFilial() {
		return filial;
	}


	public void setFilial(String filial) {
		this.filial = filial;
	}


	public String getDelegacion() {
		return delegacion;
	}


	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}


	public String getPos() {
		return pos;
	}


	public void setPos(String pos) {
		this.pos = pos;
	}


	public String getCodprestador() {
		return codprestador;
	}


	public void setCodprestador(String codprestador) {
		this.codprestador = codprestador;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getIdprestador() {
		return idprestador;
	}


	public void setIdprestador(String idprestador) {
		this.idprestador = idprestador;
	}


	public String getCuit() {
		return cuit;
	}


	public void setCuit(String cuit) {
		this.cuit = cuit;
	}


	public String getCalle() {
		return calle;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getCp() {
		return cp;
	}


	public void setCp(String cp) {
		this.cp = cp;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
    
	
    
	


    
    
    

}