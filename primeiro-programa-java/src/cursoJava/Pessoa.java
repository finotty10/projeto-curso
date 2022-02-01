package cursoJava;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import cursjava.classes.Aluno;
import cursjava.classes.Disciplina;

public class Pessoa {

	public static void main(String[] args) {
/*Objeto real na memoria*/
	List<Aluno> alunos = new ArrayList<Aluno>();
	
	
	for(int qtd =1; qtd <=2; qtd++) {
	
	String nome = JOptionPane.showInputDialog("Qual o nome do aluno?"+qtd+"");
	String idade = JOptionPane.showInputDialog("Qual a idade?");

	Aluno aluno1 = new Aluno();
	aluno1.setNome(nome);
	aluno1.setIdade(Integer.valueOf(idade));
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
	
	  for(int pos =0; pos < alunos.size(); pos++) {
		  Aluno aluno = alunos.get(pos);
		  
		  if(aluno.getNome().equalsIgnoreCase("hugo")) {
			  
			  Aluno altrocar = new Aluno();
			  altrocar.setNome("russo");
			  
			  Disciplina disciplina = new Disciplina();
			  disciplina.setDisciplina("barracheiro");
			  disciplina.setNota(100);
			  
			  altrocar.getDisciplina().add(disciplina);
			  alunos.set(pos, altrocar);
			  aluno = alunos.get(pos);
		  }
		  
		  System.out.println("Aluno: "+aluno.getNome());
		  System.out.println("Média aluno: "+aluno.getMediaNota());
		  System.out.println("resultado: "+aluno.getAlunoAprovado());
		  System.out.println("---------------------------------------------------");
	 
	     for (Disciplina disc : aluno.getDisciplina()) {
			System.out.println("Materia: "+disc.getDisciplina()+"| nota: "+disc.getNota());
		}
	     System.out.println("-----------------------------------------------------");
	  }
	
	}
}
