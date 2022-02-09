package executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursjava.classes.Aluno;
import cursjava.classes.Diretor;
import cursjava.classes.Disciplina;
import cursjava.classes.Secretario;
import curso.constantes.StatusAluno;
import cursoJava.classesAuxiliares.FuncaoAutenticacao;
import cursoJava.excecao.ExcecaoProcessarNota;
import cursojva.interfaces.PermitirAcesso;

public class MainPrincipal {

	public static void main(String[] args) {
		
		try {
	
			lerArquivo();
			
		String login = JOptionPane.showInputDialog("Informe o login: ");
		String senha = JOptionPane.showInputDialog("Informe a senha: ");
		

		if(new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) { //vou travar o contrato para autorizar somente quem realmente tem o contrato 100% legitimo
			
	
   /*Objeto real na memoria*/
	List<Aluno> alunos = new ArrayList<Aluno>();
	//Lista que dentro dela temos uma chave que identifica uma sequencia de valores
	HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
	
	for(int qtd =1; qtd <=5; qtd++) {
	
	String nome = JOptionPane.showInputDialog("Qual o nome do aluno?"+qtd+"");
	//String idade = JOptionPane.showInputDialog("Qual a idade?");

	Aluno aluno1 = new Aluno();
	aluno1.setNome(nome);
	//aluno1.setIdade(Integer.valueOf(idade));
	aluno1.setDataNascimento("03/04/1995");
	
	for (int pos =1; pos <=1; pos++) {
		String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+"?");
		String nota = JOptionPane.showInputDialog("Nota "+pos+"");
		Disciplina disciplina = new Disciplina();
		
		disciplina.setDisciplina(nomeDisciplina);
		disciplina.setNota(Double.parseDouble(nota));
		
		aluno1.getDisciplina().add(disciplina);
		
	}
	
	int escolha = JOptionPane.showConfirmDialog(null, "Remover disciplina?");
	
	if(escolha == 0) {
		
		int continuarRemover =0;
		int posicao =1;
		
		while(continuarRemover == 0){
			String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1,2,3 ou 4 ?");
		    aluno1.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
		    posicao++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar Remover?");
		 }
		
		}
	
	alunos.add(aluno1);
	}
	
	maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
	maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
	maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
	
	for (Aluno aluno : alunos) { //separei em listas
		if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
			maps.get(StatusAluno.APROVADO).add(aluno);
		}else if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
			maps.get(StatusAluno.RECUPERACAO).add(aluno);
		}else {
			maps.get(StatusAluno.REPROVADO).add(aluno);
		}
	}
	System.out.println("-------------Lista Aprovados---------------");
	for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
		System.out.println("Nome: "+aluno.getNome()+
		          " | Resultado: "+aluno.getAlunoAprovado()+
		          " com Média de: "+aluno.getMediaNota());
	}
	System.out.println("-------------Lista Recuperação---------------");
	for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
		System.out.println("Nome: "+aluno.getNome()+
		          " | Resultado: "+aluno.getAlunoAprovado()+
		          " com Média de: "+aluno.getMediaNota());
	}
	System.out.println("-------------Lista Reprovados---------------");
	for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
		System.out.println("Nome: "+aluno.getNome()+
				          " | Resultado: "+aluno.getAlunoAprovado()+
				          " com Média de: "+aluno.getMediaNota()
				          +" Disciplina: "+aluno.getDisciplinaAluno());
	}
	
	
 }else {
	 JOptionPane.showMessageDialog(null,"senha incorreta" );
 }
}catch (ExcecaoProcessarNota e) {
	e.printStackTrace();
	JOptionPane.showMessageDialog(null, "Erro da execução customizada : "+ e.getClass().getName());
}finally {// sempre é executado tendo erro ou nao
	JOptionPane.showMessageDialog(null, "deu certinho, ou nao");
}
}
	public static void lerArquivo() throws ExcecaoProcessarNota {
		try {
			File fil = new File("c://lines.txt");
			Scanner scanner = new Scanner(fil);
		}catch (FileNotFoundException e) {
			throw new ExcecaoProcessarNota(e.getMessage());
		}
		
	}
}
