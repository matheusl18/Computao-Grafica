package view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Shape;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import entidades.Desenho;
import entidades.Ponto;

public class Janela extends JFrame {
	
	Tela tela;
	Botoes botoes = new Botoes();
	Radio radio = new Radio();
	
	
	public Janela(Desenho desenho, Shape circulo) {
		super("Trabalho Computação Grafica");
		
		tela = new Tela(desenho, circulo);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		tela.setPreferredSize(new Dimension(620, 620));
		
		add(tela, BorderLayout.CENTER);
		add(botoes, BorderLayout.LINE_END);
		add(radio, BorderLayout.PAGE_START);
		ButtonGroup group = new ButtonGroup();
		group.add(radio.quadrado);
		group.add(radio.triangulo);
		group.add(radio.pentagono);
		group.add(radio.hexagono);
		group.add(radio.heptagono);
		group.add(radio.octogono);
	    group.add(radio.circulo);

		
		setVisible(true);
		pack();
		
	}
	
	public void adicionaListenerSlide(ChangeListener cl) {
		botoes.adicionaListenerSlide(cl);

	}
	
	public void adicionaListenerRadio(ActionListener al) {
		radio.adicionaListenerRadio(al);
	}
	
	public void atualiza(Desenho desenho, Shape circulo) {
		tela.atualiza(desenho, circulo);
	}
	
	public Ponto getValorSlideT() {
		return new Ponto(
				botoes.getValorSlideTX(), 
				botoes.getValorSlideTY());
	}
	
	
	public Ponto getValorSlideS() {
		return new Ponto(
				botoes.getValorSlideSX(), 
				botoes.getValorSlideSY());
	}
	
	public Ponto getValorSlideC() {
		return new Ponto(
				botoes.getValorSlideCX(), 
				botoes.getValorSlideCY());
	}

	public double getValorSlideR() {
		return botoes.getValorSlideR();
	}
	
	public JRadioButton getQuadrado() {
		return radio.getQuadrado();
	}
	
	public JRadioButton getTriangulo() {
		return radio.getTriangulo();
	}
	
	public JRadioButton getPentagono() {
		return radio.getPentagono();
	}
	
	public JRadioButton getHexagono() {
		return radio.getHexagono();
	}
	
	public JRadioButton getHeptagono() {
		return radio.getHeptagono();
	}
	
	public JRadioButton getOctogono() {
		return radio.getOctogono();
	}
	
	public JRadioButton getCirculo() {
		return radio.getCirculo();
	} 
	
	public void reset() {
		botoes.reset();
	}

	
}
