package view;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import entidades.Desenho;
import entidades.Ponto;
import model.Transformacoes;

public class Tela extends JPanel {
	
	Desenho desenho;
	Shape circulo;

	//static List<Ponto> pontosCirculo = new ArrayList<>();
	
	public Tela(Desenho desenho, Shape circulo) {
		this.desenho = desenho;
		this.circulo = circulo;
	}
	
	public void atualiza(Desenho desenho, Shape circulo) {
		this.desenho = desenho;
		this.circulo = circulo;
		repaint();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		
		this.setBackground(new Color(230, 230, 230));
		
		g2d.setStroke(new BasicStroke(15));
		
		List<Ponto> pontos = desenho.getPontos(); 
		
		if(pontos==null) {
			System.out.println("Desenho eh nulo");
			return;
		}else if(pontos.size() == 1){
			g2d.fill(circulo);
		}else{
			Ponto pontoAnterior = pontos.get(pontos.size()-1);
			Cores cor = Cores.values()[0];
			for(Ponto pontoAtual: pontos) {
				g2d.setColor(cor.getCor());
				g2d.drawLine(
						(int)pontoAnterior.x, (int)pontoAnterior.y, 
						(int)pontoAtual.x,    (int)pontoAtual.y);
				
				cor = cor.next();
				pontoAnterior = pontoAtual;
				
			}
		}
		
		
		
	}

}