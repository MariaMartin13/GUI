package Schuhkarton;






//03.05.2018
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SchuhkartonVolumenRechnerGUI extends JFrame {
	
	private JLabel breite;
	private JLabel hoehe;
	private JLabel tiefe;
	private JLabel ergebnis;
	private JButton berechne;
	private JButton leere;
	private JTextField textHoehe;
	private JTextField textBreite;
	private JTextField textTiefe;
	private JTextField textErgebnis;
	
	public SchuhkartonVolumenRechnerGUI() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.initLayout();
		this.setLayout(new GridBagLayout());;
		this.ordneAn();
		this.registriereListener();
		this.setVisible(true);
	}
	
	private void initLayout() {
		this.getContentPane().setLayout(new GridBagLayout());
		breite = new JLabel("Breite: ");
		hoehe = new JLabel("Höhe: ");
		tiefe = new JLabel("Tiefe: ");
		ergebnis = new JLabel("Ergbenis: ");
		berechne = new JButton("Berechne");
		leere = new JButton("Leere");
		textHoehe = new JTextField();
		textBreite = new JTextField();
		textTiefe = new JTextField();
		textErgebnis = new JTextField();
		textErgebnis.setEditable(false);
	}
	
	private void ordneAn() {
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(4,4,4,4);
		
		c.gridx = 0; //Position
		c.gridy = 0;
		this.getContentPane().add(breite, c);
		
		c.gridx = 1;
		c.gridwidth = 2;
		this.getContentPane().add(textBreite, c);
		
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		this.getContentPane().add(hoehe, c);
		
		c.gridx = 1;
		c.gridwidth = 2;
		this.getContentPane().add(textHoehe, c);
		
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		this.getContentPane().add(tiefe, c);
		
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 2;
		this.getContentPane().add(textTiefe, c);
		
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 1;
		this.getContentPane().add(ergebnis, c);
		
		c.gridx = 1;
		c.gridy = 3;
		c.gridwidth = 2;
		this.getContentPane().add(textErgebnis, c);
		
		c.gridx = 1;
		c.gridy = 4;
		c.gridwidth = 1;
		this.getContentPane().add(berechne, c);
		
		c.gridx = 2;
		c.gridy = 4;
		c.gridwidth = 1;
		this.getContentPane().add(leere, c);
	}
	
	private void registriereListener() {
		this.berechne.addActionListener(new ActionListener() { //anonyme Klasse kennt nur diese Methode

			@Override
			public void actionPerformed(ActionEvent e) { //Interface implementieren
				Integer hoehe = Integer.parseInt(textHoehe.getText()); //String to Integer parsen
				Integer breite = Integer.parseInt(textBreite.getText()); //Auslesen der Textfields
				Integer tiefe = Integer.parseInt(textTiefe.getText());
				
				Integer ergebnis = hoehe*breite*tiefe;
				textErgebnis.setText(ergebnis.toString()); //Ausgeben der Textfields
			}
		});
		
		this.leere.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textHoehe.setText("");
				textBreite.setText("");
				textTiefe.setText("");
				textErgebnis.setText("");
				
				
			}
		});
	
	}
	public static void main(String[] args) {
		SchuhkartonVolumenRechnerGUI t =new SchuhkartonVolumenRechnerGUI();
	}
	
}
