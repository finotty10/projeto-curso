package cursoJava.threads;

import javax.swing.JOptionPane;

public class aulaThread {

	public static void main(String[] args) throws InterruptedException {
		//Thread processando em paralelo
		new Thread() {
			public void run() {//executa o que nós queremos
				//codigo da rotina
				//codigo da rotina que eu quero executar em paralelo
				for(int pos=0; pos < 10; pos ++) {
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {						
						e.printStackTrace();
					}
					/*Quero executar esse envio com tempo de parada ou com tempo determinado*/
					System.out.println("Executando alguma rotina, envio de e-mail");
					//fim do codigo em paralelo
				}
			}
			
		}.start();//Start liga a Thread que fica processando paralelamente
		
		
		//codigo do sistema do usuario continua o fluxo de trabalho
		System.out.println("chegou ao fim :D");
		//fluxo do sistema, cadastro de venda, uma emissao de nota fiscal
		//JOptionPane.showMessageDialog(null, "Sistema continua executando para usuario");
	}
}
