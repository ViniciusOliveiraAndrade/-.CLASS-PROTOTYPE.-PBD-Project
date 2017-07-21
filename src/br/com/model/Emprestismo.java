//Emprestismo  (*id, data_emprestimo, data_entrega, data_prevista_entrega, situação, multa, #id_usuario, #id_funcionario, #id_livro)

package br.com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Emprestismo {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Temporal(TemporalType.DATE)
	private Date data_emprestimo;
	
	@Temporal(TemporalType.DATE)
	private Date data_entrega;
	
	@Temporal(TemporalType.DATE)
	private Date data_prevista_entrega;

	private String situacao;
	
	private float multa;
	
	@OneToOne
	private Livro livro;
	
	@OneToOne
	private Usuario usuario;
	
	@OneToOne
	private Funcionario funciomario;
	
	public Emprestismo() {}

	/*
	 * =========================================  GET and SET  ===================================================
	 */
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Funcionario getFunciomario() {
		return funciomario;
	}

	public void setFunciomario(Funcionario funciomario) {
		this.funciomario = funciomario;
	}

	public Date getData_emprestimo() {
		return data_emprestimo;
	}

	public void setData_emprestimo(Date data_emprestimo) {
		this.data_emprestimo = data_emprestimo;
	}

	public Date getData_entrega() {
		return data_entrega;
	}

	public void setData_entrega(Date data_entrega) {
		this.data_entrega = data_entrega;
	}

	public Date getData_prevista_entrega() {
		return data_prevista_entrega;
	}

	public void setData_prevista_entrega(Date data_prevista_entrega) {
		this.data_prevista_entrega = data_prevista_entrega;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public float getMulta() {
		return multa;
	}

	public void setMulta(float multa) {
		this.multa = multa;
	}
	
	
}
