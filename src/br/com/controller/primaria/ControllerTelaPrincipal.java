package br.com.controller.primaria;

import java.util.Observable;
import java.util.Observer;

import br.com.model.beans.Funcionario;
import br.com.model.beans.Usuario;
import br.com.view.primaria.TelaPrincipal;

public class ControllerTelaPrincipal  implements Observer{
	
	/*
	 * Esta classe fara o controle da TelaPrincipal de alterar 
	 * os peneis da tela Principal
	 */
	
	private TelaPrincipal telaPrincipal;
	
	public ControllerTelaPrincipal(TelaPrincipal telaPrincipal) {
		this.telaPrincipal = telaPrincipal;
	}
	
//	public void actionPerformed(ActionEvent e) {
//	
//	}

	@SuppressWarnings("static-access")
	public void update(Observable o, Object arg) {
		
		if (arg.getClass() == Usuario.class){
			this.telaPrincipal.logarUsuario((Usuario) arg);
			System.out.println("buba");
		}
		if (arg.getClass() == Funcionario.class){
			this.telaPrincipal.logarFuncionario((Funcionario) arg);
		}
	
	}

}
