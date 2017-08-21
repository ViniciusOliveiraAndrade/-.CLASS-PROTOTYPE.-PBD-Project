//Reserva  (*id, data_realiza��o, data_valida�ao, data_limite, #id_livro, #id_usuario, #id_funcionario)

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
	@JoinColumn(name = "livro_id")
	private Livro livro;
	
	@OneToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	@OneToOne
	@JoinColumn(name = "funcionario_id")
	private Funcionario funcionario;
	
	private String situacao = "";
	
	public Reserva() {}
	
	public Reserva(Date data_realizacao, Livro livro, Usuario usuario,
			Funcionario funcionario) {
		
		Calendar c = Calendar.getInstance(); 
		c.setTime(data_realizacao); 
		c.add(Calendar.DATE, 15);
		
		this.data_realizacao = data_realizacao;
		this.data_validacao = null;
		this.data_limite = c.getTime();
		this.livro = livro;
		this.situacao = "Aberto";
		this.usuario = usuario;
		this.funcionario = funcionario;
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

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
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

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	
}
