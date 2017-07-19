//Autor  (*id, nome)

package br.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Autor {
	
	@Id
	@GeneratedValue
	private int id; 
	
	@Column(unique = true)
	private String nome;

	
	public Autor(){}

	/*
	 * =========================================  GET and SET  ===================================================
	 */

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
