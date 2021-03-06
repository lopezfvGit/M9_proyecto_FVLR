package com.unam.miGestion;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.faces.event.AbortProcessingException;
import jakarta.faces.event.AjaxBehaviorEvent;


@Named
@SessionScoped
public class UsuarioBean implements Serializable {

	private static final long serialVersionUID = -8463063443349736411L;
	
	private String usu_user = "";
	private String usu_password = "";

	@Inject
	private MessageBean messageBean;
	
	public String registrar() {
		System.out.println(usu_user);
		System.out.println(usu_password);
		messageBean.setMensaje("Bienvenido " + usu_user + ", disfruta de la Gestión de Proyectos");
		return "index";
	}

	public void clear(AjaxBehaviorEvent event)
            throws AbortProcessingException {
		usu_user = "";
		usu_password = "";
    }

	
	public String getUsu_user() {
		return usu_user;
	}

	public void setUsu_user(String usu_user) {
		this.usu_user = usu_user;
	}

	public String getUsu_password() {
		return usu_password;
	}

	public void setUsu_password(String usu_password) {
		this.usu_password = usu_password;
	}

	public MessageBean getMessageBean() {
		return messageBean;
	}

	public void setMessageBean(MessageBean messageBean) {
		this.messageBean = messageBean;
	}

}
