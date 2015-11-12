package br.com.trocabr.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.trocabr.dao.UsuarioDao;
import br.com.trocabr.modelo.Usuario;

@Named
@RequestScoped
public class UsuarioBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Usuario usuario;
	
	@Inject
	private UsuarioDao daoUsuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	public void adicionaUsuario() {
		daoUsuario.adicionaUsuario(usuario);
	}

}
