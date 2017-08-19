package br.com.view.funcionario;

import javax.swing.JPanel;

import br.com.model.beans.Funcionario;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;

public class PainelFuncionario extends JPanel {
	
	private static final long serialVersionUID = 1L;

	private Funcionario funcionario;
	
	/*
	 * Paineis
	 */
	private JPanel painelMenu;
	private JPanel painelCadastrarOpcoes;
	
	
	
	
	
	/*
	 * Butões
	 */
	
//	private JButton
	
	
	
	
	
	public PainelFuncionario(Funcionario funcionario) {
		setBackground(Color.WHITE);
		this.funcionario = funcionario;
		setLayout(new BorderLayout(0, 0));
		
		
		
		
	}
	
	public void criarPainelMenu() {
		painelMenu = new JPanel();
		painelMenu.setBackground(Color.WHITE);
		painelMenu.setBorder(new LineBorder(Color.DARK_GRAY, 2, true));
		add(painelMenu, BorderLayout.WEST);
		painelMenu.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton cadastrarButton = new JButton("Cadastrar");
		painelMenu.add(cadastrarButton);
		
		JButton btnNewButton = new JButton("Atualizar");
		painelMenu.add(btnNewButton);
		
		JButton listarButton = new JButton("Listar");
		painelMenu.add(listarButton);
		
		JButton aprovarButton = new JButton("Aprovar");
		painelMenu.add(aprovarButton);
		
		JButton realizarButton = new JButton("Realizar");
		painelMenu.add(realizarButton);
		
		JButton caixaButton = new JButton("Caixa");
		painelMenu.add(caixaButton);
		
	}
	
	public void criarPainelCadastrarOpcoes() {
		painelCadastrarOpcoes = new JPanel();
		painelCadastrarOpcoes.setBorder(new LineBorder(Color.DARK_GRAY, 2, true));
		painelCadastrarOpcoes.setBackground(Color.WHITE);
		add(painelCadastrarOpcoes, BorderLayout.EAST);
		painelCadastrarOpcoes.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton cOLivroButton = new JButton("Livro");
		painelCadastrarOpcoes.add(cOLivroButton);
		
		JButton cOAutorButton = new JButton("Autor");
		painelCadastrarOpcoes.add(cOAutorButton);
		
		JButton cOUsuarioButton = new JButton("Usuario");
		painelCadastrarOpcoes.add(cOUsuarioButton);
		
		JButton cOFuncionarioButton = new JButton("Funcionario");
		painelCadastrarOpcoes.add(cOFuncionarioButton);
		
		JButton cOCursoButton = new JButton("Curso");
		painelCadastrarOpcoes.add(cOCursoButton);
		
		JButton cODepartamentoButton = new JButton("Departamento");
		painelCadastrarOpcoes.add(cODepartamentoButton);
	}

}
