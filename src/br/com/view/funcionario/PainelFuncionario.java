package br.com.view.funcionario;

import javax.swing.JPanel;

import br.com.controller.funcionario.ControllerPainelFuncionario;
import br.com.controller.primaria.ControllerTelaPrincipal;
import br.com.model.beans.Funcionario;
import br.com.view.funcionario.altera.PainelAlteraAutor;
import br.com.view.funcionario.altera.PainelAlteraCurso;
import br.com.view.funcionario.altera.PainelAlteraDepartamento;
import br.com.view.funcionario.altera.PainelAlteraFuncionario;
import br.com.view.funcionario.altera.PainelAlteraLivro;
import br.com.view.funcionario.altera.PainelAlteraUsuario;
import br.com.view.funcionario.cadastro.PainelCadastroAutor;
import br.com.view.funcionario.cadastro.PainelCadastroCurso;
import br.com.view.funcionario.cadastro.PainelCadastroDepartamento;
import br.com.view.funcionario.cadastro.PainelCadastroFuncionario;
import br.com.view.funcionario.cadastro.PainelCadastroLivro;
import br.com.view.funcionario.cadastro.PainelCadastroUsuario;

import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.GridLayout;
import javax.swing.border.TitledBorder;

public class PainelFuncionario extends JPanel {

	private static final long serialVersionUID = 1L;

	private Funcionario funcionario;

	/*
	 * Paineis
	 */
	private JPanel painelMenu;
	private JPanel painelCadastrarOpcoes;
	private JPanel painelAtualizarOpcoes;
	private JPanel painelAprovarOpcoes;
	private JPanel painelRealizarOpcoes;
	
	private PainelCadastroUsuario painelCadastroUsuario;
	private PainelCadastroLivro painelCadastroLivro;
	private PainelCadastroFuncionario painelCadastroFuncionario;
	private PainelCadastroAutor painelCadastroAutor;
	private PainelCadastroDepartamento painelCadastroDepartamento;
	private PainelCadastroCurso painelCadastroCurso;
	
	private PainelAlteraUsuario painelAlteraUsuario;
	private PainelAlteraLivro painelAlteraLivro;
	private PainelAlteraFuncionario painelAlteraFuncionario;
	private PainelAlteraAutor painelAlteraAutor;
	private PainelAlteraDepartamento painelAlteraDepartamento;
	private PainelAlteraCurso painelAlteraCurso;
	/*
	 * Butões
	 */

	private JButton cadastrarButton;
	private JButton autalizarButton;
	private JButton listarButton;
	private JButton aprovarButton;
	private JButton realizarButton;
	private JButton caixaButton;
	private JButton deslogarButton;

	private JButton cOLivroButton;
	private JButton cOAutorButton;
	private JButton cOUsuarioButton;
	private JButton cOFuncionarioButton ;
	private JButton cOCursoButton;
	private JButton cODepartamentoButton;

	private JButton aOLivroButton;
	private JButton aOAutorButton;
	private JButton aOUsuarioButton;
	private JButton aOFuncionarioButton;
	private JButton aOCursoButton;
	private JButton aODepartamentoButton;

	private JButton apOEmprestimoButton;
	private JButton apOReservaButton;

	private JButton rOEmprestimoButton;
	private JButton rOReservaButton;

	private ControllerPainelFuncionario controller;
	
	private TelaPadrao telaPadrao;
	
	public PainelFuncionario(Funcionario funcionario,ControllerTelaPrincipal c) {

		setBackground(Color.WHITE);
		this.funcionario = funcionario;
		setLayout(new BorderLayout(0, 0));
		this.controller = new ControllerPainelFuncionario(this,c);

		criarPainelMenu();
		criarPainelCadastrarOpcoes();
		criarPainelAprovarOpcoes();
		criarPainelAtualizarOpcoes();
		criarPainelRelizarOpcoes();


	}

	/*
	 * Criação	
	 */

	public void criarPainelMenu() {
		this.painelMenu = new JPanel();
		this.painelMenu.setBackground(Color.WHITE);
		this.painelMenu.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Menu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.add(this.painelMenu, BorderLayout.WEST);
		this.painelMenu.setLayout(new GridLayout(0, 1, 0, 0));

		this.cadastrarButton = new JButton("Cadastrar");
		this.cadastrarButton.addActionListener(controller);
		this.painelMenu.add(this.cadastrarButton);

		this.autalizarButton = new JButton("Atualizar");
		this.autalizarButton.addActionListener(controller);
		this.painelMenu.add(this.autalizarButton);

		this.listarButton = new JButton("Listar");
		this.listarButton.addActionListener(controller);
		this.painelMenu.add(this.listarButton);

		this.aprovarButton = new JButton("Aprovar");
		this.aprovarButton.addActionListener(controller);
		this.painelMenu.add(this.aprovarButton);

		this.realizarButton = new JButton("Realizar");
		this.realizarButton.addActionListener(controller);
		this.painelMenu.add(this.realizarButton);

		this.caixaButton = new JButton("Caixa");
		this.caixaButton.addActionListener(controller);
		this.painelMenu.add(this.caixaButton);

		this.deslogarButton = new JButton("Deslogar");
		this.deslogarButton.addActionListener(controller);
		this.painelMenu.add(this.deslogarButton);
		
		
	}

	public void criarPainelCadastrarOpcoes() {
		
		this.painelCadastrarOpcoes = new JPanel();
		this.painelCadastrarOpcoes.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Cadastro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.painelCadastrarOpcoes.setBackground(Color.WHITE);
		this.painelCadastrarOpcoes.setLayout(new GridLayout(0, 1, 0, 0));

		this.cOLivroButton = new JButton("Livro");
		this.cOLivroButton.addActionListener(controller);
		this.painelCadastrarOpcoes.add(this.cOLivroButton);

		this.cOAutorButton = new JButton("Autor");
		this.cOAutorButton.addActionListener(controller);
		this.painelCadastrarOpcoes.add(this.cOAutorButton);

		this.cOUsuarioButton = new JButton("Usuario");
		this.cOUsuarioButton.addActionListener(controller);
		this.painelCadastrarOpcoes.add(this.cOUsuarioButton);

		this.cOFuncionarioButton = new JButton("Funcionario");
		this.cOFuncionarioButton.addActionListener(controller);
		this.painelCadastrarOpcoes.add(this.cOFuncionarioButton);

		this.cOCursoButton = new JButton("Curso");
		this.cOCursoButton.addActionListener(controller);
		this.painelCadastrarOpcoes.add(this.cOCursoButton);

		this.cODepartamentoButton = new JButton("Departamento");
		this.cODepartamentoButton.addActionListener(controller);
		this.painelCadastrarOpcoes.add(this.cODepartamentoButton);

		this.painelCadastrarOpcoes.setVisible(false);
	}

	public void criarPainelAtualizarOpcoes() {
		
		this.painelAtualizarOpcoes = new JPanel();
		this.painelAtualizarOpcoes.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Atualizar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.painelAtualizarOpcoes.setBackground(Color.WHITE);
		this.painelAtualizarOpcoes.setLayout(new GridLayout(0, 1, 0, 0));

		this.aOLivroButton = new JButton("Livro");
		this.aOLivroButton.addActionListener(controller);
		this.painelAtualizarOpcoes.add(this.aOLivroButton);

		this.aOAutorButton = new JButton("Autor");
		this.aOAutorButton.addActionListener(controller);
		this.painelAtualizarOpcoes.add(this.aOAutorButton);

		this.aOUsuarioButton = new JButton("Usuario");
		this.aOUsuarioButton.addActionListener(controller);
		this.painelAtualizarOpcoes.add(this.aOUsuarioButton);

		this.aOFuncionarioButton = new JButton("Funcionario");
		this.aOFuncionarioButton.addActionListener(controller);
		this.painelAtualizarOpcoes.add(this.aOFuncionarioButton);

		this.aOCursoButton = new JButton("Curso");
		this.aOCursoButton.addActionListener(controller);
		this.painelAtualizarOpcoes.add(this.aOCursoButton);

		this.aODepartamentoButton = new JButton("Departamento");
		this.aODepartamentoButton.addActionListener(controller);
		this.painelAtualizarOpcoes.add(this.aODepartamentoButton);

		this.painelAtualizarOpcoes.setVisible(false);
	}

	public void criarPainelAprovarOpcoes() {
		
		this.painelAprovarOpcoes = new JPanel();
		this.painelAprovarOpcoes.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Aprovar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.painelAprovarOpcoes.setBackground(Color.WHITE);
		this.painelAprovarOpcoes.setLayout(new GridLayout(0, 1, 0, 0));

		this.apOEmprestimoButton = new JButton("Emprestimo");
		this.apOEmprestimoButton.addActionListener(controller);
		this.painelAprovarOpcoes.add(this.apOEmprestimoButton);

		this.apOReservaButton = new JButton("Reserva");
		this.apOReservaButton.addActionListener(controller);
		this.painelAprovarOpcoes.add(this.apOReservaButton);

		this.painelAprovarOpcoes.setVisible(false);
	}

	public void criarPainelRelizarOpcoes() {

		this.painelRealizarOpcoes = new JPanel();
		this.painelRealizarOpcoes.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Realizar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.painelRealizarOpcoes.setBackground(Color.WHITE);
		this.painelRealizarOpcoes.setLayout(new GridLayout(0, 1, 0, 0));

		this.rOEmprestimoButton = new JButton("Emprestimo");
		this.rOEmprestimoButton.addActionListener(controller);
		this.painelRealizarOpcoes.add(this.rOEmprestimoButton);

		this.rOReservaButton = new JButton("Reserva");
		this.rOReservaButton.addActionListener(controller);
		this.painelRealizarOpcoes.add(this.rOReservaButton);

		this.painelRealizarOpcoes.setVisible(false);
	}

//	public void limparCentro(){
//		try {
//			BorderLayout layout = (BorderLayout) getLayout();
//			remove(layout.getLayoutComponent(BorderLayout.CENTER));
//		} catch (Exception e) {}
//	}
	
	//TelasCadastro
	public void criarPainelCadastrarUsuario() {
//		limparCentro();
//		this.painelCadastroUsuario = new PainelCadastroUsuario();
//		this.add(this.painelCadastroUsuario, BorderLayout.CENTER);
//		this.painelCadastroUsuario.setVisible(true);
		this.painelCadastroUsuario = new PainelCadastroUsuario();
		this.telaPadrao = new TelaPadrao("Cadastro Usuario", this.painelCadastroUsuario);
	}
	
	public void criarPainelCadastrarFuncionario() {
		this.painelCadastroFuncionario = new PainelCadastroFuncionario();
		this.telaPadrao = new TelaPadrao("Cadastro Funcionario", this.painelCadastroFuncionario);
	}
	
	public void criarPainelCadastrarAutor() {
		this.painelCadastroAutor = new PainelCadastroAutor();
		this.telaPadrao = new TelaPadrao("Cadastro Autor", this.painelCadastroAutor);
	}
	
	public void criarPainelCadastrarLivro() {
		this.painelCadastroLivro = new PainelCadastroLivro();
		this.telaPadrao = new TelaPadrao("Cadastro Livro", this.painelCadastroLivro);
	}
	
	public void criarPainelCadastrarCurso() {
		this.painelCadastroCurso = new PainelCadastroCurso();
		this.telaPadrao = new TelaPadrao("Cadastro Curso", this.painelCadastroCurso);
	}
	
	public void criarPainelCadastrarDepartamento() {
		this.painelCadastroDepartamento = new PainelCadastroDepartamento();
		this.telaPadrao = new TelaPadrao("Cadastro Departamento", this.painelCadastroDepartamento);
	}
	
	//Telas Alterar
	

	public void criarPainelAlteraUsuario() {
		this.painelAlteraUsuario = new PainelAlteraUsuario();
		this.telaPadrao = new TelaPadrao("Altera Usuario", this.painelAlteraUsuario);
	}
	
	public void criarPainelAlteraFuncionario() {
		this.painelAlteraFuncionario = new PainelAlteraFuncionario();
		this.telaPadrao = new TelaPadrao("Altera Funcionario", this.painelAlteraFuncionario);
	}
	
	public void criarPainelAlteraAutor() {
		this.painelAlteraAutor = new PainelAlteraAutor();
		this.telaPadrao = new TelaPadrao("Altera Autor", this.painelAlteraAutor);
	}
	
	public void criarPainelAlteraLivro() {
		this.painelAlteraLivro = new PainelAlteraLivro();
		this.telaPadrao = new TelaPadrao("Altera Livro", this.painelAlteraLivro);
	}
	
	public void criarPainelAlteraCurso() {
		this.painelAlteraCurso = new PainelAlteraCurso();
		this.telaPadrao = new TelaPadrao("Altera Curso", this.painelAlteraCurso);
	}
	
	public void criarPainelAlteraDepartamento() {
		this.painelAlteraDepartamento = new PainelAlteraDepartamento();
		this.telaPadrao = new TelaPadrao("Altera Departamento", this.painelAlteraDepartamento);
	}
	
	
	/*
	 * Visualização
	 */

	public void mostrarCadastrarOpcoes(){
		this.painelAtualizarOpcoes.setVisible(false);
		this.painelAprovarOpcoes.setVisible(false);
		this.painelRealizarOpcoes.setVisible(false);

		
		this.add(this.painelCadastrarOpcoes, BorderLayout.EAST);
		this.painelCadastrarOpcoes.setVisible(true);
	}

	public void mostrarAtualizarOpcoes() {
		this.painelAprovarOpcoes.setVisible(false);
		this.painelRealizarOpcoes.setVisible(false);
		this.painelCadastrarOpcoes.setVisible(false);

		
		this.add(this.painelAtualizarOpcoes, BorderLayout.EAST);
		this.painelAtualizarOpcoes.setVisible(true);
	}

	public void mostrarAprovarOpcoes() {
		this.painelRealizarOpcoes.setVisible(false);
		this.painelCadastrarOpcoes.setVisible(false);
		this.painelAtualizarOpcoes.setVisible(false);

		
		this.add(this.painelAprovarOpcoes, BorderLayout.EAST);
		this.painelAprovarOpcoes.setVisible(true);
	}

	public void mostrarRelizarOpcoes() {

		this.painelCadastrarOpcoes.setVisible(false);
		this.painelAtualizarOpcoes.setVisible(false);
		this.painelAprovarOpcoes.setVisible(false);

		
		this.add(this.painelRealizarOpcoes, BorderLayout.EAST);
		this.painelRealizarOpcoes.setVisible(true);
	}

	
	
	public void esconderPaineisDeOpcoes() {
		this.painelAprovarOpcoes.setVisible(false);
		this.painelRealizarOpcoes.setVisible(false);
		this.painelCadastrarOpcoes.setVisible(false);
		this.painelAtualizarOpcoes.setVisible(false);
	}

	

	/*
	 * GETs
	 */
	
	
	
	public Funcionario getFuncionario() {
		return funcionario;
	}

	public JPanel getPainelMenu() {
		return painelMenu;
	}

	public JPanel getPainelCadastrarOpcoes() {
		return painelCadastrarOpcoes;
	}

	public JPanel getPainelAtualizarOpcoes() {
		return painelAtualizarOpcoes;
	}

	public JPanel getPainelAprovarOpcoes() {
		return painelAprovarOpcoes;
	}

	public JPanel getPainelRealizarOpcoes() {
		return painelRealizarOpcoes;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JButton getAutalizarButton() {
		return autalizarButton;
	}

	public JButton getListarButton() {
		return listarButton;
	}

	public JButton getAprovarButton() {
		return aprovarButton;
	}

	public JButton getRealizarButton() {
		return realizarButton;
	}

	public JButton getCaixaButton() {
		return caixaButton;
	}

	public JButton getDeslogarButton() {
		return deslogarButton;
	}

	public JButton getcOLivroButton() {
		return cOLivroButton;
	}

	public JButton getcOAutorButton() {
		return cOAutorButton;
	}

	public JButton getcOUsuarioButton() {
		return cOUsuarioButton;
	}

	public JButton getcOFuncionarioButton() {
		return cOFuncionarioButton;
	}

	public JButton getcOCursoButton() {
		return cOCursoButton;
	}

	public JButton getcODepartamentoButton() {
		return cODepartamentoButton;
	}

	public JButton getaOLivroButton() {
		return aOLivroButton;
	}

	public JButton getaOAutorButton() {
		return aOAutorButton;
	}

	public JButton getaOUsuarioButton() {
		return aOUsuarioButton;
	}

	public JButton getaOFuncionarioButton() {
		return aOFuncionarioButton;
	}

	public JButton getaOCursoButton() {
		return aOCursoButton;
	}

	public JButton getaODepartamentoButton() {
		return aODepartamentoButton;
	}

	public JButton getApOEmprestimoButton() {
		return apOEmprestimoButton;
	}

	public JButton getApOReservaButton() {
		return apOReservaButton;
	}

	public JButton getrOEmprestimoButton() {
		return rOEmprestimoButton;
	}

	public JButton getrOReservaButton() {
		return rOReservaButton;
	}

	

	

	
	




}
