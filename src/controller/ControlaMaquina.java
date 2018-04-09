/**
 * Classe ControlaMaquina responsável por receber atributos da classe principal
 * e passa-los à classe que contém as Threads, além de executá-las
 * @author Augusto Luiz Silva
 * @date 20/03/18
 */

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class ControlaMaquina implements ActionListener {
	
	private JLabel n1;
	private JLabel n2;
	private JLabel n3;
	
	/**
	 * Construtor
	 * @param n1 é a label correspondente ao primeiro número
	 * @param n2 é a label correspondente ao segundo número
	 * @param n3 é a label correspondente ao terceiro número
	 */
	public ControlaMaquina(JLabel n1, JLabel n2, JLabel n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;		
	}
	
	/**
	 * Método que chama o método executa
	 */
	
	public void actionPerformed(ActionEvent e) {
		executa();
	}
	
	/**
	 * Método que cria objetos da classe ThreadMaquina, passando parâmtros a ela e executa as threads
	 */
	
	public void executa() {
		ThreadMaquina tm1 = new ThreadMaquina(n1,0);
		ThreadMaquina tm2 = new ThreadMaquina(n2,1);
		ThreadMaquina tm3 = new ThreadMaquina(n3,2);
		
		tm1.start();
		tm2.start();
		tm3.start();
	}
}
