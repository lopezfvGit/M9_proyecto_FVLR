package com.unam.miGestion;

import java.io.Serializable;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;
import jakarta.faces.event.AbortProcessingException;
import jakarta.faces.event.AjaxBehaviorEvent;

@Model
public class ProyectoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7141020465980742077L;

	
	@Inject
	private MessageBean messageBean;
    	
	private String pro_demanda = "";
	private String pro_nombre = "";
	private String pro_cve_presupuestal = "";
	private String pro_fec_cierre_apr = "";
	private String pro_fec_rom = "";
	private String pro_fec_cierre_apr_firmas = "";
	private String pro_disenos_plan_matriz = "";
	private String pro_disenos_plan_matriz_firmas = "";
	private String pro_fec_liberacion = "";
	private String pro_tamano = "";
	private Double pro_horas = 0.00;

	public String registrar() {
		//logica de negocio , comunicacion via jpa el guardado en la BD
		System.out.println(pro_demanda);
		System.out.println(pro_nombre);
		System.out.println(pro_cve_presupuestal);
		System.out.println(pro_fec_cierre_apr);
		System.out.println(pro_fec_cierre_apr_firmas);
		System.out.println(pro_fec_rom);
		System.out.println(pro_disenos_plan_matriz);
		System.out.println(pro_disenos_plan_matriz_firmas);
		System.out.println(pro_fec_liberacion);
		System.out.println(pro_tamano);
		System.out.println(pro_horas);
		messageBean.setMensaje("Muchas gracias tu Proyecto con Demanda "+pro_demanda+" ha quedado registrado.");
		return "index";
	}

	public void clear(AjaxBehaviorEvent event)
            throws AbortProcessingException {
		pro_demanda = "";
		pro_nombre = "";
		pro_cve_presupuestal = "";
		pro_fec_cierre_apr = "";
		pro_fec_rom = "";
		pro_fec_cierre_apr_firmas = "";
		pro_disenos_plan_matriz = "";
		pro_disenos_plan_matriz_firmas = "";
		pro_fec_liberacion = "";
		pro_tamano = "";
		pro_horas = 0.00;
    }

	
	public MessageBean getMessageBean() {
		return messageBean;
	}

	public void setMessageBean(MessageBean messageBean) {
		this.messageBean = messageBean;
	}

	public String getPro_demanda() {
		return pro_demanda;
	}

	public void setPro_demanda(String pro_demanda) {
		this.pro_demanda = pro_demanda;
	}

	public String getPro_nombre() {
		return pro_nombre;
	}

	public void setPro_nombre(String pro_nombre) {
		this.pro_nombre = pro_nombre;
	}

	public String getPro_cve_presupuestal() {
		return pro_cve_presupuestal;
	}

	public void setPro_cve_presupuestal(String pro_cve_presupuestal) {
		this.pro_cve_presupuestal = pro_cve_presupuestal;
	}

	public String getPro_fec_cierre_apr() {
		return pro_fec_cierre_apr;
	}

	public void setPro_fec_cierre_apr(String pro_fec_cierre_apr) {
		this.pro_fec_cierre_apr = pro_fec_cierre_apr;
	}

	public String getPro_fec_rom() {
		return pro_fec_rom;
	}

	public void setPro_fec_rom(String pro_fec_rom) {
		this.pro_fec_rom = pro_fec_rom;
	}

	public String getPro_fec_cierre_apr_firmas() {
		return pro_fec_cierre_apr_firmas;
	}

	public void setPro_fec_cierre_apr_firmas(String pro_fec_cierre_apr_firmas) {
		this.pro_fec_cierre_apr_firmas = pro_fec_cierre_apr_firmas;
	}

	public String getPro_disenos_plan_matriz() {
		return pro_disenos_plan_matriz;
	}

	public void setPro_disenos_plan_matriz(String pro_disenos_plan_matriz) {
		this.pro_disenos_plan_matriz = pro_disenos_plan_matriz;
	}

	public String getPro_disenos_plan_matriz_firmas() {
		return pro_disenos_plan_matriz_firmas;
	}

	public void setPro_disenos_plan_matriz_firmas(String pro_disenos_plan_matriz_firmas) {
		this.pro_disenos_plan_matriz_firmas = pro_disenos_plan_matriz_firmas;
	}

	public String getPro_fec_liberacion() {
		return pro_fec_liberacion;
	}

	public void setPro_fec_liberacion(String pro_fec_liberacion) {
		this.pro_fec_liberacion = pro_fec_liberacion;
	}

	public String getPro_tamano() {
		return pro_tamano;
	}

	public void setPro_tamano(String pro_tamano) {
		this.pro_tamano = pro_tamano;
	}

	public Double getPro_horas() {
		return pro_horas;
	}

	public void setPro_horas(Double pro_horas) {
		this.pro_horas = pro_horas;
	}

	
	
}
