package br.com.view.funcionario.altera;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import br.com.controller.funcionario.altera.ControllerPainelAlteraAutor;

import net.miginfocom.swing.MigLayout;

public class PainelAlteraAutor extends JPanel{

	private static final long serialVersionUID = 1L;


	private JTextField nomeField;

	private JButton limparButton;
	private JButton cadastrarButton;

	private ControllerPainelAlteraAutor controller;

	private JTextField buscarField;
	private JLabel buscarLabel;
	private JButton buscarButton;
	private JButton excluirButton;



	public PainelAlteraAutor() {

		this.setBackground(Color.WHITE);
		this.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Alterar Autor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.controller = new ControllerPainelAlteraAutor(this);
		setLayout(new MigLayout("", "[146px][146px][146px]", "[92px][92px][92px]"));


		this.buscarLabel = new JLabel("Nome:");
		this.add(this.buscarLabel, "cell 0 0");

		this.buscarField = new JTextField();
		buscarField.setColumns(15);
		this.add(this.buscarField, "cell 1 0");

		this.buscarButton = new JButton("Buscar");
		this.buscarButton.addActionListener(controller);
		this.add(this.buscarButton, "cell 2 0");


		JLabel lblNome = new JLabel("Nome:");
		add(lblNome, "cell 0 1");

		this.nomeField = new JTextField();
		this.add(this.nomeField, "cell 1 1");
		this.nomeField.setColumns(15);

		excluirButton = new JButton("Excluir");
		excluirButton.addActionListener(controller);
		add(excluirButton, "flowx,cell 0 2");

		this.cadastrarButton = new JButton("Alterar");
		this.cadastrarButton.addActionListener(controller);

		this.limparButton = new JButton("Limpar");
		this.limparButton.addActionListener(controller);
		this.add(this.limparButton, "cell 1 2");
		this.add(this.cadastrarButton, "cell 2 2");

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
