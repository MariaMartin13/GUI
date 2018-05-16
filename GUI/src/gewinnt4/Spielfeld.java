package gewinnt4;

import java.awt.BorderLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Spielfeld {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       
       
       
        
        JFrame tFenster = new JFrame("Spielfeld");
        tFenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tFenster.setSize(1280, 720);
        tFenster.setLayout(new GridLayout(6,7));
        for (int i=0; i<42;i++) {
        tFenster.getContentPane().add(new JButton(""+i));
        }
        tFenster.setVisible(true);
         
         
	}
}
