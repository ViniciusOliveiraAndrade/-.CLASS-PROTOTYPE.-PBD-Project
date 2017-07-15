package br.com.model;

import java.util.Date;

public class Livro {
	
	private int codigo;
	private int numero_edicao;
	private int numero_exemplares;
	
	private String titulo;
	private String autores;
	private String editora;
	
	private Date ano_publicacao;
	
	
	
	public Livro(){}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumero_edicao() {
		return numero_edicao;
	}

	public void setNumero_edicao(int numero_edicao) {
		this.numero_edicao = numero_edicao;
	}



	public int getNumero_exemplares() {
		return numero_exemplares;
	}

	public void setNumero_exemplares(int numero_exemplares) {
		this.numero_exemplares = numero_exemplares;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Date getAno_publicacao() {
		return ano_publicacao;
	}

	public void setAno_publicacao(Date ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}
	
	
}
