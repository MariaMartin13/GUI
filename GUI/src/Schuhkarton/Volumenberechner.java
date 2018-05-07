package Schuhkarton;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Insets;

/* Hinzufügen von JPanels und JLabels und 
 * verwenden eines GridBagLayouts */

public class Volumenberechner {

	public static void main(String[] args) {
		JFrame fenster = new JFrame("Volumenberechner");
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setSize(300, 300);
		fenster.setLayout(new GridBagLayout());
		

		JLabel labelHoehe = new JLabel("Höhe");
		JLabel labelBreite = new JLabel("Breite");
		JLabel labelTiefe = new JLabel("Tiefe");
		JLabel labelErgebnis = new JLabel("Ergebnis");

		JTextField feldHoehe = new JTextField();
		JTextField feldBreite = new JTextField();
		JTextField feldTiefe = new JTextField();
		JTextField feldErgebnis = new JTextField();

		JButton berechne = new JButton("Berechne");
		JButton leeren = new JButton("Leeren");

		/*
		 * Festlegen das die GUI-Elemente die Gitterfelder in waagerechter Richtung
		 * ausfüllen
		 */

		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(4, 4, 4, 4);

		c.gridx = 0; // x-Position
		c.gridy = 0; // y-Position
		fenster.getContentPane().add(labelHoehe, c);

		c.gridx = 1;
		c.gridwidth = 2; // 2 Gitterfelder Breit

		fenster.getContentPane().add(feldHoehe, c);

		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;

		fenster.getContentPane().add(labelBreite, c);

		c.gridx = 1;
		c.gridwidth = 2;

		fenster.getContentPane().add(feldBreite, c);

		c.gridy = 2;
		c.gridx = 0;
		c.gridwidth = 1;

		fenster.getContentPane().add(labelTiefe, c);

		c.gridx = 1;
		c.gridwidth = 2;

		fenster.getContentPane().add(feldTiefe, c);

		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 1;
		fenster.getContentPane().add(labelErgebnis, c);

		c.gridx = 1;
		c.gridy = 3;
		c.gridwidth = 2;

		fenster.getContentPane().add(feldErgebnis, c);

		c.gridx = 1;
		c.gridy = 4;
		c.gridwidth = 1;
		fenster.getContentPane().add(berechne, c);

		c.gridx = 2;
		fenster.getContentPane().add(leeren, c);

		fenster.setVisible(true);
		
		JFrame tFenster = new JFrame("SchuhKartonVolumenBerechnerGUI");
	       tFenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       tFenster.setSize(400, 400);
	       tFenster.setLayout(new FlowLayout());
	       	       	       		
			
			JLabel lHoehe = new JLabel("Höhe");
			JLabel lBreite = new JLabel("Breite");
			JLabel lTiefe = new JLabel("Tiefe");
			JLabel lErgebnis = new JLabel("Ergebnis");

			JTextField fHoehe = new JTextField();
			fHoehe.setPreferredSize(new Dimension(100,25));
			JTextField fBreite = new JTextField();
			fBreite.setPreferredSize(new Dimension(100,25));
			JTextField fTiefe = new JTextField();
			fTiefe.setPreferredSize(new Dimension(100,25));
			JTextField fErgebnis = new JTextField();
			fErgebnis.setPreferredSize(new Dimension(100,25));
			

			tFenster.getContentPane().add(lHoehe);
			tFenster.getContentPane().add(fHoehe);
			tFenster.getContentPane().add(lBreite);
			tFenster.getContentPane().add(fBreite);
			tFenster.getContentPane().add(lTiefe);
			tFenster.getContentPane().add(fTiefe);
			tFenster.getContentPane().add(lErgebnis);
			tFenster.getContentPane().add(fErgebnis);
			JButton berechnen = new JButton("Berechne");
			tFenster.getContentPane().add(berechnen);
			JButton leere = new JButton("Leeren");
			tFenster.getContentPane().add(leere);
			
								      
	       
	       tFenster.setVisible(true);

	}

}
