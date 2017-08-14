package br.com.model.controller;

import java.util.List;

import br.com.model.beans.Funcionario;
import br.com.model.beans.Usuario;
import br.com.model.dao.FuncionarioDAO;
import br.com.model.dao.UsuarioDAO;

public class LoginController {
	
	private Usuario usuarioLogado = null;
	private Funcionario funcionarioLogado = null;
	private List<Usuario> user = UsuarioDAO.findAll();
	private List<Funcionario> funs = FuncionarioDAO.findAll();
	
	public boolean podeLogar(int matricula, String cpf) {
		
		for(int i = 0;i<user.size();i++) {
			if(user.get(i).getMatricula() == matricula && user.get(i).getCpf().equals(cpf)) {
				usuarioLogado = user.get(i);
				return true;
			}
		}
		for(int i = 0;i<funs.size();i++) {
			if(funs.get(i).getMatricula() == matricula && funs.get(i).getCpf().equals(cpf)) {
				funcionarioLogado = funs.get(i);
				return true;
			}
		}
		
		return false;
	}
	
	public boolean eUsuario(){
		if(usuarioLogado == null ) {return false;}
		else {return true;}
	}

	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}

	public Funcionario getFuncionarioLogado() {
		return funcionarioLogado;
	}
	
	/*
	 * =========================================  GET and SET  ===================================================
	 */
	
}
