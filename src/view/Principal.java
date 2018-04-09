/**
 * Classe principal do programa
 * @author Augusto Luiz Silva
 * @date 20/03/18
 */

package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControlaMaquina;

public class Principal extends JFrame{
	private static final long serialVersionUID = 1L;
	private JPanel painel;
	
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 *É o método responsável por construir o JFrame, posicionando suas respectivas Labels e button 
	 */
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 90, 556, 577);
		setResizable(false);
		
		painel = new JPanel();
		painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(painel);
		painel.setLayout(null);
		
		JLabel n1 = new JLabel("0");
		n1.setBounds(55, 230, 150, 200);
		n1.setFont(new Font ("Calibri", Font.BOLD, 200 ));
		
		painel.add(n1);
		
		JLabel n2 = new JLabel("0");
		n2.setBounds(230, 230, 150, 200);
		n2.setFont(new Font ("Calibri", Font.BOLD, 200 ));
		
		painel.add(n2);
		
		JLabel n3 = new JLabel("0");
		n3.setBounds(405, 230, 150, 200);
		n3.setFont(new Font ("Calibri", Font.BOLD, 200 ));
		
		painel.add(n3);
		
		JLabel fundo = new JLabel("");
		fundo.setBounds(0 , 0, 550, 550);
		fundo.setIcon(new ImageIcon("imagens/fundo_caca_niquel.png"));
		
		painel.add(fundo);
		
		JButton btnJogar = new JButton("JOGAR");
		btnJogar.setBounds(145, 455, 250, 65);
		btnJogar.setFont(new Font ("Calibri", Font.BOLD, 50 ));
		btnJogar.setBackground(Color.WHITE);
		
		painel.add(btnJogar);
		
		ControlaMaquina cm = new ControlaMaquina(n1, n2, n3);
		btnJogar.addActionListener(cm);
	}
	
}
