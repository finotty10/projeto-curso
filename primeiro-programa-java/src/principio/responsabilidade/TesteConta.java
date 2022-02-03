package principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		
		conta.setDescricao("Conta do Hugo");
		
		System.out.println(conta.getDescricao());
		System.out.println(conta.getSaldo());
		conta.depositar(500);
		System.out.println(conta.getSaldo());
		conta.sacar(4500);
		System.out.println(conta.getSaldo());

	}

}
