package br.com.view.Antiga;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import br.com.controller.CTLogin;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

public class TLogin extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JTextField matriculaTF;
	private JTextField cpfTF;
	
	private JButton ancelarB;
	private JButton logarB;
	
	private CTLogin controller;
	
	public TLogin() {
		setResizable(false);
		getContentPane().setBackground(Color.WHITE);
		setSize(206,153);
		controller = new CTLogin(this);
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.GRAY, 1, true));
		panel.setBackground(Color.WHITE);
		panel.setLayout(new MigLayout("", "[57px][86px][27px][86px]", "[20px][]"));
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setVerticalAlignment(SwingConstants.TOP);
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblMatricula, "cell 0 0,alignx left,aligny center");
		
		matriculaTF = new JTextField();
		matriculaTF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		matriculaTF.setHorizontalAlignment(SwingConstants.LEFT);
		matriculaTF.setBackground(Color.WHITE);
		panel.add(matriculaTF, "cell 1 0 3 1,alignx left,aligny top");
		matriculaTF.setColumns(10);
		getContentPane().add(panel);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblCpf, "cell 0 1,alignx left,aligny center");
		
		cpfTF = new JTextField();
		cpfTF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cpfTF.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(cpfTF, "cell 1 1 3 1,alignx left,aligny top");
		cpfTF.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.GRAY, 1, true));
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(new MigLayout("", "[83px][65px]", "[25px]"));
		
		ancelarB = new JButton("Cancelar");
		panel_1.add(ancelarB, "cell 0 0,alignx left,aligny center");
		ancelarB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(panel_1);
		
		logarB = new JButton("Logar");
		panel_1.add(logarB, "cell 1 0,alignx left,aligny center");
		logarB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		logarB.addActionListener(controller);
		ancelarB.addActionListener(controller);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	
	/*
	 * =========================================  GET and SET  ===================================================
	 */

	public JTextField getMatriculaTF() {
		return matriculaTF;
	}


	public JTextField getCpfTF() {
		return cpfTF;
	}


	public JButton getAncelarB() {
		return ancelarB;
	}


	public JButton getLogarB() {
		return logarB;
	}
	
	
	public static void main(String[] args) {
		new TLogin();
	}

}
