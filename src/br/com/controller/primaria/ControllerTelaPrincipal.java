package br.com.controller.primaria;

import java.util.Observable;
import java.util.Observer;

import br.com.controller.funcionario.ControllerPainelFuncionario;
import br.com.controller.usuario.ControllerPainelUsuario;
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
		
		System.out.println("entrou no deslogar");
		
		if (arg.getClass() == Usuario.class){
			this.telaPrincipal.logarUsuario((Usuario) arg);
			
		}
		
		if (arg.getClass() == Funcionario.class){
			this.telaPrincipal.logarFuncionario((Funcionario) arg);
		}
		
		if (o.getClass() == ControllerPainelUsuario.class) {
			System.out.println("user");
			if (!(boolean)arg){
				this.telaPrincipal.desLogar(true);
			}
		}
		
		if (o.getClass() == ControllerPainelFuncionario.class) {
			System.out.println("Func");
			if (!(boolean)arg){
				this.telaPrincipal.desLogar(false);
			}
		}
	
	}

}
