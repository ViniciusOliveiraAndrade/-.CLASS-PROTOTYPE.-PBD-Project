//Usuario  (*id,*matricula, nome, email, cpf, situação, telefone, tipoProfessor, codigo, #id_departamento)

package br.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue
	private int id;

	@Column(unique = true)
	private int matricula;

	@Column(unique = true)
	private int cpf;

	@Column(unique = true)
	private int codigo;

	@Column(unique = true)
	private String email;

	private String situacao;
	private String nome;
	private String telefone;

	private boolean professor;

	private int id_departamento;

	public Usuario(){}
	
	/*
	 * =========================================  GET and SET  ===================================================
	 */
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getId_departamento() {
		return id_departamento;
	}

	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
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


	public int getId() {
		return id;
	}


	public boolean isProfessor() {
		return professor;
	}


	public void setProfessor(boolean professor) {
		this.professor = professor;
	}
}