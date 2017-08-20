package br.com.view.funcionario.cadastro;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import br.com.controller.funcionario.cadastro.ControllerPainelCadastrarFuncionario;

import java.awt.GridLayout;

public class PainelCadastroFuncionario extends JPanel{

	private static final long serialVersionUID = 1L;


	private JTextField matriculaField;
	private JTextField nomeField;
	private JTextField cpfField;

	private JButton limparButton;
	private JButton cadastrarButton;

	private ControllerPainelCadastrarFuncionario controller;

	public PainelCadastroFuncionario() {

		this.setBackground(Color.WHITE);
		this.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Cadastro Funcionario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));	
		this.setLayout(new GridLayout(11, 2, 0, 0));
		this.controller = new ControllerPainelCadastrarFuncionario(this);

		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblNome);

		this.nomeField = new JTextField();
		this.nomeField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(this.nomeField);
		this.nomeField.setColumns(10);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblCpf);

		this.cpfField = new JTextField();
		this.cpfField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(this.cpfField);
		this.cpfField.setColumns(10);

		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(lblMatricula);

		this.matriculaField = new JTextField();
		this.matriculaField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(this.matriculaField);
		this.matriculaField.setColumns(10);

		this.limparButton = new JButton("Limpar");
		this.limparButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.limparButton.addActionListener(controller);
		this.add(this.limparButton);

		this.cadastrarButton = new JButton("Cadastrar");
		this.cadastrarButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.cadastrarButton.addActionListener(controller);
		this.add(this.cadastrarButton);

	}

	public JTextField getMatriculaField() {
		return matriculaField;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public JButton getLimparButton() {
		return limparButton;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}



}
