//Reserva  (*id, data_realização, data_validaçao, data_limite, #id_livro, #id_usuario, #id_funcionario)

package br.com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reserva {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Temporal(TemporalType.DATE)
	private Date data_realizacao;
	
	@Temporal(TemporalType.DATE)
	private Date data_validacao;
	
	@Temporal(TemporalType.DATE)
	private Date data_limite;

	@OneToOne
	private Livro livro;
	
	@OneToOne
	private Usuario usuario;
	
	@OneToOne
	private Funcionario funcionario;
	
	public Reserva() {}

	/*
	 * =========================================  GET and SET  ===================================================
	 */
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData_realizacao() {
		return data_realizacao;
	}

	public void setData_realizacao(Date data_realizacao) {
		this.data_realizacao = data_realizacao;
	}

	public Date getData_validacao() {
		return data_validacao;
	}

	public void setData_validacao(Date data_validacao) {
		this.data_validacao = data_validacao;
	}

	public Date getData_limite() {
		return data_limite;
	}

	public void setData_limite(Date data_limite) {
		this.data_limite = data_limite;
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

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFunciomario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}
