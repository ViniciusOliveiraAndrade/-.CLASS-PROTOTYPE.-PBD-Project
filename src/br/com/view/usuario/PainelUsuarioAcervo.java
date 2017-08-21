package br.com.view.usuario;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import br.com.controller.usuario.ControllerPainelUsuarioAcervo;
import br.com.model.beans.Usuario;
import br.com.view.primaria.TabelaPadrao;

public class PainelUsuarioAcervo extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JPanel painelOpcoes;
	private JPanel painelPesquisa;
	private TabelaPadrao tabelaAcervo;
	
//	private JButton solicitarEmprestimoButton;
	private JButton solicitarReservaButton;
	private JButton pesquisarButton;
	
	private JRadioButton palavraChaveRB;
	private JRadioButton tituloRB;
	private JRadioButton editoraRB;
	private JRadioButton autorRB;
	
	private ButtonGroup grupo;
	
	private JLabel lblPesquisar;
	
	private JTextField pesquisaField;
	
	private ControllerPainelUsuarioAcervo controller;
	
	private Usuario u;
	
	public PainelUsuarioAcervo(Usuario u) {
		this.u = u;
		this.tabelaAcervo = new TabelaPadrao("Acervo");
		this.tabelaAcervo.setColumns(new Object[] {"Id","Codigo","Titulo","Numero da edicao","Ano da publicacao","Numero de exemplares","Editora","Autor"});
		this.tabelaAcervo.podeSelecionar(true);
		this.controller = new ControllerPainelUsuarioAcervo(this);
		
		this.painelOpcoes = new JPanel();
		this.painelOpcoes.setBorder(new TitledBorder(new LineBorder(Color.DARK_GRAY, 2, true), "Solicitar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.painelOpcoes.setLayout(new GridLayout(0, 1, 0, 0));
		this.painelOpcoes.setBackground(Color.WHITE);
		
		this.painelPesquisa = new JPanel();
		painelPesquisa.setBackground(Color.WHITE);
		this.painelPesquisa.setBorder(new LineBorder(Color.DARK_GRAY, 2, true));
		
//		this.solicitarEmprestimoButton = new JButton("Emprestimo");
//		this.solicitarEmprestimoButton.addActionListener(controller);
		
		this.solicitarReservaButton = new JButton("Reserva");
		this.solicitarReservaButton.addActionListener(controller);
		
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
		
		
		this.pesquisaField = new JTextField();
		this.pesquisaField.setColumns(15);
		
		
		this.ordemAdicaoPainelOpcoes();
		this.ordemAdicaoPainelPesquisa();
				
	}
	

	public void ordemAdicaoPainelPesquisa() {
		this.painelPesquisa.add(this.lblPesquisar);
		
		this.painelPesquisa.add(this.pesquisaField);
		
		this.painelPesquisa.add(this.palavraChaveRB);
		this.painelPesquisa.add(this.tituloRB);
		this.painelPesquisa.add(this.editoraRB);
		this.painelPesquisa.add(this.autorRB);
		
		this.painelPesquisa.add(this.pesquisarButton);
		
	}
	
	public void ordemAdicaoPainelOpcoes(){
//		this.painelOpcoes.add(this.solicitarEmprestimoButton);
		this.painelOpcoes.add(this.solicitarReservaButton);
	}
		
	public void desativar() {
		this.tabelaAcervo.setVisible(false);
		this.painelOpcoes.setVisible(false);
		this.painelPesquisa.setVisible(false);
	}
	public void ativar() {
		this.tabelaAcervo.setVisible(true);
		this.painelOpcoes.setVisible(true);
		this.painelPesquisa.setVisible(true);
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

//	public JButton getSolicitarEmprestimoButton() {
//		return solicitarEmprestimoButton;
//	}

	public JButton getSolicitarReservaButton() {
		return solicitarReservaButton;
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


	public Usuario getU() {
		return u;
	}

}
