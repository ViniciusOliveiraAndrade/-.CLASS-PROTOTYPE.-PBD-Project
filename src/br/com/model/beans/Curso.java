//Curso  (*id, nome, #id_departamento)

package br.com.model.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Curso {
	
	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne
	@JoinColumn(name = "departamento_id")
	private Departamento departamento;
	
	@Column(unique = true)
	private String nome;
	
	

	public Curso(){}
	
	
	

	public int getId() {
		return id;
	}
	
	/*
	 * =========================================  GET and SET  ===================================================
	 */

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	 
}
