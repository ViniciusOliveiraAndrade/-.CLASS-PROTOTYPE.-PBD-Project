package br.com.view.funcionario.realizar;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.border.TitledBorder;

import br.com.controller.funcionario.realizar.ControllerPainelRealizarReserva;
import br.com.model.beans.Funcionario;
import br.com.view.primaria.TabelaPadrao;

import javax.swing.border.LineBorder;
import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;

public class PainelRealizarReserva extends JPanel{

	private static final long serialVersionUID = 1L;

	private JPanel painelPesquisa;
	private TabelaPadrao tabelaAcervo;

	private JButton aprovarButton;
	private JButton pesquisarButton;

	private JRadioButton palavraChaveRB;
	private JRadioButton tituloRB;
	private JRadioButton editoraRB;
	private JRadioButton autorRB;

	private ButtonGroup grupo;

	private JLabel lblPesquisar;

	private JTextField pesquisaField;

	private Funcionario funcionario;

	private ControllerPainelRealizarReserva controller;

	public PainelRealizarReserva(Funcionario funcionario) {
		this.funcionario = funcionario;
		setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Aprovar Reserva", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));

		controller = new ControllerPainelRealizarReserva(this);

		this.tabelaAcervo = new TabelaPadrao("Acervo");
		this.tabelaAcervo.setColumns(new Object[] {"Id","Codigo","Titulo","Numero da edicao","Ano da publicacao","Numero de exemplares","Editora","Autor"});
		this.tabelaAcervo.podeSelecionar(true);
		this.add(this.tabelaAcervo, BorderLayout.CENTER);

		this.aprovarButton = new JButton("Emprestico");
		this.aprovarButton.addActionListener(controller);
		this.add(this.aprovarButton, BorderLayout.SOUTH);
		this.pesquisarButton = new JButton("Pesquisar");
		this.pesquisarButton.addActionListener(controller);
		
		this.palavraChaveRB = new JRadioButton("Palavra-Chave");
		palavraChaveRB.setBackground(Color.WHITE);
		this.palavraChaveRB.setSelected(true);
		this.tituloRB = new JRadioButton("Titulo");
		tituloRB.setBackground(Color.WHITE);
		this.editoraRB = new JRadioButton("Editora");
		editoraRB.setBackground(Color.WHITE);
		this.autorRB = new JRadioButton("Autor");
		autorRB.setBackground(Color.WHITE);
		
		this.grupo = new ButtonGroup();
		this.grupo.add(this.autorRB);
		this.grupo.add(this.palavraChaveRB);
		this.grupo.add(this.tituloRB);
		this.grupo.add(this.editoraRB);
		
		
		this.lblPesquisar = new JLabel("Pesquisar:");
		
		this.painelPesquisa = new JPanel();
		painelPesquisa.setBackground(Color.WHITE);
		this.painelPesquisa.setBorder(new LineBorder(Color.DARK_GRAY, 2, true));
		this.add(this.painelPesquisa,BorderLayout.NORTH);
		this.pesquisaField = new JTextField();
		this.pesquisaField.setColumns(15);
		
		this.painelPesquisa.add(this.lblPesquisar);
		
		this.painelPesquisa.add(this.pesquisaField);
		
		this.painelPesquisa.add(this.palavraChaveRB);
		this.painelPesquisa.add(this.tituloRB);
		this.painelPesquisa.add(this.editoraRB);
		this.painelPesquisa.add(this.autorRB);
		
		this.painelPesquisa.add(this.pesquisarButton);



//		this.controller.preencherTabela();
	}

	public TabelaPadrao getTabelaReservas() {
		return tabelaAcervo;
	}

	public JButton getAprovarButton() {
		return aprovarButton;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public TabelaPadrao getTabelaAcervo() {
		return tabelaAcervo;
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

	public JLabel getLblPesquisar() {
		return lblPesquisar;
	}

	public JTextField getPesquisaField() {
		return pesquisaField;
	}



}
