package br.com.view.funcionario.altera;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import br.com.controller.funcionario.altera.ControllerPainelAlteraLivro;

import java.awt.GridLayout;

public class PainelAlteraLivro extends JPanel{

	private static final long serialVersionUID = 1L;

	private JComboBox<String> autoresFields;

	private JTextField codigoField;
	private JTextField tituloField;
	private JTextField editoraField;
	private JTextField exemplaresField;
	private JTextField edicaoField;
	private JTextField DataPublicacaoField;

	private JButton limparButton;
	private JButton cadastrarButton;
	
	private JLabel codigoJLabel;
	private ControllerPainelAlteraLivro controller;
	
	private JTextField buscarField;
	private JLabel buscarLabel;
	private JButton buscarButton;
	private JButton excluirButton;

	public PainelAlteraLivro() {

		this.setBackground(Color.WHITE);
		this.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Cadastro Livro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));	
		this.setLayout(new GridLayout(20, 1, 0, 0));
		this.controller = new ControllerPainelAlteraLivro(this);


		this.buscarLabel = new JLabel("Titulo:");
		this.add(this.buscarLabel);
		
		this.buscarField = new JTextField();
		buscarField.setColumns(15);
		this.add(this.buscarField);
		
		this.buscarButton = new JButton("Buscar");
		this.buscarButton.addActionListener(controller);
		this.add(this.buscarButton);
		
		JLabel lblNome = new JLabel("Titulo:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblNome);

		this.tituloField = new JTextField();
		this.tituloField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(this.tituloField);
		this.tituloField.setColumns(10);

		JLabel lblCpf = new JLabel("Exemplares:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblCpf);

		this.exemplaresField = new JTextField();
		this.exemplaresField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(this.exemplaresField);
		this.exemplaresField.setColumns(10);


		JLabel lblEmail = new JLabel("Edição:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(lblEmail);

		this.edicaoField = new JTextField();
		this.edicaoField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(this.edicaoField);
		this.edicaoField.setColumns(10);


		JLabel lblMatricula = new JLabel("Editora:");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(lblMatricula);


		this.editoraField = new JTextField();
		this.editoraField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(this.editoraField);
		this.editoraField.setColumns(10);

		this.codigoJLabel = new JLabel("Codigo:");
		this.codigoJLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(this.codigoJLabel);

		this.codigoField = new JTextField();
		this.codigoField.setFont(new Font("Tahoma", Font.PLAIN, 13));	
		this.add(this.codigoField);
		this.codigoField.setColumns(10);

		JLabel lbl = new JLabel("Autor");
		lbl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(lbl);
		
		this.autoresFields = new JComboBox<>();
		this.autoresFields.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(this.autoresFields);
		
		JLabel lblD = new JLabel("Data Publicação");
		lblD.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(lblD);
		
		this.DataPublicacaoField = new JTextField();
		this.DataPublicacaoField.setFont(new Font("Tahoma", Font.PLAIN, 13));	
		this.add(this.DataPublicacaoField);
		this.DataPublicacaoField.setColumns(10);

		excluirButton = new JButton("Excluir");
		excluirButton.addActionListener(controller);
		add(excluirButton);
		
		this.limparButton = new JButton("Limpar");
		this.limparButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.limparButton.addActionListener(controller);
		this.add(this.limparButton);

		this.cadastrarButton = new JButton("Cadastrar");
		this.cadastrarButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.cadastrarButton.addActionListener(controller);
		this.add(this.cadastrarButton);
		
		this.controller.preencherAutores();
//		this.setVisible(true);
	}

	public JComboBox<String> getAutoresFields() {
		return autoresFields;
	}

	public JTextField getCodigoField() {
		return codigoField;
	}

	public JTextField getTituloField() {
		return tituloField;
	}

	public JTextField getEditoraField() {
		return editoraField;
	}

	public JTextField getExemplaresField() {
		return exemplaresField;
	}

	public JTextField getEdicaoField() {
		return edicaoField;
	}

	public JButton getLimparButton() {
		return limparButton;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JLabel getCodigoJLabel() {
		return codigoJLabel;
	}

	public JTextField getDataPublicacaoField() {
		return DataPublicacaoField;
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
