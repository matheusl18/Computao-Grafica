package model;

import java.util.ArrayList;
import java.util.List;

import entity.Desenho;
import entity.Ponto;

public class Model {
	
	static List<Ponto> pontos = new ArrayList<>();
	{
		pontos.add(new Ponto(250, 250));
		pontos.add(new Ponto(350, 250));
		pontos.add(new Ponto(350, 350));
		pontos.add(new Ponto(250, 350));
	};
	
	Desenho desenho = new Desenho(pontos);
	
	public Model() {
	}
	
	public void makeTransformacoes(
			Ponto t,  // valor da transforma��o de transla��o
			double a  // valor do angulo de rota��o
			) {
		desenho.reset();
		desenho.makeTransladar(t.x, t.y);
		desenho.makeRotacao(a);
	}
	
	public Desenho getDesenho() {
		return desenho;
	}
	
	
	

}