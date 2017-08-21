package br.com.controller.funcionario.realizar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.model.beans.Livro;
//import br.com.model.controller.EmprestimoController;
import br.com.model.controller.LivroController;
import br.com.model.controller.LoginController;
import br.com.model.controller.ReservaController;
import br.com.model.dao.LivroDAO;
import br.com.view.funcionario.realizar.PainelRealizarReserva;
import br.com.view.primaria.TelaLogin;

public class ControllerPainelRealizarReserva implements ActionListener{

	private PainelRealizarReserva painel;
	private LivroController lc;
	private ReservaController rc;
	private LoginController loginController;
	public ControllerPainelRealizarReserva(PainelRealizarReserva painelAcervo) {

		this.painel = painelAcervo;
		this.lc = new LivroController();
		this.rc = new ReservaController();
		this.loginController = new LoginController();
	}

	private void preencherTabela(ArrayList<Livro> livros){
		this.painel.getTabelaAcervo().zerarTabela();
		for(Livro l : livros) {
			this.painel.getTabelaAcervo().setRow(new Object[] {l.getId(),l.getCodigo(),l.getNumero_edicao(),l.getTitulo(),l.getAno_publicacao(),l.getNumero_exemplares(),l.getEditora(),l.getAutor().getNome()});
		}
	}

	private Livro pegarLivroSelecionado(){
		Livro l = LivroDAO.getById((int)this.painel.getTabelaAcervo().pegarSelecionado(0));
		return l;
	}



	public void actionPerformed(ActionEvent e) {
		System.out.println("entrou aqui");
		if(e.getSource() == this.painel.getPesquisarButton()) {
			if(this.painel.getPalavraChaveRB().isSelected()){
				preencherTabela(this.lc.getLivroByPalavraChave(this.painel.getPesquisaField().getText()));
			}
			if(this.painel.getTituloRB().isSelected()){
				preencherTabela(this.lc.getLivroByTitulo(this.painel.getPesquisaField().getText()));
			}
			if(this.painel.getAutorRB().isSelected()){
				preencherTabela(this.lc.getLivroByAutor(this.painel.getPesquisaField().getText()));
			}
			if(this.painel.getEditoraRB().isSelected()){
				preencherTabela(this.lc.getLivroByEditora(this.painel.getPesquisaField().getText()));
			}
		}

		if(e.getSource() == this.painel.getAprovarButton()) {

			TelaLogin t = new TelaLogin();
			t.getLogarButton().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(loginController.podeLogar(t.getCpfField().getText())) {
						try {
							rc.solicitarReserva(pegarLivroSelecionado(),loginController.getUsuarioLogado());

						} catch (Exception e2) {
							JOptionPane.showMessageDialog(painel, "Solicitação Rejeitada");
						}
						t.dispose();
						JOptionPane.showMessageDialog(painel, "Solicitação Concluida");
					}else {JOptionPane.showMessageDialog(t,	"CPF n�o encontrados");}
				}
			});

		}

	}


}

