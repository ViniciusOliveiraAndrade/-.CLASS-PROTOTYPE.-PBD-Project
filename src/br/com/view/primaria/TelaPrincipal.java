package br.com.view.primaria;

import javax.swing.JFrame;

import br.com.model.beans.Funcionario;
import br.com.model.beans.Usuario;
import br.com.view.usuario.PainelUsuario;

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
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

public class TelaPrincipal extends JFrame{
	
	
	private static final long serialVersionUID = 1L;
	private Funcionario funcionarioLogado = null;
	private Usuario usuarioLogado = null;
	
	/*
	 * Paineis
	 */
	private PainelInicial painelInicial;
	private PainelUsuario painelUsuario;
	
	/*
	 * Botões
	 */
	
	
	
	
	/*
	 *RaioButtons 
	 */
	

	
	
	
	/*
	 * Outros
	 */
	
	
	
	
	
	
	
	
	
	
	
	public TelaPrincipal() {
		super("Biblioteca");
		setSize(820,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		
		/*
		 * Paineis
		 */
		this.painelUsuario = new PainelUsuario(new Usuario(2, "10602066417", 2, "vinicius@Gmail.com", "normal", "Vinicius", "99999999"));
		this.getContentPane().add(this.painelUsuario);
		
//		this.painelInicial = new PainelInicial();
//		this.getContentPane().add(this.painelInicial);
		
		JPanel panel = new JPanel();
		
		
		
		
		
		/*
		 * Botões
		 */
		
		
		
		
	
		/*
		 * Outros
		 */
		
		
		

		
		/*
		 * RaioButton
		 */
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}
	
	

	public void iniciarPainelFuncionario() {}

}
