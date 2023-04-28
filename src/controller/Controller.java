package controller;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import entidades.Desenho;
import entidades.Ponto;
import model.Model;
import view.View;

public class Controller {
	
	View view;
	Model model;
	
	public Controller() {
		model = new Model();
		view = new View(model.getDesenho());
		
		view.adicionaListenerSlide(new MudaSlide());
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
	

}