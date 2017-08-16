package br.com.view.Antiga;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import br.com.controller.CTAcervoBiblioteca;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ButtonGroup;

import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;

public class TAcervoBiblioteca extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField buscaTF;

	private JRadioButton palavraChaveRB;
	private JRadioButton tituloRB;
	private JRadioButton editoraRB;
	private JRadioButton autorRB;

	private JButton buscarB;

	private ButtonGroup grupo;
	private JPanel resultsPanel;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel model;
	private CTAcervoBiblioteca controller;

	public TAcervoBiblioteca() {
		getContentPane().setBackground(Color.WHITE);
		setSize(800,600);
		controller = new CTAcervoBiblioteca(this);
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 128), 2, true), "Buscar Livro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new MigLayout("", "[][107px][57px][65px][1px][][grow][][grow]", "[25px,grow][]"));

		JLabel lblPesquisarPor = new JLabel("Buscar por:");
		lblPesquisarPor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblPesquisarPor, "cell 0 0");

		palavraChaveRB = new JRadioButton("Palavra-Chave");
		palavraChaveRB.setBackground(Color.WHITE);
		palavraChaveRB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		palavraChaveRB.setSelected(true);
		panel.add(palavraChaveRB, "cell 1 0,alignx left,aligny center");

		tituloRB = new JRadioButton("Titulo");
		tituloRB.setBackground(Color.WHITE);
		tituloRB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(tituloRB, "cell 2 0,alignx left,aligny center");

		editoraRB = new JRadioButton("Editora");
		editoraRB.setBackground(Color.WHITE);
		editoraRB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(editoraRB, "cell 3 0,alignx left,aligny center");

		autorRB = new JRadioButton("Autor");
		autorRB.setBackground(Color.WHITE);
		autorRB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(autorRB, "cell 5 0,aligny top");

		JLabel label = new JLabel("");
		panel.add(label, "flowx,cell 6 0");

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel.add(panel_1, "cell 8 0,grow");

		JLabel lblBusca = new JLabel("Busca:");
		lblBusca.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblBusca, "cell 0 1");

		buscaTF = new JTextField();
		panel.add(buscaTF, "cell 1 1 5 1,growx");
		buscaTF.setColumns(10);

		JLabel label_1 = new JLabel("");
		panel.add(label_1, "cell 6 0");

		buscarB = new JButton("Buscar");
		buscarB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		buscarB.addActionListener(controller);
		panel.add(buscarB, "cell 7 1");

		grupo = new ButtonGroup();
		grupo.add(autorRB);
		grupo.add(palavraChaveRB);
		grupo.add(tituloRB);
		grupo.add(editoraRB);

		resultsPanel = new JPanel();
		resultsPanel.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 128), 2, true), "Livros no Acervo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		resultsPanel.setBackground(Color.WHITE);
		getContentPane().add(resultsPanel, BorderLayout.CENTER);
		resultsPanel.setLayout(new BorderLayout(0, 0));

		model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Codigo");
		model.addColumn("Numero da edi��o");
		model.addColumn("Titulo");
		model.addColumn("Ano da publica��o");
		model.addColumn("Numero de exemplares");
		model.addColumn("Editora");
		model.addColumn("Autor");

		table = new JTable(model);
		table.setFont(new Font("Arial", Font.BOLD, 14));
		table.setCellEditor(null);
		table.setBackground(Color.WHITE);

		scrollPane = new JScrollPane(table);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBackground(Color.WHITE);
		resultsPanel.add(scrollPane, BorderLayout.CENTER);



		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	/*
	 * =========================================  GET and SET  ===================================================
	 */
	
	public JButton getBuscarB() {
		return buscarB;
	}

	public void setBuscarB(JButton buscarB) {
		this.buscarB = buscarB;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}

	public JTextField getBuscaTF() {
		return buscaTF;
	}

	public void setBuscaTF(JTextField buscaTF) {
		this.buscaTF = buscaTF;
	}

	public JRadioButton getPalavraChaveRB() {
		return palavraChaveRB;
	}

	public void setPalavraChaveRB(JRadioButton palavraChaveRB) {
		this.palavraChaveRB = palavraChaveRB;
	}

	public JRadioButton getTituloRB() {
		return tituloRB;
	}

	public void setTituloRB(JRadioButton tituloRB) {
		this.tituloRB = tituloRB;
	}

	public JRadioButton getEditoraRB() {
		return editoraRB;
	}

	public void setEditoraRB(JRadioButton editoraRB) {
		this.editoraRB = editoraRB;
	}

	public JRadioButton getAutorRB() {
		return autorRB;
	}

	public void setAutorRB(JRadioButton autorRB) {
		this.autorRB = autorRB;
	}

	public ButtonGroup getGrupo() {
		return grupo;
	}

	public void setGrupo(ButtonGroup grupo) {
		this.grupo = grupo;
	}

	public JPanel getResultsPanel() {
		return resultsPanel;
	}

	public void setResultsPanel(JPanel resultsPanel) {
		this.resultsPanel = resultsPanel;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}



}
