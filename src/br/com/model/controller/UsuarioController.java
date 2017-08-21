package br.com.model.controller;

import br.com.model.beans.Usuario;
import br.com.model.dao.UsuarioDAO;

public class UsuarioController {
	
//	public boolean verificarDadosParaLogin(){
//		
//		return true;
//	}
	
	public static boolean suspenderUsuario(Usuario u) {
		try {
			u.setSituacao("Suspenso");
			UsuarioDAO.merge(u);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public static boolean regularizarUsuario(Usuario u) {
		try {
			u.setSituacao("Regularizado");
			UsuarioDAO.merge(u);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
