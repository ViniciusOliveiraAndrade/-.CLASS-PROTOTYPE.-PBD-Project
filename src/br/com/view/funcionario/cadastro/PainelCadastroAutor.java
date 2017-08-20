package br.com.view.funcionario.cadastro;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import br.com.controller.funcionario.cadastro.ControllerPainelCadastrarAutor;

import java.awt.GridLayout;

public class PainelCadastroAutor extends JPanel{

	private static final long serialVersionUID = 1L;


	private JTextField nomeField;

	private JButton limparButton;
	private JButton cadastrarButton;

	private ControllerPainelCadastrarAutor controller;

	public PainelCadastroAutor() {

		this.setBackground(Color.WHITE);
		this.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Cadastro Autor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));	
		this.setLayout(new GridLayout(11, 2, 0, 0));
		this.controller = new ControllerPainelCadastrarAutor(this);

		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblNome);

		this.nomeField = new JTextField();
		this.nomeField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(this.nomeField);
		this.nomeField.setColumns(10);

		this.limparButton = new JButton("Limpar");
		this.limparButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.limparButton.addActionListener(controller);
		this.add(this.limparButton);

		this.cadastrarButton = new JButton("Cadastrar");
		this.cadastrarButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.cadastrarButton.addActionListener(controller);
		this.add(this.cadastrarButton);

	}

	

	public JTextField getNomeField() {
		return nomeField;
	}

	public JButton getLimparButton() {
		return limparButton;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}



}
