package controller;

import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;

import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import entidades.Circulo;
import entidades.Desenho;
import entidades.Ponto;
import model.Model;
import view.View;

public class Controller extends JFrame{
	
	View view;
	Model model;
	
	public Controller() {
		model = new Model();
		view = new View(model.getDesenho(), model.getCirculo());
			
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
			Shape circulo = model.getCirculo();
			
			view.atualiza(desenho, circulo);
			
			
		}
		
	}
	
	class EscolheForma implements ActionListener{
	
		@Override
		public void actionPerformed(ActionEvent e) {
			view.reset();
			if(e.getSource()==view.getTriangulo()) {
				int s = 1;
				model.makeFormas(s);
				
				Desenho desenho = model.getDesenho();
				Shape circulo = model.getCirculo();
				
				view.atualiza(desenho, circulo);
			}
			else if(e.getSource()==view.getQuadrado()) {
				int s = 2;
				model.makeFormas(s);
				
				Desenho desenho = model.getDesenho();
				Shape circulo = model.getCirculo();
				
				view.atualiza(desenho, circulo);
			}
			else if(e.getSource()==view.getPentagono()) {
				int s = 3;
				model.makeFormas(s);
				
				Desenho desenho = model.getDesenho();
				Shape circulo = model.getCirculo();
				
				view.atualiza(desenho, circulo);
			}
			else if(e.getSource()==view.getHexagono()) {
				int s = 4;
				model.makeFormas(s);
				
				Desenho desenho = model.getDesenho();
				Shape circulo = model.getCirculo();
				
				view.atualiza(desenho, circulo);
			}
			else if(e.getSource()==view.getHeptagono()) {
				int s = 5;
				model.makeFormas(s);
				
				Desenho desenho = model.getDesenho();
				Shape circulo = model.getCirculo();
				
				view.atualiza(desenho, circulo);
			}
			else if(e.getSource()==view.getOctogono()) {
				int s = 6;
				model.makeFormas(s);
				
				Desenho desenho = model.getDesenho();
				Shape circulo = model.getCirculo();
				
				view.atualiza(desenho, circulo);
			}
			
			else if(e.getSource()==view.getCirculo()) {
				int s = 7;
				model.makeFormas(s);
				
				Desenho desenho = model.getDesenho();
				Shape circulo = model.getCirculo();
				
				view.atualiza(desenho, circulo);
			}
			
		}
	}
	

}
