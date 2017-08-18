//Livro  (*id, *coidgo, titulo, numero_edi��o, ano_de_publica��o, editora, numero_de_exemplares, #id_autor)

package br.com.model.beans;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "autor_id")
	private Autor autor;
	
	private String editora;
	
	@Temporal(TemporalType.DATE)
	private Date ano_publicacao;
	
	public Livro(){}
	
	public Livro(int codigo, int numero_edicao, int numero_exemplares, String titulo, Autor autor, String editora,
			Date ano_publicacao) {
		super();
		this.codigo = codigo;
		this.numero_edicao = numero_edicao;
		this.numero_exemplares = numero_exemplares;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.ano_publicacao = ano_publicacao;
	}



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

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autores) {
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
