package executavel;

import javax.swing.JOptionPane;

import cursjava.classes.Aluno;
import cursjava.classes.Disciplina;

public class ArrayVetor {
	
  public static void main(String[] args) {
	
	  //Array pode ser de todos os tipos de dados e objetos tbm
	  
	  //Array sempre deve ter a quantidade de posições definidas
	  
	  double[] notasJava = {10,9,8,7};
	  double[] notasProgramacao = {5,8,8,6};
	  
	  Aluno aluno = new Aluno();
	  aluno.setNome("hugo");
	  aluno.setNomeEscola("Ciep 207");
	  
	  Disciplina disciplina = new Disciplina();
	  disciplina.setDisciplina("Curso Java");
	  disciplina.setNota(notasJava);
	  
	  aluno.getDisciplina().add(disciplina);
	  
	  Disciplina disciplina2 = new Disciplina();
	  disciplina2.setDisciplina("Programação");
	  disciplina2.setNota(notasProgramacao);
	  
	  aluno.getDisciplina().add(disciplina2);
	  //-----------------------------------------------------------------
	  
	  Aluno[] arrayAlunos = new Aluno[1];
	  
	  arrayAlunos[0] = aluno;
	  
	  for(int pos =0; pos < arrayAlunos.length; pos++) {
		  System.out.println("Nome do aluno é: "+arrayAlunos[pos].getNome());
		  for(Disciplina disc : arrayAlunos[pos].getDisciplina()) {
			  System.out.println("Nome da disciplina é: "+ disc.getDisciplina());	
			  for(int i =0; i < disc.getNota().length; i++ ) {
				  System.out.println("Nota "+(i+1)+": "+ disc.getNota()[i]);
			  }
		  }
		 
	  }
	  
	  
	 /* System.out.println("Nome do aluno : "+aluno.getNome()+"| Inscrito na escola: "+aluno.getNomeEscola());
	  
	  for (Disciplina disc : aluno.getDisciplina()) {
		
		System.out.println("Disciplina: "+disc.getDisciplina());
		double maior=0, menor=0;
		for(int i =0; i < disc.getNota().length; i++) {
		System.out.println("Nota "+(i+1)+": "+disc.getNota()[i]);
		  if(i == 0) {
			  maior = disc.getNota()[i];
			  menor = disc.getNota()[i];
			  
		  }else if(maior < disc.getNota()[i]) {
			  maior =disc.getNota()[i];
			  
		  }else if(menor > disc.getNota()[i]){
			  menor = disc.getNota()[i];
		  }
		}
		System.out.println("maior nota: "+maior);
		System.out.println("menor nota: "+menor);
		System.out.println("Media: "+disc.getMediaNotas());
		System.out.println("---------------------------------------");
		
	}
	*/
	 
}
}
