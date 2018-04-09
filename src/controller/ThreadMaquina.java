/**
 * Classe ThreadMaquina que herda todos os atributos e opera��es da classe Thread
 * Aqui encontra-se as Thread a serem executadas
 * @author Augusto Luiz Silva
 * @date 20/03/18
 */

package controller;

import java.util.Random;
import javax.swing.JLabel;

public class ThreadMaquina extends Thread {
	private JLabel n;
	private int op;
	
	/**
	 * Construtor
	 * @param n � a label que mostrar� o n�mero a ser sorteado
	 * @param op significa qual label iniciar� a contagem aleat�ria ap�s o bot�o ser acionado 
	 */
	public ThreadMaquina(JLabel n, int op) {
		this.n = n;
		this.op = op;
	}
	
	/**
	 * m�todo run que efetua achamada do m�todo executa sem a passagem de par�metros
	 */
	
	@Override
	public void run() {
		executa();
	}
	
	/**
	 * m�todo executa que cont�m um switch case para analisar op e repassar os par�metros
	 * necess�rios para o m�todo numero
	 */
	
	public void executa() {
		switch(op) {
		case 0: 
			numero(op);
			break;
		case 1:
			numero(op);
			break;
		case 2:
			numero(op);
			break;
		}
	}
	
	/**
	 * M�todo n�mero que fara o sorteio aleat�rio dos n�meros  
	 * @param op recebe o n�mero da op��o do switch case 
	 * a fim de estipular um limite no for
	 */
	
	public void numero(int op) {
		int numero;
		String num;
		
		Random random = new Random();
		int valor_final = (op+1) * 2000000; 
		
		for(int i = 0; i < valor_final; i++) {
			numero = random.nextInt(7);
			num = ""+numero;
			n.setText(num);
		}
	}
}
