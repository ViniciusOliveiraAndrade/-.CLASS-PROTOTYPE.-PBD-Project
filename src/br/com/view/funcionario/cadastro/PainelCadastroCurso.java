package br.com.view.funcionario.cadastro;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import br.com.controller.funcionario.cadastro.ControllerPainelCadastrarCurso;

import java.awt.GridLayout;

public class PainelCadastroCurso extends JPanel{

	private static final long serialVersionUID = 1L;

	private JComboBox<String> cursoFields;

	private JTextField nomeField;

	private JButton limparButton;
	private JButton cadastrarButton;
	
	

	private ControllerPainelCadastrarCurso controller;

	public PainelCadastroCurso() {

		this.setBackground(Color.WHITE);
		this.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Cadastro Curso", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));	
		this.setLayout(new GridLayout(11, 2, 0, 0));
		this.controller = new ControllerPainelCadastrarCurso(this);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblNome);

		this.nomeField = new JTextField();
		this.nomeField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(this.nomeField);
		this.nomeField.setColumns(10);
		
		JLabel lbl = new JLabel("Departamento");
		lbl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(lbl);
		
		this.cursoFields = new JComboBox<>();
		this.cursoFields.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(this.cursoFields);

		this.limparButton = new JButton("Limpar");
		this.limparButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.limparButton.addActionListener(controller);
		this.add(this.limparButton);

		this.cadastrarButton = new JButton("Cadastrar");
		this.cadastrarButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.cadastrarButton.addActionListener(controller);
		this.add(this.cadastrarButton);
		
		this.controller.preencherDepartamentos();
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

	public JComboBox<String> getDepartamentoFields() {
		return cursoFields;
	}


}
