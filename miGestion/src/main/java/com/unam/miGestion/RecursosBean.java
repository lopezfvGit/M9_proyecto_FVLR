package com.unam.miGestion;

import java.io.Serializable;
import jakarta.enterprise.inject.Model;
import jakarta.faces.event.AbortProcessingException;
import jakarta.faces.event.AjaxBehaviorEvent;
import jakarta.inject.Inject;

@Model
public class RecursosBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3826226006817834985L;

	private String rec_nombre = " ";
	private String rec_demanda = " ";
	private int rec_fase = 0;
	private int rec_horas = 0;
	private Double rec_tarifa_mensual = 0.00;
	private Double rec_costo = 0.00;
	private int rec_mes = 0;

	
	@Inject
	private ListaRecursosBean listaRecursosBean;
	
	@Inject
	private MessageBean messageBean;

	public String registrar() {
		System.out.println("demanda: " + rec_demanda);
		System.out.println("fase " + rec_fase);
		System.out.println("nombre " + rec_nombre);
		System.out.println("horas " + rec_horas);
		System.out.println("tarifa mensual " + rec_tarifa_mensual);
		System.out.println("costo " + rec_costo);
		System.out.println("mes " + rec_mes);
		String mensaje = "El Recurso/Proveedor " + rec_nombre + " ha quedado registrado";
		
		RecursoModel model = new RecursoModel();
		model.setRec_nombre(rec_nombre);
		model.setRec_demanda(rec_demanda);
		model.setRec_fase(rec_fase);
		model.setRec_horas(rec_horas);
		model.setRec_tarifa_mensual(rec_tarifa_mensual);
		model.setRec_costo(rec_costo);
		model.setRec_mes(rec_mes);
		listaRecursosBean.agregar(model);
		//lo mismo que en el datatable para ver como se van agregando los recursos
		for ( RecursoModel v : listaRecursosBean.getRecursos()) {
			System.out.println(v);
		}
		
		
		messageBean.setMensaje(mensaje);
		return "index";
	}

	public void clear(AjaxBehaviorEvent event)
            throws AbortProcessingException {
		rec_nombre = " ";
		rec_demanda = " ";
		rec_fase = 0;
		 rec_horas = 0;
		rec_tarifa_mensual = 0.00;
		rec_costo = 0.00;
		 rec_mes = 0;
    }
	
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


	public ListaRecursosBean getListaRecursosBean() {
		return listaRecursosBean;
	}

	public void setListaRecursosBean(ListaRecursosBean listaRecursosBean) {
		this.listaRecursosBean = listaRecursosBean;
	}

	public MessageBean getMessageBean() {
		return messageBean;
	}

	public void setMessageBean(MessageBean messageBean) {
		this.messageBean = messageBean;
	}

	
	
}
