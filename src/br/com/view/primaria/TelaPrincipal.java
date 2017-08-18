package br.com.view.primaria;

import javax.swing.JFrame;

import br.com.model.beans.Funcionario;
import br.com.model.beans.Usuario;
import br.com.view.usuario.PainelUsuario;

import java.awt.CardLayout;
import java.util.Observable;
import java.util.Observer;

public class TelaPrincipal extends JFrame implements Observer{
	
	
	private static final long serialVersionUID = 1L;
	private static Funcionario funcionarioLogado = null;
	private static Usuario usuarioLogado = null;
	
	/*
	 * Paineis
	 */
	private PainelInicial painelInicial;
	private PainelUsuario painelUsuario;

	
	public TelaPrincipal() {
		super("Biblioteca");
		setSize(820,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		
		/*
		 * Paineis
		 */
		this.painelInicial = new PainelInicial();
		this.getContentPane().add(this.painelInicial);
		
//		this.painelUsuario = new PainelUsuario(new Usuario(2, "10602066417", 2, "vinicius@Gmail.com", "normal", "Vinicius", "99999999"));
//		this.getContentPane().add(this.painelUsuario);
		
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}
	
	public static void logarUsuario(Usuario u) {
		
	}
	
	public static void logarFuncionario() {}

	@Override
	public void update(Observable o, Object arg) {
		
		
	}

	

}
