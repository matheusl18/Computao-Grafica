package model;

import java.util.ArrayList;
import java.util.List;

import entidades.Ponto;

public class Formas {
	
	
	 static List<Ponto> pontos = new ArrayList<>();
	
	static public List<Ponto> Forma(int s) {
		pontos.clear();
		switch(s) {
		case 1:
			pontos.add(new Ponto(300, 250));
			pontos.add(new Ponto(350, 350));
			pontos.add(new Ponto(250, 350));
			System.out.println(s);
			break;
		case 2:
			pontos.add(new Ponto(250, 250));
			pontos.add(new Ponto(350, 250));
			pontos.add(new Ponto(350, 350));
			pontos.add(new Ponto(250, 350));
			System.out.println(s);
			break;
		case 3:
			pontos.add(new Ponto(230, 285));
	    	pontos.add(new Ponto(300, 215));
	    	pontos.add(new Ponto(370, 285));
			pontos.add(new Ponto(350, 385));
			pontos.add(new Ponto(250, 385));
			System.out.println(s);
			break;
		case 4:
			pontos.add(new Ponto(250, 200));
			pontos.add(new Ponto(350, 200));
			pontos.add(new Ponto(400, 300));
			pontos.add(new Ponto(350, 400));
			pontos.add(new Ponto(250, 400));
			pontos.add(new Ponto(200, 300));
			System.out.println(s);
			break;
		case 5:
			pontos.add(new Ponto(220, 225));
			pontos.add(new Ponto(300, 170));
			pontos.add(new Ponto(380, 225));
			pontos.add(new Ponto(400, 325));
			pontos.add(new Ponto(350, 410));
			pontos.add(new Ponto(250, 410));
			pontos.add(new Ponto(200, 325));
			System.out.println(s);
			break;
		case 6:
			pontos.add(new Ponto(200, 225));
			pontos.add(new Ponto(250, 140));
			pontos.add(new Ponto(350, 140));
			pontos.add(new Ponto(400, 225));
			pontos.add(new Ponto(400, 325));
			pontos.add(new Ponto(350, 410));
			pontos.add(new Ponto(250, 410));
			pontos.add(new Ponto(200, 325));
			System.out.println(s);
			break;
		}
		System.out.println(pontos);
		return pontos;
	}

}
