//Curso  (*id, nome, #id_departamento)

package br.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Curso {
	
	@Id
	@GeneratedValue
	private int id;
	
	private int id_departamento;
	
	@Column(unique = true)
	private String nome;
	
	

	public Curso(){}
	
	
	

	public int getId() {
		return id;
	}
	
	/*
	 * =========================================  GET and SET  ===================================================
	 */

	public int getId_departamento() {
		return id_departamento;
	}

	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	 
}
