package Schuhkarton;
import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
public class Fenster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fenster = new JFrame("Programmieren 2 GUI");
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setSize(260, 100);
        
        
        JButton button = new JButton ("Push me");
        fenster.getContentPane().add(button, BorderLayout.WEST);
        JRadioButton radioB = new JRadioButton();
        fenster.getContentPane().add(radioB, BorderLayout.EAST);
        
       JFrame tFenster = new JFrame("Taschenrechner");
       tFenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       tFenster.setSize(400, 400);
       tFenster.setLayout(new GridLayout(4,4));
       for (int i=0; i<16;i++) {
       tFenster.getContentPane().add(new JButton(""+i));
       }
       tFenster.setVisible(true);
        
        fenster.setVisible(true);
	}
}


