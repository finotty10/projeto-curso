package cursoJava.classesAuxiliares;

import cursojva.interfaces.PermitirAcesso;

//Realmente e somente receber alguem que tenha o contrato da interface de Permitiracesso e chamar o autenticado
public class FuncaoAutenticacao {

	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
}
