package executavel;

public class Matriz {

	public static void main(String[] args) {
		
		int notas[][]= new int[2][3];
		
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;
		
		notas[1][0] = 30;
		notas[1][1] = 40;
		notas[1][2] = 50;
		
		for(int PL = 0; PL < notas.length; PL++) {//percorrer linhas
			System.out.println("    --------------");
			for(int PC = 0; PC < notas[PL].length; PC++) {//percorrer colunas
				System.out.println("    | matriz: "+notas[PL][PC]+" |");
			}
			
		}
	}
}
