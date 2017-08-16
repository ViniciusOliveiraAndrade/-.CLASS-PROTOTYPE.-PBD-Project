package br.com.view.usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

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


	public PainelUsuario(Usuario usuario) {
		setBackground(Color.WHITE);

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
		this.acervoButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				painelReservas.desativar();
				painelEmprestimos.desativar();
				painelStatus.desativar();
				add(painelAcervo.getTabelaAvervo(), BorderLayout.CENTER);
				add(painelAcervo.getPainelOpcoes(), BorderLayout.EAST);
				add(painelAcervo.getPainelPesquisa(), BorderLayout.SOUTH);
				painelAcervo.ativar();

			}
		});

		this.painelDeMenus.add(this.acervoButton);

		this.emprestimosButton = new JButton("Meus Emprestimos");
		this.emprestimosButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				painelStatus.desativar();
				painelAcervo.desativar();
				painelReservas.desativar();
				add(painelEmprestimos, BorderLayout.CENTER);
				painelEmprestimos.ativar();

			}
		});
		this.painelDeMenus.add(this.emprestimosButton);

		this.reservasButton = new JButton("Minhas Reservas");
		this.reservasButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				painelStatus.desativar();
				painelAcervo.desativar();
				painelEmprestimos.desativar();
				add(painelReservas, BorderLayout.CENTER);
				painelReservas.ativar();
				

			}
		});
		this.painelDeMenus.add(this.reservasButton);

		this.meusStatusButton = new JButton("Meus Status");
		this.meusStatusButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				painelReservas.desativar();
				painelEmprestimos.desativar();
				painelAcervo.desativar();
				add(painelStatus, BorderLayout.CENTER);
				painelStatus.ativar();
			}
		});
		this.painelDeMenus.add(this.meusStatusButton);

		this.deslogarButton = new JButton("Deslogar");
		this.painelDeMenus.add(this.deslogarButton);


		/*
		 * Outros
		 */

		JLabel lblBemVindo = new JLabel("Bem Vindo,");
		this.painelInformacao.add(lblBemVindo);

		this.nomeUsuarioLabel = new JLabel(usuario.getNome());
		this.painelInformacao.add(this.nomeUsuarioLabel);

		JLabel lblSituao = new JLabel("              Situação:");
		this.painelInformacao.add(lblSituao);

		this.stituaçãoLabel = new JLabel(usuario.getSituacao());
		this.painelInformacao.add(this.stituaçãoLabel);
		this.usuario = usuario;

		iniciarTabelas();

	}

	public void iniciarTabelas() {

		this.painelAcervo = new PainelUsuarioAcervo();
		this.painelAcervo.desativar();

		this.painelStatus = new PainelUsuarioStatus(usuario);
		//		this.add(this.painelStatus, BorderLayout.CENTER);
		this.painelStatus.desativar();

		this.painelEmprestimos = new PainelUsuarioEmprestimos(usuario);
		this.painelEmprestimos.desativar();

		this.painelReservas = new PainelUsuarioReservas(usuario);
		this.painelReservas.desativar();

	}


	public PainelUsuarioAcervo getPainelAcervo() {
		return painelAcervo;
	}


	public PainelUsuarioStatus getPainelStatus() {
		return painelStatus;
	}








}
