//Funcionario  (*id, *matricula, cpf, nome)

package br.com.model.beans;

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
	private String cpf;

	private String nome;
	
	
	public Funcionario() {}
	
	
	
	public Funcionario(int matricula, String cpf, String nome) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.nome = nome;
	}



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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
