//Usuario  (*id,*matricula, nome, email, cpf, situa��o, telefone, tipoProfessor, codigo, #id_departamento)

package br.com.model.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.com.model.dao.DepartamentoDAO;

@Entity
public class Usuario {

	@Id
	@GeneratedValue
	private int id;

	@Column(unique = true)
	@GeneratedValue
	private int matricula;

	@Column(unique = true)
	private String cpf;

	@Column(unique = true)
	private int codigo;

	@Column(unique = true)
	private String email;

	private String situacao;
	private String nome;
	private String telefone;

	private boolean professor;

	@OneToOne
	@JoinColumn(name = "departamento_id")
	private Departamento departamento;

	public Usuario(){}



	public Usuario(int matricula, String cpf, int codigo, String email, String situacao, String nome, String telefone) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.codigo = codigo;
		this.email = email;
		this.situacao = situacao;
		this.nome = nome;
		this.telefone = telefone;
		this.professor = false;
	}

	public Usuario(int matricula, String cpf, String email, String situacao, String nome, String telefone, Departamento departamento) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.email = email;
		this.situacao = situacao;
		this.nome = nome;
		this.telefone = telefone;
		this.professor = true;
		this.departamento = departamento;
	}


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

	public Departamento departamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
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


	public int getId() {
		return id;
	}


	public boolean isProfessor() {
		return professor;
	}


	public void setProfessor(boolean professor) {
		this.professor = professor;
	}

	public Departamento getDepartamento() {
		return departamento;
	}
	
}