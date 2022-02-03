package principio.responsabilidade;

public class ContaBancaria {
  private double saldo = 8000;
  private String descricao ="";
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
    
public void depositar(double deposito) {
	saldo += deposito;
}

public void sacar(double saque) {
	saldo -= saque;
}

}
