package br.com.view.primaria;

import javax.swing.JFrame;

import br.com.controller.primaria.ControllerTelaPrincipal;
import br.com.model.beans.Funcionario;
import br.com.model.beans.Usuario;
import br.com.view.funcionario.PainelFuncionario;
import br.com.view.usuario.PainelUsuario;


public class TelaPrincipal extends JFrame{
	
	
	private static final long serialVersionUID = 1L;
	
	private ControllerTelaPrincipal controller;
	/*
	 * Paineis
	 */
	private PainelInicial painelInicial;
	private PainelUsuario painelUsuario;
	private PainelFuncionario painelFuncionario;
	
	public TelaPrincipal() {
		super("Biblioteca");
		setSize(820,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
//		getContentPane().setLayout(new CardLayout(0, 0));
		this.controller = new ControllerTelaPrincipal(this);
		
		/*
		 * Paineis
		 */
		
		this.painelInicial = new PainelInicial(controller);
		this.getContentPane().add(this.painelInicial);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}
	
	public void logarUsuario(Usuario u) {
		this.painelInicial.setVisible(false);
		this.painelUsuario = new PainelUsuario(u,this.controller);
		this.getContentPane().add(this.painelUsuario);
	}
	
	public void logarFuncionario(Funcionario f) {
		this.painelInicial.setVisible(false);
		this.painelFuncionario = new PainelFuncionario(f,this.controller);
		this.getContentPane().add(this.painelFuncionario);
		
	}
	
	public void desLogar(boolean user){
		if(user) {
			this.painelUsuario.setVisible(false);
		} else{
			this.painelFuncionario.setVisible(false);
		}
		
			this.painelInicial = new PainelInicial(controller);
			this.getContentPane().add(this.painelInicial);
		
		
		
	}

}
