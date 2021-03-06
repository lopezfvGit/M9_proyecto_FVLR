package com.unam.miGestion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class ListaRecursosBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7603519532439693412L;

	private List<RecursoModel> recursos;

	public ListaRecursosBean() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor se vuelve a setear");
		this.recursos = new ArrayList<RecursoModel>();
	}

	public List<RecursoModel> getRecursos() {
		return recursos;
	}

	public void setRecursos(List<RecursoModel> recursos) {
		this.recursos = recursos;
	}

	public void agregar(RecursoModel recursosBean) {
		
		recursos.add(recursosBean);
		
	}

}
