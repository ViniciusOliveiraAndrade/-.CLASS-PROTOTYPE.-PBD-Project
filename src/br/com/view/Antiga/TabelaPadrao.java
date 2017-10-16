package br.com.view.Antiga;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
//import java.util.List;
//import java.util.Vector;

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
		setSize(500,500);
		
		setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 128), 2, true), titulo, TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0,0));
		
		model = new DefaultTableModel();
		
		table = new JTable(model);
		table.setFont(new Font("Arial", Font.BOLD, 14));
		table.setCellEditor(null);
		table.setBackground(Color.WHITE);
		
		scrollPane = new JScrollPane(table);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBackground(Color.WHITE);
		add(scrollPane, BorderLayout.CENTER);
		
		
	}
	/*
	 * =========================================  GET and SET  ===================================================
	 */
	public void setColumn(Object[] coolumn) {
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
	
	
}
