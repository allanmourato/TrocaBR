package br.com.trocabr.dao;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.trocabr.modelo.Usuario;

@Stateless
public class UsuarioDao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	private EntityManager manager;
	
	public void adicionaUsuario(Usuario usuario) {
		manager.persist(usuario);
	}
	
	

}
