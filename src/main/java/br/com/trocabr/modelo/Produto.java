package br.com.trocabr.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	private String descricao;
	private byte[] imagem1;
	private byte[] imagem2;
	private byte[] imagem3;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public byte[] getImagem1() {
		return imagem1;
	}
	public void setImagem1(byte[] imagem1) {
		this.imagem1 = imagem1;
	}
	public byte[] getImagem2() {
		return imagem2;
	}
	public void setImagem2(byte[] imagem2) {
		this.imagem2 = imagem2;
	}
	public byte[] getImagem3() {
		return imagem3;
	}
	public void setImagem3(byte[] imagem3) {
		this.imagem3 = imagem3;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	

}
