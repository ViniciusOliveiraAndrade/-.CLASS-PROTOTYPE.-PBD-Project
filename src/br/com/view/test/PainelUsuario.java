package br.com.view.test;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PainelUsuario extends JPanel{

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

	public PainelUsuario() {
		
		/*
		 * Paineis
		 */
				
		
		setLayout(new BorderLayout(0, 0));
		
		paineldeLogin = new JPanel();
		add(paineldeLogin, BorderLayout.NORTH);
		
		tabelaAcervo = new TabelaPadrao("Acervo");
		tabelaAcervo.setColumns(new Object[] {"Id","Codigo","Titulo","Numero da edicao","Ano da publicacao","Numero de exemplares","Editora","Autor"});
		add(tabelaAcervo, BorderLayout.CENTER);
		
		painelDosBotoesiniciais = new JPanel();
		add(painelDosBotoesiniciais, BorderLayout.SOUTH);
		
		/*
		 * Butôes
		 */
		
		logarButton = new JButton("Logar");
		paineldeLogin.add(logarButton);
		
		solicitarReservaButton = new JButton("Solicitar Reserva");
		painelDosBotoesiniciais.add(solicitarReservaButton);
		
		solicitarEmprestismoButton = new JButton("Solicitar Emprestismo");
		painelDosBotoesiniciais.add(solicitarEmprestismoButton);
		
		/*
		 * Outros
		 */
		
		lblPesquisar = new JLabel("Pesquisar:");
		paineldeLogin.add(lblPesquisar);
		
		pesquisaField = new JTextField();
		paineldeLogin.add(pesquisaField);
		pesquisaField.setColumns(15);
		
		pesquisarButton = new JButton("Pesquisar");
		
		/*
		 *RaioButtons 
		 */
		palavraChaveRB = new JRadioButton("Palavra-Chave");
		paineldeLogin.add(palavraChaveRB);
		
		tituloRB = new JRadioButton("Titulo");
		paineldeLogin.add(tituloRB);
		
		editoraRB = new JRadioButton("Editora");
		paineldeLogin.add(editoraRB);
		
		autorRB = new JRadioButton("Autor");
		paineldeLogin.add(autorRB);
		
		grupo = new ButtonGroup();
		grupo.add(autorRB);
		grupo.add(palavraChaveRB);
		grupo.add(tituloRB);
		grupo.add(editoraRB);
		
		pesquisarButton = new JButton("Pesquisar");
		paineldeLogin.add(pesquisarButton);
		
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

	public JLabel getLblPesquisar() {
		return lblPesquisar;
	}

	public JTextField getPesquisaField() {
		return pesquisaField;
	}

}
