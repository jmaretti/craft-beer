/**
 * 
 */
package com.beerhouse.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entidade que representa a tabela de cerveja
 * @author Jefferson
 *
 */
@Entity
public class Beer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6299854959067653086L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	private String paisOrigem;
	
	private String tipo;
	
	private String ingredientes;
	
	private double qtde;

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

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public double getQtde() {
		return qtde;
	}

	public void setQtde(double qtde) {
		this.qtde = qtde;
	}
	
	
	
	
	
}
