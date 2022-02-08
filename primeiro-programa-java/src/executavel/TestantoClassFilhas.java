package executavel;

import cursjava.classes.Aluno;
import cursjava.classes.Diretor;
import cursjava.classes.Secretario;

public class TestantoClassFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("hugo");
		aluno.setIdade(26);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("2011201460");
		diretor.setNome("Claudio");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("ADM");
		secretario.setNome("Elisa");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.getNome()+" -> " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario Aluno: "+aluno.salario());
		System.out.println("Salario Diretor: "+diretor.salario());
		System.out.println("Salario Secretario: "+secretario.salario());
		
		
		
	}

}
