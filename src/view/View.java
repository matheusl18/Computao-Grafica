package view;

import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.event.ChangeListener;

import entidades.Desenho;
import entidades.Ponto;

public class View {
	
	Janela janela;
	
	public View(Desenho desenho) {
		janela = new Janela(desenho);
	}
	
	public void atualiza(Desenho desenho) {
		janela.atualiza(desenho);
	}
	
	public void adicionaListenerSlide(ChangeListener cl) {
		janela.adicionaListenerSlide(cl);
	}
	
	public void adicionaListenerRadio(ActionListener al) {
		janela.adicionaListenerRadio(al);
	}
	
	public Ponto getValorT() {
		return janela.getValorSlideT();
	}

	public Ponto getValorS() {
		return janela.getValorSlideS();
	}
	
	public Ponto getValorC() {
		return janela.getValorSlideC();
	}

	public double getValorR() {
		return janela.getValorSlideR();
	}
	
	public JRadioButton getQuadrado() {
		return janela.getQuadrado();
	}
	
	public JRadioButton getTriangulo() {
		return janela.getTriangulo();
	}
	
	public JRadioButton getPentagono() {
		return janela.getPentagono();
	}
	
	public JRadioButton getHexagono() {
		return janela.getHexagono();
	}
	
	public JRadioButton getHeptagono() {
		return janela.getHeptagono();
	}
	
	public JRadioButton getOctogono() {
		return janela.getOctogono();
	}
	
	public JRadioButton getCirculo() {
		return janela.getCirculo();
	}
	
	public void reset() {
		janela.reset();
	}

}
