package cursojva.interfaces;
// essa interface � o contrato de autentica��o
public interface PermitirAcesso {

	
	public boolean autenticar(String login, String senha);
	public boolean autenticar();
}
