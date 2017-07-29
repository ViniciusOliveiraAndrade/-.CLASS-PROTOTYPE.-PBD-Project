//Emprestismo  (*id, data_emprestimo, data_entrega, data_prevista_entrega, situação, multa, #id_usuario, #id_funcionario, #id_livro)

package br.com.model.beans;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Emprestimo {
	
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
	
	private double multa;
	
	@OneToOne
	@JoinColumn(name = "livro_id")
	private Livro livro;
	
	@OneToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	@OneToOne
	@JoinColumn(name = "funcionario_Emprestimo_id")
	private Funcionario funcionario_Emprestimo;

	@OneToOne
	@JoinColumn(name = "funcionario_Devolucao_id")
	private Funcionario funcionario_Devolucao;
	

	
	public Emprestimo() {}
	
	public Emprestimo(Date data_emprestimo, String situacao, double multa, Livro livro, Usuario usuario, Funcionario funcionario) {
		super();
		this.data_emprestimo = data_emprestimo;
		Calendar c = Calendar.getInstance(); 
		c.setTime(data_emprestimo); 
		c.add(Calendar.DATE, 5);
		this.data_prevista_entrega = c.getTime();
		this.situacao = situacao;
		this.multa = multa;
		this.livro = livro;
		this.usuario = usuario;
		this.funcionario_Emprestimo = funcionario;
	}



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

	public Funcionario getFuncionario_Emprestimo() {
		return funcionario_Emprestimo;
	}

	public void setFuncionario_Emprestimo(Funcionario funcionario_Emprestimo) {
		this.funcionario_Emprestimo = funcionario_Emprestimo;
	}

	public Funcionario getFuncionario_Devolucao() {
		return funcionario_Devolucao;
	}

	public void setFuncionario_Devolucao(Funcionario funcionario_Defolucao) {
		this.funcionario_Devolucao = funcionario_Defolucao;
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

	public double getMulta() {
		return multa;
	}

	public void setMulta(double multa) {
		this.multa = multa;
	}
	
	
}
