package view;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

public class Radio extends JPanel {
	
	JRadioButton quadrado = new JRadioButton("Quadrado");
	JRadioButton triangulo = new JRadioButton("Triangulo");
	JRadioButton pentagono = new JRadioButton("Pentagono");
	JRadioButton hexagono = new JRadioButton("Hexagono");
	JRadioButton heptagono = new JRadioButton("Heptagono");
	JRadioButton octogono = new JRadioButton("Octogono");
	
	
		
	/*double rFator = 100;
	JSlider sliderR = new JSlider(0, (int)(2*Math.PI*rFator), 0);*/
	
	public Radio() {
		setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
		/*add(new Label("Translade em X"));*/
		add(quadrado);
		add(triangulo);
		add(pentagono);
		add(hexagono);
		add(heptagono);
		add(octogono);
		
	}
	
	public JRadioButton getQuadrado() {
		return quadrado;
	}
	
	public JRadioButton getTriangulo() {
		return triangulo;
	}
	
	public JRadioButton getPentagono() {
		return pentagono;
	}
	
	public JRadioButton getHexagono() {
		return hexagono;
	}
	
	public JRadioButton getHeptagono() {
		return heptagono;
	}
	
	public JRadioButton getOctogono() {
		return octogono;
	}
	
	
	public void adicionaListenerRadio(ActionListener al) {
		quadrado.addActionListener(al);
		triangulo.addActionListener(al);
		pentagono.addActionListener(al);
		hexagono.addActionListener(al);
		heptagono.addActionListener(al);
		octogono.addActionListener(al);
	}
	
	/*@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==quadrado) {
			System.out.println("quadrado");
		}
		
	}*/
	
	

}
