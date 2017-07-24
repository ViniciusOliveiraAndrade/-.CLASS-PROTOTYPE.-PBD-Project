package br.com.view;

import javax.swing.JFrame;

import br.com.model.Usuario;

public class TUsuario extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private Usuario usuarioLogado;
	
	public TUsuario(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
		setSize(50,50);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	/*
	 * =========================================  GET and SET  ===================================================
	 */

}
