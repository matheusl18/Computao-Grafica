package model;

import java.util.ArrayList;
import java.util.List;

import entidades.Desenho;
import entidades.Ponto;
import view.Botoes;

public class Model {
	
	public List<Ponto> pontos = new ArrayList<>();
	{
		pontos.add(new Ponto(300, 250));
		pontos.add(new Ponto(350, 350));
		pontos.add(new Ponto(250, 350));
		
	};

	
	Desenho desenho = new Desenho(pontos);
	
	public Model() {
	}
	
	public void makeTransformacoes(
			Ponto t,  // valor da transformação de translação
			double a,  // valor do angulo de rotação
			Ponto s,
			Ponto c
			) {
		desenho.reset();
		desenho.makeTransladar(t.x, t.y);
		desenho.makeRotacao(a);
		desenho.makeEscala(s.x, s.y);
		desenho.makeCisalhamento(c.x, c.y);
		
	}
	
	public void makeFormas(int s) {
		desenho.reset();
		desenho.makeFormas(s);
	}
	
	public Desenho getDesenho() {
		return desenho;
	}
	
	
	

}