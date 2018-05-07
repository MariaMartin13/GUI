package Schuhkarton;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Insets;

public class Login {

	public static void main(String [] args) {
		JFrame fenster = new JFrame ("Login");
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setSize(200, 200);
		fenster.setLayout(new GridBagLayout ());
		
		JLabel labelName = new JLabel ("Name");
		JLabel labelPwd = new JLabel ("Pwd");
		JTextField feldName = new JTextField ();
		JPasswordField feldPwd = new JPasswordField ();
		JButton okButton = new JButton ("OK");
		JButton abbrechenButton = new JButton ("Abbrechen");
		
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
		
		fenster.getContentPane().add(labelPwd, c);
		
		c.gridx = 1;
		c.gridwidth = 2;
		
		fenster.getContentPane().add(feldPwd, c);
		
		c.gridy = 2;
		c.gridwidth = 1;
		fenster.getContentPane().add(okButton, c);
		
		c.gridx = 2;
		fenster.getContentPane().add(abbrechenButton, c);
		
		fenster.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
	}
}
