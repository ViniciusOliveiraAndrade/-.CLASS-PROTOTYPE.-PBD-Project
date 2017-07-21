//Funcionario  (*id, *matricula, cpf, nome)

package br.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Funcionario {

	@Id
	@GeneratedValue
	private int id;

	@Column(unique = true)
	private int matricula;

	@Column(unique = true)
	private int cpf;

	private String nome;
	
	
	public Funcionario() {}
	
	
	/*
	 * =========================================  GET and SET  ===================================================
	 */

	public int getId() {
		return id;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
