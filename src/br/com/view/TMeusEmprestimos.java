package br.com.view;

import javax.swing.JFrame;

import br.com.controller.CTMeusEmprestimos;
import br.com.model.beans.Usuario;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class TMeusEmprestimos extends JFrame {
	

	private static final long serialVersionUID = 1L;
	
	private String cpfUsuarioLogado;
	
	private JScrollPane scrollPane;
	
	private JTable table;
	
	private DefaultTableModel model;
	
	private CTMeusEmprestimos controller;
	private JButton buscarB;
	
	public TMeusEmprestimos(Usuario user) {
		this.cpfUsuarioLogado = user.getCpf();
		setSize(500,500);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 128), 2, true),"Meus Emprestimos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BorderLayout(0, 0));
		
		model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Titulo do Livro");
		model.addColumn("Situação");
		model.addColumn("Data do Emprestimo");
		model.addColumn("Data presvista Entrega");
		model.addColumn("Data da Entrega");
		model.addColumn("Multa");
		model.addColumn("Funcionario Emprestimo");
		model.addColumn("Funcionario Devolução");
		
		table = new JTable(model);
		table.setFont(new Font("Arial", Font.BOLD, 14));
		table.setCellEditor(null);
		table.setBackground(Color.WHITE);
		
		scrollPane = new JScrollPane(table);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBackground(Color.WHITE);
		panel.add(scrollPane, BorderLayout.CENTER);
		
		getContentPane().add(panel, BorderLayout.CENTER);
		
		buscarB = new JButton("Buscar");
		getContentPane().add(buscarB, BorderLayout.NORTH);
		buscarB.setFont(new Font("Tahoma", Font.PLAIN, 13));

		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
		controller = new CTMeusEmprestimos(this);
		buscarB.addActionListener(controller);
	}
	/*
	 * =========================================  GET and SET  ===================================================
	 */
	

	public String getCpfUsuarioLogado() {
		return cpfUsuarioLogado;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public JButton getBuscarB() {
		return buscarB;
	}
	
	
}
