package br.com.view.primaria;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class TabelaPadrao extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel model;
	
	public TabelaPadrao(String titulo) {
		this.setBackground(Color.WHITE);
		this.setSize(500,500);
		
		this.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), titulo, TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.setBackground(Color.WHITE);
		this.setLayout(new BorderLayout(0,0));
		
		this.model = new DefaultTableModel();
		
		
		this.table = new JTable(this.model);
		this.table.setForeground(Color.DARK_GRAY);
		this.table.setFont(new Font("Arial", Font.BOLD, 14));
		this.table.setCellEditor(null);
		this.table.setBackground(Color.WHITE);
		
		
		this.scrollPane = new JScrollPane(this.table);
		this.scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		this.scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		this.scrollPane.setBackground(Color.WHITE);
		this.add(this.scrollPane, BorderLayout.CENTER);
		
		
	}
	/*
	 * =========================================  GET and SET  ===================================================
	 */
	public void setColumns(Object[] coolumn) {
		for (int i = 0; i < coolumn.length; i++) {
			this.model.addColumn(coolumn[i]);
		}
	}
	public void setRow(Object[] row) {
		this.model.addRow(row);
	}
	public DefaultTableModel getModel() {
		return model;
	}
	public void zerarTabela() {
		this.model.setNumRows(0);
	}
	
	
}
