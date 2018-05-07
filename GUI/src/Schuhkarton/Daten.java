package Schuhkarton;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;

public class Daten {
	 
	


public static void main(String [] args) {
	JFrame fenster = new JFrame ("Daten");
	fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fenster.setSize(400, 400);
	fenster.setLayout(new GridBagLayout ());
	
	JLabel labelName = new JLabel ("Name");
	JLabel labelVorname = new JLabel ("Vorname");
	JLabel labelPlz = new JLabel ("PLZ");
	JTextField feldName = new JTextField ();
	JTextField feldVorname = new JTextField ();
	JTextField feldPlz = new JTextField ();
	JButton sendenButton = new JButton ("Senden");
	
	
	GridBagConstraints c = new GridBagConstraints ();
	c.fill = GridBagConstraints.HORIZONTAL;
	c.insets = new Insets (4,4,4,4);
	
	c.gridx = 0;
	c.gridy = 0;		
	
	fenster.getContentPane().add(labelName, c);
	
	c.gridx = 1;
	c.gridwidth = 2;
	
	fenster.getContentPane().add(feldName, c);
	
	c.gridx = 0;
	c.gridy = 1;
	c.gridwidth = 1;
	
	fenster.getContentPane().add(labelVorname, c);
	
	c.gridx = 1;
	c.gridwidth = 2;
	
	fenster.getContentPane().add(feldVorname, c);
	
	c.gridx = 0;
	c.gridy = 2;
	
	fenster.getContentPane().add(labelPlz, c);
	
	c.gridx = 1;
	c.gridy = 2;
	
	fenster.getContentPane().add(feldPlz, c);
	
	c.gridy = 3;
	c.gridwidth = 1;
	
	fenster.getContentPane().add(sendenButton, c);
	
	c.gridx = 2;
	
	
	fenster.setVisible(true);
}
}
	
	
	
	
