//Livro  (*id, *coidgo, titulo, numero_edição, ano_de_publicação, editora, numero_de_exemplares, #id_autor)

package br.com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livro {

	@Id
	@GeneratedValue
	private int id;

	@Column(unique = true)
	private int codigo;
	
	private int numero_edicao;
	private int numero_exemplares;
	
	private String titulo;
	
	private int autor;
	
	private String editora;
	
	private Date ano_publicacao;
	
	public Livro(){}

	/*
	 * =========================================  GET and SET  ===================================================
	 */

	public int getId() {
		return id;
	}

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

	public int getAutor() {
		return autor;
	}

	public void setAutor(int autores) {
		this.autor = autores;
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
