package cursojva.interfaces;
// essa interface é o contrato de autenticação
public interface PermitirAcesso {

	
	public boolean autenticar(String login, String senha);
	public boolean autenticar();
}
