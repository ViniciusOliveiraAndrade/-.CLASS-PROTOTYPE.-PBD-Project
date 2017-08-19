package br.com.view.usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import br.com.controller.primaria.ControllerTelaPrincipal;
import br.com.controller.usuario.ControllerPainelUsuario;
import br.com.model.beans.Usuario;

public class PainelUsuario extends JPanel{

	private static final long serialVersionUID = 1L;

	/*
	 * Paineis
	 */

	private JPanel painelDeMenus;
	private JPanel painelInformacao;
	private PainelUsuarioAcervo painelAcervo;
	private PainelUsuarioStatus painelStatus;
	private PainelUsuarioEmprestimos painelEmprestimos;
	private PainelUsuarioReservas painelReservas;

	/*
	 * Botões
	 */

	private JButton acervoButton;
	private JButton emprestimosButton;
	private JButton reservasButton;
	private JButton meusStatusButton;
	private JButton deslogarButton;

	/*
	 * Outros
	 */

	private JLabel nomeUsuarioLabel;
	private JLabel stituaçãoLabel;

	private Usuario usuario;

	private ControllerPainelUsuario controller;

	public PainelUsuario(Usuario usuario, ControllerTelaPrincipal c) {
		setBackground(Color.WHITE);
		this.usuario = usuario;
		controller = new ControllerPainelUsuario(this, c);
		
		this.setLayout(new BorderLayout(0, 0));
		/*
		 * Paineis
		 */
		this.painelDeMenus = new JPanel();
		painelDeMenus.setBackground(Color.WHITE);
		this.painelDeMenus.setBorder(new LineBorder(Color.DARK_GRAY, 2, true));
		this.add(this.painelDeMenus, BorderLayout.WEST);
		this.painelDeMenus.setLayout(new GridLayout(0, 1, 0, 0));

		this.painelInformacao = new JPanel();
		painelInformacao.setBackground(Color.WHITE);
		this.painelInformacao.setBorder(new LineBorder(Color.DARK_GRAY, 2, true));
		this.add(this.painelInformacao, BorderLayout.NORTH);

		/*
		 * Butôes
		 */

		this.acervoButton = new JButton("Acervo");
		this.acervoButton.addActionListener(controller);

		this.painelDeMenus.add(this.acervoButton);

		this.emprestimosButton = new JButton("Meus Emprestimos");
		this.emprestimosButton.addActionListener(controller);
		
		this.painelDeMenus.add(this.emprestimosButton);

		this.reservasButton = new JButton("Minhas Reservas");
		this.reservasButton.addActionListener(controller);
		
		this.painelDeMenus.add(this.reservasButton);

		this.meusStatusButton = new JButton("Meus Status");
		this.meusStatusButton.addActionListener(controller);

		this.painelDeMenus.add(this.meusStatusButton);

		this.deslogarButton = new JButton("Deslogar");
		this.deslogarButton.addActionListener(controller);
		
		this.painelDeMenus.add(this.deslogarButton);


		/*
		 * Outros
		 */

		JLabel lblBemVindo = new JLabel("Bem Vindo,");
		this.painelInformacao.add(lblBemVindo);

		this.nomeUsuarioLabel = new JLabel(this.usuario.getNome());
		this.painelInformacao.add(this.nomeUsuarioLabel);

		JLabel lblSituao = new JLabel("              Situação:");
		this.painelInformacao.add(lblSituao);

		this.stituaçãoLabel = new JLabel(this.usuario.getSituacao());
		this.painelInformacao.add(this.stituaçãoLabel);
		

		iniciarTabelas();

	}

	public void iniciarTabelas() {

		this.painelAcervo = new PainelUsuarioAcervo();
		this.painelAcervo.desativar();

		this.painelStatus = new PainelUsuarioStatus(this.usuario);
		//		this.add(this.painelStatus, BorderLayout.CENTER);
		this.painelStatus.desativar();

		this.painelEmprestimos = new PainelUsuarioEmprestimos(this.usuario.getCpf());
		this.painelEmprestimos.desativar();

		this.painelReservas = new PainelUsuarioReservas(this.usuario.getCpf());
		this.painelReservas.desativar();

	}

	public JButton getAcervoButton() {
		return acervoButton;
	}

	public JButton getEmprestimosButton() {
		return emprestimosButton;
	}

	public JButton getReservasButton() {
		return reservasButton;
	}

	public JButton getMeusStatusButton() {
		return meusStatusButton;
	}

	public JButton getDeslogarButton() {
		return deslogarButton;
	}

	public JPanel getPainelDeMenus() {
		return painelDeMenus;
	}

	public PainelUsuarioAcervo getPainelAcervo() {
		return painelAcervo;
	}

	public PainelUsuarioStatus getPainelStatus() {
		return painelStatus;
	}

	public PainelUsuarioEmprestimos getPainelEmprestimos() {
		return painelEmprestimos;
	}

	public PainelUsuarioReservas getPainelReservas() {
		return painelReservas;
	}

}
