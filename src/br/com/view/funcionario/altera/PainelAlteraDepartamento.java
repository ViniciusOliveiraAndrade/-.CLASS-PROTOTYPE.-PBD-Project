package br.com.view.funcionario.altera;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import br.com.controller.funcionario.altera.ControllerPainelAlteraDepartamento;

import java.awt.GridLayout;

public class PainelAlteraDepartamento extends JPanel{

	private static final long serialVersionUID = 1L;


	private JTextField nomeField;

	private JButton limparButton;
	private JButton cadastrarButton;

	private ControllerPainelAlteraDepartamento controller;
	
	private JTextField buscarField;
	private JLabel buscarLabel;
	private JButton buscarButton;
	private JButton excluirButton;

	public PainelAlteraDepartamento() {

		this.setBackground(Color.WHITE);
		this.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Cadastro Departamento", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));	
		this.setLayout(new GridLayout(10, 1, 0, 0));
		this.controller = new ControllerPainelAlteraDepartamento(this);

		this.buscarLabel = new JLabel("Nome:");
		this.add(this.buscarLabel);
		
		this.buscarField = new JTextField();
		buscarField.setColumns(15);
		this.add(this.buscarField);
		
		this.buscarButton = new JButton("Buscar");
		this.buscarButton.addActionListener(controller);
		this.add(this.buscarButton);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblNome);

		this.nomeField = new JTextField();
		this.nomeField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(this.nomeField);
		this.nomeField.setColumns(10);

		
		excluirButton = new JButton("Excluir");
		add(excluirButton);
		excluirButton.addActionListener(controller);
		
		this.limparButton = new JButton("Limpar");
		this.limparButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.limparButton.addActionListener(controller);
		this.add(this.limparButton);

		this.cadastrarButton = new JButton("Alterar");
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

	public JTextField getBuscarField() {
		return buscarField;
	}

	public JButton getBuscarButton() {
		return buscarButton;
	}

	public JButton getExcluirButton() {
		return excluirButton;
	}
	
}
