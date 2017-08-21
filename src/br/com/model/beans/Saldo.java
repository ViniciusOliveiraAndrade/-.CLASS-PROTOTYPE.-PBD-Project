package br.com.model.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "Saldo")
@Immutable
public class Saldo {
	
	@Id
	@GeneratedValue
	private int id;
	
//	@Column(name="Data")
	@Temporal(TemporalType.DATE)
	private Date data;
	
//	@Column(name="Usuario")
	private String usuario;
	
	private double multa;

	public Saldo() {}
	
	public Saldo(Date data, String usuario, double multa) {
		super();
		this.data = data;
		this.usuario = usuario;
		this.multa = multa;
	}

	public Date getData() {
		return data;
	}

	public String getUsuario() {
		return usuario;
	}

	public double getMulta() {
		return multa;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setMulta(double multa) {
		this.multa = multa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
	
}
