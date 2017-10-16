package br.com.view.funcionario.listar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import br.com.controller.funcionario.listar.ControllerPainelListarUsuario;
import br.com.view.primaria.TabelaPadrao;

public class PainelListarUsuario extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JPanel painelOpcoes;
	private JPanel painelPesquisa;
	private TabelaPadrao tabelaAcervo;
	
	private JButton pesquisarButton;
	
	private JRadioButton suspensoRB;
	private JRadioButton atrasadoRB;
	private JRadioButton regularizadoRB;
	
	private ButtonGroup grupo;
	
	
	private ControllerPainelListarUsuario controller;
	
	
	public PainelListarUsuario() {
		setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Usuarios", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		this.tabelaAcervo = new TabelaPadrao("Acervo");
		this.tabelaAcervo.setColumns(new Object[] {"Id","Matricula","cpf","Nome","Professor","Codigo","Situação","E-mail","Telefone","Departamento"});
		this.tabelaAcervo.podeSelecionar(true);
		
		
		this.painelOpcoes = new JPanel();
		this.painelOpcoes.setBorder(new TitledBorder(new LineBorder(Color.DARK_GRAY, 2, true), "Solicitar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.painelOpcoes.setLayout(new GridLayout(0, 1, 0, 0));
		this.painelOpcoes.setBackground(Color.WHITE);
		
		this.painelPesquisa = new JPanel();
		painelPesquisa.setBackground(Color.WHITE);
		this.painelPesquisa.setBorder(new LineBorder(Color.DARK_GRAY, 2, true));
		
		this.pesquisarButton = new JButton("Regularizar");
		
		
		this.suspensoRB = new JRadioButton("Suspenso");
		
		suspensoRB.setBackground(Color.WHITE);
		this.suspensoRB.setSelected(true);
		this.atrasadoRB = new JRadioButton("Atrasado");
		atrasadoRB.setBackground(Color.WHITE);
		this.regularizadoRB = new JRadioButton("Regularizado");
		regularizadoRB.setBackground(Color.WHITE);
		
		this.grupo = new ButtonGroup();
		this.grupo.add(this.suspensoRB);
		this.grupo.add(this.atrasadoRB);
		this.grupo.add(this.regularizadoRB);
		
		
		this.ordemAdicaoPainel();
		
		this.controller = new ControllerPainelListarUsuario(this);
		
		this.suspensoRB.addActionListener(controller);
		this.atrasadoRB.addActionListener(controller);
		this.regularizadoRB.addActionListener(controller);
		
		this.pesquisarButton.addActionListener(controller);
		

		
	}
	

	public void ordemAdicaoPainel() {
		
		this.painelPesquisa.add(this.suspensoRB);
		this.painelPesquisa.add(this.atrasadoRB);
		this.painelPesquisa.add(this.regularizadoRB);
		this.add(this.painelPesquisa, BorderLayout.NORTH);
		this.add(tabelaAcervo,BorderLayout.CENTER);
		this.add(this.pesquisarButton,BorderLayout.SOUTH);
		
	}
	
	
	/*
	 * ============================GETs====================================
	 */
	
	
	public JPanel getPainelOpcoes() {
		return this.painelOpcoes;
	}

	public JPanel getPainelPesquisa() {
		return this.painelPesquisa;
	}
	
	public TabelaPadrao getTabelaAcervo() {
		return this.tabelaAcervo;
	}

	public JButton getPesquisarButton() {
		return pesquisarButton;
	}

	public JRadioButton getPalavraChaveRB() {
		return suspensoRB;
	}

	public JRadioButton getTituloRB() {
		return atrasadoRB;
	}

	public JRadioButton getEditoraRB() {
		return regularizadoRB;
	}

	public ButtonGroup getGrupo() {
		return grupo;
	}

}
