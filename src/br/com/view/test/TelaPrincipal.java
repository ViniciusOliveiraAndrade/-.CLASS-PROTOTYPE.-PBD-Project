package br.com.view.test;

import javax.swing.JFrame;

import br.com.model.beans.Funcionario;
import br.com.model.beans.Usuario;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class TelaPrincipal extends JFrame{
	
	
	private static final long serialVersionUID = 1L;
	private Funcionario funcionarioLogado = null;
	private Usuario usuarioLogado = null;
	
	/*
	 * Paineis
	 */
	
	private JPanel paineldeUsuario;
	private JPanel painelDeMenus;
	/*
	 * Botões
	 */
//	private JButton logarButton;

	
	/*
	 *RaioButtons 
	 */
//	private JRadioButton autorRB;
//	private ButtonGroup grupo;


	/*
	 * Outros
	 */
	
//	private JLabel lblPesquisar;
//	private JTextField pesquisaField;
	
	
	
	
	private PainelInicial painelInicial;
	
	public TelaPrincipal() {
		super("Biblioteca");
		setSize(820,600);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		paineldeUsuario = new JPanel();
		getContentPane().add(paineldeUsuario);
		paineldeUsuario.setLayout(new BorderLayout(0, 0));
		
		painelDeMenus = new JPanel();
		painelDeMenus.setBorder(new LineBorder(new Color(0, 0, 0)));
		paineldeUsuario.add(painelDeMenus, BorderLayout.WEST);
		
		JButton btnTest = new JButton("Test");
		painelDeMenus.add(btnTest);
		
		JPanel painelInformacao = new JPanel();
		painelInformacao.setBorder(new LineBorder(new Color(0, 0, 0)));
		paineldeUsuario.add(painelInformacao, BorderLayout.NORTH);
		
		JLabel lblBemVindo = new JLabel("Bem Vindo,  ");
		painelInformacao.add(lblBemVindo);
		
		JLabel NomeUsuario = new JLabel("Vinicius");
		painelInformacao.add(NomeUsuario);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		painelInicial = new PainelInicial();
//		getContentPane().add(painelInicial);
		
		setVisible(true);
	}
	
	
	public void iniciarPainelUsuario() {}
	
	public void iniciarPainelFuncionario() {}

}
