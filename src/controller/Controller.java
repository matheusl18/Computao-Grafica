package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import entidades.Desenho;
import entidades.Ponto;
import model.Model;
import view.View;

public class Controller extends JFrame{
	
	View view;
	Model model;
	
	public Controller() {
		model = new Model();
		view = new View(model.getDesenho());
			
		view.adicionaListenerSlide(new MudaSlide());
		view.adicionaListenerRadio(new EscolheForma());
	}
	
	class MudaSlide implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			Ponto t = view.getValorT();
			double a = view.getValorR();
			Ponto s = view.getValorS();
			Ponto c = view.getValorC();
			
			model.makeTransformacoes(t, a, s, c);
			Desenho desenho = model.getDesenho();
			
			view.atualiza(desenho);
			
			
		}
		
	}
	
	class EscolheForma implements ActionListener{
	
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==view.getQuadrado()) {
				System.out.println("Quadrado");
			}
			else if(e.getSource()==view.getTriangulo()) {
				System.out.println("Triangulo");
			}
			else if(e.getSource()==view.getPentagono()) {
				System.out.println("Pentagono");
			}
			else if(e.getSource()==view.getHexagono()) {
				System.out.println("Hexagono");
			}
			else if(e.getSource()==view.getHectagono()) {
				System.out.println("Hectagono");
			}
			else if(e.getSource()==view.getOctogono()) {
				System.out.println("Octogono");
			}
			
		}
	}
	

}
