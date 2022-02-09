package executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
  public static void main(String[] args) {
	
	  //Array pode ser de todos os tipos de dados e objetos tbm
	  
	  //Array sempre deve ter a quantidade de posições definidas
	  
	  int posicoes = Integer.parseInt(JOptionPane.showInputDialog("Quantas posições deja ter no array?"));
	  
	  double[] notas = new double[posicoes];

	  for(int x =0; x< notas.length; x++) {
		  notas[x]=Double.parseDouble(JOptionPane.showInputDialog("informe a nota "+(x+1)));	  
	  }
	  
	  double soma =0;
	  for(int i =0; i<notas.length; i++) {
	  System.out.println("posição "+i+": Nota "+(i+1)+": "+notas[i]);
	  soma += notas[i];
	  }
	  
	  System.out.println("Total: "+soma);
	  System.out.println("Media: "+(soma/4));
}
}
