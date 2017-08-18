package br.com.view.primaria;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.com.controller.primaria.ControllerPainelInicial;

public class PainelInicial extends JPanel{

	private static final long serialVersionUID = 1L;
	
	/*
	 * Paineis
	 */
	
	private JPanel paineldeLogin;
	private JPanel painelDosBotoesiniciais;
	private TabelaPadrao tabelaAcervo;
	
	/*
	 * Botões
	 */
	private JButton logarButton;
	private JButton solicitarReservaButton;
	private JButton solicitarEmprestismoButton;
	private JButton pesquisarButton;

	
	/*
	 *RaioButtons 
	 */
	private JRadioButton palavraChaveRB;
	private JRadioButton tituloRB;
	private JRadioButton editoraRB;
	private JRadioButton autorRB;
	private ButtonGroup grupo;


	/*
	 * Outros
	 */
	
	private JLabel lblPesquisar;
	
	private JTextField pesquisaField;
	
	private ControllerPainelInicial controller;

	public PainelInicial() {
		
		/*
		 * Paineis
		 */
				
		
		setLayout(new BorderLayout(0, 0));
		
		this.controller = new ControllerPainelInicial(this);
		
		this.paineldeLogin = new JPanel();
		add(this.paineldeLogin, BorderLayout.NORTH);
		
		this.tabelaAcervo = new TabelaPadrao("Acervo");
		this.tabelaAcervo.setColumns(new Object[] {"Id","Codigo","Titulo","Numero da edicao","Ano da publicacao","Numero de exemplares","Editora","Autor"});
		add(this.tabelaAcervo, BorderLayout.CENTER);
		
		this.painelDosBotoesiniciais = new JPanel();
		add(this.painelDosBotoesiniciais, BorderLayout.SOUTH);
		
		/*
		 * Butôes
		 */
		
		this.logarButton = new JButton("Logar");
		this.logarButton.addActionListener(this.controller);
		this.paineldeLogin.add(this.logarButton);
		
		this.solicitarReservaButton = new JButton("Solicitar Reserva");
		this.solicitarReservaButton.addActionListener(this.controller);
		this.painelDosBotoesiniciais.add(this.solicitarReservaButton);
		
		this.solicitarEmprestismoButton = new JButton("Solicitar Emprestismo");
		this.solicitarEmprestismoButton.addActionListener(this.controller);
		this.painelDosBotoesiniciais.add(this.solicitarEmprestismoButton);
		
		
		
		
		/*
		 * Outros
		 */
		
		this.lblPesquisar = new JLabel("Pesquisar:");
		this.paineldeLogin.add(lblPesquisar);
		
		this.pesquisaField = new JTextField();
		this.paineldeLogin.add(this.pesquisaField);
		this.pesquisaField.setColumns(15);
		
		
		
		/*
		 *RaioButtons 
		 */
		this.palavraChaveRB = new JRadioButton("Palavra-Chave");
		this.palavraChaveRB.setSelected(true);
		this.paineldeLogin.add(this.palavraChaveRB);
		
		this.tituloRB = new JRadioButton("Titulo");
		this.paineldeLogin.add(this.tituloRB);
		
		this.editoraRB = new JRadioButton("Editora");
		this.paineldeLogin.add(this.editoraRB);
		
		this.autorRB = new JRadioButton("Autor");
		this.paineldeLogin.add(this.autorRB);
		
		this.grupo = new ButtonGroup();
		this.grupo.add(this.autorRB);
		this.grupo.add(this.palavraChaveRB);
		this.grupo.add(this.tituloRB);
		this.grupo.add(this.editoraRB);
		
		this.pesquisarButton = new JButton("Pesquisar");
		this.pesquisarButton.addActionListener(this.controller);
		this.paineldeLogin.add(this.pesquisarButton);
		
	}

	public JPanel getPaineldeLogin() {
		return paineldeLogin;
	}

	public JPanel getPainelDosBotoesiniciais() {
		return painelDosBotoesiniciais;
	}

	public TabelaPadrao getTabelaAcervo() {
		return tabelaAcervo;
	}

	public JButton getLogarButton() {
		return logarButton;
	}

	public JButton getSolicitarReservaButton() {
		return solicitarReservaButton;
	}

	public JButton getSolicitarEmprestismoButton() {
		return solicitarEmprestismoButton;
	}

	public JButton getPesquisarButton() {
		return pesquisarButton;
	}

	public JRadioButton getPalavraChaveRB() {
		return palavraChaveRB;
	}

	public JRadioButton getTituloRB() {
		return tituloRB;
	}

	public JRadioButton getEditoraRB() {
		return editoraRB;
	}

	public JRadioButton getAutorRB() {
		return autorRB;
	}

	public ButtonGroup getGrupo() {
		return grupo;
	}

	public JTextField getPesquisaField() {
		return pesquisaField;
	}

}
