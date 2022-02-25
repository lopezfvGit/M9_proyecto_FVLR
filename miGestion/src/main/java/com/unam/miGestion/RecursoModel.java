package com.unam.miGestion;

import java.io.Serializable;

import jakarta.enterprise.inject.Model;

@Model
public class RecursoModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String rec_nombre;
	private String rec_demanda;
	private int rec_fase;
	private int rec_horas;
	private Double rec_tarifa_mensual;
	private Double rec_costo;
	private int rec_mes;
	public String getRec_nombre() {
		return rec_nombre;
	}
	public void setRec_nombre(String rec_nombre) {
		this.rec_nombre = rec_nombre;
	}
	public String getRec_demanda() {
		return rec_demanda;
	}
	public void setRec_demanda(String rec_demanda) {
		this.rec_demanda = rec_demanda;
	}
	public int getRec_fase() {
		return rec_fase;
	}
	public void setRec_fase(int rec_fase) {
		this.rec_fase = rec_fase;
	}
	public int getRec_horas() {
		return rec_horas;
	}
	public void setRec_horas(int rec_horas) {
		this.rec_horas = rec_horas;
	}
	public Double getRec_tarifa_mensual() {
		return rec_tarifa_mensual;
	}
	public void setRec_tarifa_mensual(Double rec_tarifa_mensual) {
		this.rec_tarifa_mensual = rec_tarifa_mensual;
	}
	public Double getRec_costo() {
		return rec_costo;
	}
	public void setRec_costo(Double rec_costo) {
		this.rec_costo = rec_costo;
	}
	public int getRec_mes() {
		return rec_mes;
	}
	public void setRec_mes(int rec_mes) {
		this.rec_mes = rec_mes;
	}
	@Override
	public String toString() {
		return "RecursoModel [rec_nombre=" + rec_nombre + ", rec_demanda=" + rec_demanda + ", rec_fase=" + rec_fase
				+ ", rec_horas=" + rec_horas + ", rec_tarifa_mensual=" + rec_tarifa_mensual + ", rec_costo=" + rec_costo
				+ ", rec_mes=" + rec_mes + "]";
	}
	
}
