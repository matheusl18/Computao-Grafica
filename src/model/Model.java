package model;

import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entidades.Circulo;
import entidades.Desenho;
import entidades.Ponto;
import view.Botoes;

public class Model {
	
	public List<Ponto> pontos = new ArrayList<>();
	

	
	Desenho desenho = new Desenho(pontos);
	Circulo circulo = new Circulo(20);
	Shape circuloTransformado = circulo;
	
	public Model() {
	}
	
	public void makeTransformacoes(
			Ponto t,  // valor da transformação de translação
			double a,  // valor do angulo de rotação
			Ponto s,
			Ponto c
			) {
		List<Ponto> pontosCirculo = new ArrayList<>(); 
		pontosCirculo.add(new Ponto(1, 1));
		if(desenho.getPontos() == null) {
			System.out.println("Desenho eh nulo");
		}else if(desenho.getPontos().size() == 1){
			
			Point2D.Double pontoCentral = circulo.getPontoCentral();
			
			AffineTransform transformacao = new AffineTransform();
			
			//Rotação
			transformacao.preConcatenate(AffineTransform.getTranslateInstance(-pontoCentral.x, -pontoCentral.y));
			transformacao.preConcatenate(AffineTransform.getRotateInstance(a));
			transformacao.preConcatenate(AffineTransform.getTranslateInstance(pontoCentral.x, pontoCentral.y));
			
			//Escala
			transformacao.preConcatenate(AffineTransform.getTranslateInstance(-pontoCentral.x, -pontoCentral.y));
			transformacao.preConcatenate(AffineTransform.getScaleInstance(s.x, s.y));
			transformacao.preConcatenate(AffineTransform.getTranslateInstance(pontoCentral.x, pontoCentral.y));
			
			//Cisalhamento
			transformacao.preConcatenate(AffineTransform.getTranslateInstance(-pontoCentral.x, -pontoCentral.y));
			transformacao.preConcatenate(AffineTransform.getShearInstance(c.x, c.y));
			transformacao.preConcatenate(AffineTransform.getTranslateInstance(pontoCentral.x, pontoCentral.y));
			
			//Translação
			transformacao.preConcatenate(AffineTransform.getTranslateInstance(t.x, t.y));
			
			circuloTransformado = transformacao.createTransformedShape(circulo);
			
		}else {
			
			desenho.reset();
			desenho.makeTransladar(t.x, t.y);
			desenho.makeRotacao(a);
			desenho.makeEscala(s.x, s.y);
			desenho.makeCisalhamento(c.x, c.y);
		};
		
	}
	
	public void makeFormas(int s) {
		desenho.makeFormas(s);
	}
	
	public Desenho getDesenho() {
		return desenho;
	}
	public Shape getCirculo() {
		return circuloTransformado;
	}
	
	
	

}