package br.com.view.test;

import javax.swing.JFrame;

import br.com.model.beans.Funcionario;
import br.com.model.beans.Usuario;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

public class TelaPrincipal extends JFrame{
	
	
	private static final long serialVersionUID = 1L;
	private Funcionario funcionarioLogado = null;
	private Usuario usuarioLogado = null;
	
	/*
	 * Paineis
	 */
	
	private JPanel paineldeUsuario;
	private JPanel painelDeMenus;
	private JPanel painelInformacao;
	private JPanel acervoOpcoes;
	private JPanel painelPesquisa;
	private TabelaPadrao acervoPainel;
	/*
	 * Botões
	 */
	private JButton acervoButton;
	private JButton emprestimosButton;
	private JButton reservasButton;
	private JButton meusStatusButton;
	private JButton deslogarButton;
	private JButton solicitarEmprestimoButton;
	private JButton solicitarReservaButton;
	private JButton pesquisarButton;
	
	
	/*
	 *RaioButtons 
	 */
	private JRadioButton palavraChaveRB;
	private JRadioButton tituloRB;
	private JRadioButton editoraRB;
	private JRadioButton autorRB;
	private ButtonGroup grupo;

	/*
	 * Outros
	 */
	
	private JLabel nomeUsuarioLabel;
	private JLabel stituaçãoLabel;
	private JLabel lblPesquisar;
	private JTextField pesquisaField;
	
	
	
	private PainelInicial painelInicial;
	private JPanel painelStatus;
	private JLabel lblNome;
	private JLabel lblEmail;
	private JLabel lblCpf;
	private JLabel lblMatricula;
	private JLabel lblTelefone;
	private JLabel lblSituao_1;
	private JLabel label;
	
	
	
	public TelaPrincipal() {
		super("Biblioteca");
		setSize(820,600);
//		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		
		/*
		 * Paineis
		 */
		paineldeUsuario = new JPanel();
		getContentPane().add(paineldeUsuario);
		paineldeUsuario.setLayout(new BorderLayout(0, 0));
		
		painelDeMenus = new JPanel();
		painelDeMenus.setBorder(new LineBorder(new Color(0, 0, 0)));
		paineldeUsuario.add(painelDeMenus, BorderLayout.WEST);
		painelDeMenus.setLayout(new GridLayout(0, 1, 0, 0));

		painelInformacao = new JPanel();
		painelInformacao.setBorder(new LineBorder(new Color(0, 0, 0)));
		paineldeUsuario.add(painelInformacao, BorderLayout.NORTH);
		
		acervoOpcoes = new JPanel();
		acervoOpcoes.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Solicitar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
//		paineldeUsuario.add(acervoOpcoes, BorderLayout.EAST);
		acervoOpcoes.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		acervoPainel = new TabelaPadrao("Acervo");
		acervoPainel.setColumns(new Object[] {"Id","Codigo","Titulo","Numero da edicao","Ano da publicacao","Numero de exemplares","Editora","Autor"});
//		paineldeUsuario.add(acervoPainel, BorderLayout.CENTER);
		
		painelPesquisa = new JPanel();
		painelPesquisa.setBorder(new LineBorder(new Color(0, 0, 0)));
//		paineldeUsuario.add(painelPesquisa, BorderLayout.SOUTH);
		
		
		/*
		 * Botões
		 */
		
		acervoButton = new JButton("Acervo");
		acervoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desativarAcervoArea();
			}
		});
		painelDeMenus.add(acervoButton);
		
		emprestimosButton = new JButton("Meus Emprestimos");
		painelDeMenus.add(emprestimosButton);
		
		reservasButton = new JButton("Minhas Reservas");
		painelDeMenus.add(reservasButton);
		
		meusStatusButton = new JButton("Meus Status");
		painelDeMenus.add(meusStatusButton);
		
		deslogarButton = new JButton("Deslogar");
		painelDeMenus.add(deslogarButton);
		
		solicitarEmprestimoButton = new JButton("Emprestimo");
		acervoOpcoes.add(solicitarEmprestimoButton);
		
		solicitarReservaButton = new JButton("Reserva");
		acervoOpcoes.add(solicitarReservaButton);
		
		pesquisarButton = new JButton("Pesquisar");
	
		/*
		 * Outros
		 */
		
		JLabel lblBemVindo = new JLabel("Bem Vindo,");
		painelInformacao.add(lblBemVindo);
		
		nomeUsuarioLabel = new JLabel("Vinicius");
		painelInformacao.add(nomeUsuarioLabel);
		
		JLabel lblSituao = new JLabel("              Situação:");
		painelInformacao.add(lblSituao);
		
		stituaçãoLabel = new JLabel("Normal");
		painelInformacao.add(stituaçãoLabel);
		
		painelStatus = new JPanel();
		painelStatus.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Meus Status", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		paineldeUsuario.add(painelStatus, BorderLayout.CENTER);
		painelStatus.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		lblNome = new JLabel("Nome:");
		painelStatus.add(lblNome, "2, 2");
		
		lblEmail = new JLabel("Email:");
		painelStatus.add(lblEmail, "2, 4");
		
		lblCpf = new JLabel("CPF:");
		painelStatus.add(lblCpf, "2, 6");
		
		lblMatricula = new JLabel("Matricula:");
		painelStatus.add(lblMatricula, "2, 8");
		
		lblTelefone = new JLabel("Telefone:");
		painelStatus.add(lblTelefone, "2, 10");
		
		lblSituao_1 = new JLabel("Situação:");
		painelStatus.add(lblSituao_1, "2, 12");
		
		label = new JLabel("New label");
		painelStatus.add(label, "2, 14");
		

		lblPesquisar = new JLabel("Pesquisar:");
		painelPesquisa.add(lblPesquisar);
		
		pesquisaField = new JTextField();
		pesquisaField.setColumns(15);
		painelPesquisa.add(pesquisaField);
		
		
		/*
		 * RaioButton
		 */
		
		palavraChaveRB = new JRadioButton("Palavra-Chave");
		palavraChaveRB.setSelected(true);
		painelPesquisa.add(palavraChaveRB);
		
		tituloRB = new JRadioButton("Titulo");
		painelPesquisa.add(tituloRB);
		
		editoraRB = new JRadioButton("Editora");
		painelPesquisa.add(editoraRB);
		
		autorRB = new JRadioButton("Autor");
		painelPesquisa.add(autorRB);
		
		grupo = new ButtonGroup();
		grupo.add(autorRB);
		grupo.add(palavraChaveRB);
		grupo.add(tituloRB);
		grupo.add(editoraRB);
		
		pesquisarButton = new JButton("Pesquisar");
		painelPesquisa.add(pesquisarButton);
//		desativarAcervoArea();
		
		
		
//		painelInicial = new PainelInicial();
//		getContentPane().add(painelInicial);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}
	
	public void desativarAcervoArea() {
		acervoPainel.setVisible(false);
		acervoOpcoes.setVisible(false);
		painelPesquisa.setVisible(false);
	}
	public void iniciarPainelUsuario() {}
	
	public void iniciarPainelFuncionario() {}

}
