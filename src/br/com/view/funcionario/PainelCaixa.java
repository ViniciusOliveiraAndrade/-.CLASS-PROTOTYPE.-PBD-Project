package br.com.view.funcionario;

import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.border.TitledBorder;

import br.com.controller.funcionario.ControllerPainelCaixa;
import br.com.model.beans.Funcionario;
import br.com.view.primaria.TabelaPadrao;

import javax.swing.border.LineBorder;
import java.awt.BorderLayout;

import javax.swing.JButton;

public class PainelCaixa extends JPanel{

	private static final long serialVersionUID = 1L;

//	private JPanel painelPesquisa;
	private TabelaPadrao tabelaAcervo;

	private JButton pesquisarButton;

	private Funcionario funcionario;

	private ControllerPainelCaixa controller;

	public PainelCaixa() {
		setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Aprovar Emprestimo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));

	

		this.tabelaAcervo = new TabelaPadrao("Acervo");
		this.tabelaAcervo.setColumns(new Object[] {"Id","Data","Usuario","Multa"});
		this.tabelaAcervo.podeSelecionar(true);
		this.add(this.tabelaAcervo, BorderLayout.CENTER);

		this.pesquisarButton = new JButton("Atualizar");
		
//		
//		painelPesquisa.setBackground(Color.WHITE);
//		this.painelPesquisa.setBorder(new LineBorder(Color.DARK_GRAY, 2, true));
//		this.add(this.painelPesquisa,BorderLayout.NORTH);
		
		this.add(this.pesquisarButton, BorderLayout.SOUTH);
		
		controller = new ControllerPainelCaixa(this);

		this.pesquisarButton.addActionListener(controller);
//		this.controller.preencherTabela();
	}

	public TabelaPadrao getTabelaReservas() {
		return tabelaAcervo;
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




}
