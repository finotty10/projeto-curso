package cursoJava.excecao;

public class ExcecaoProcessarNota extends Exception{

	public ExcecaoProcessarNota(String erro) {
		super("erro ao processar arquivo de notas "+erro);
	}
}
