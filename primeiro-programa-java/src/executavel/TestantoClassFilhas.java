package executavel;

import cursjava.classes.Aluno;
import cursjava.classes.Diretor;
import cursjava.classes.Secretario;

public class TestantoClassFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("hugo");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("2011201460");
		diretor.setNome("Claudio");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("ADM");
		secretario.setNome("Elisa");
		
		System.out.println("Nome: "+secretario.getNome()+" \nExperiência: "+secretario.getExperiencia());

	}

}
