package br.com.view;

import javax.swing.JFrame;

import br.com.controller.CTUsuario;
import br.com.model.beans.Usuario;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;

public class TUsuario extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private Usuario usuarioLogado;
	
	private JButton minhaSituacaoB;
	private JButton meusEmprestimosB;
	
	private CTUsuario controller;
	
	public TUsuario(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
		setSize(383,94);
		controller = new CTUsuario(this);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		minhaSituacaoB = new JButton("Minha situa\u00E7\u00E3o");
		minhaSituacaoB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		minhaSituacaoB.addActionListener(controller);
		getContentPane().add(minhaSituacaoB);
		
		meusEmprestimosB = new JButton("Meus emprestimos");
		meusEmprestimosB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		meusEmprestimosB.addActionListener(controller);
		getContentPane().add(meusEmprestimosB);
		setVisible(true);
	}

	
	/*
	 * =========================================  GET and SET  ===================================================
	 */
	
	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}

	public JButton getMinhaSituacaoB() {
		return minhaSituacaoB;
	}

	public JButton getMeusEmprestimosB() {
		return meusEmprestimosB;
	}

	
}
