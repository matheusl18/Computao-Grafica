entidade do pacote ;

importar java. Pois é. geom. Caminho2D;
importar java. Pois é. geom. Ponto 2D;
importar java. Pois é. geom. Retângulo2D;


classe pública  Circulo estende Path2D. Dobrar {

	Duplo Raio;
	Ponto 2D. Duplo centro;
	int quantidadePontos;

	 public Circulo(int aQuantidadePontos) {
		súper();
		isso. quantidadePontos = aQuantidadePontos;
		centro = novo Point2D. Duplo(350, 350);
		raio = 100;

		updateCirculo();
	}

	public void updateQuantidadePontos(int aQuantidadePontos) {
		isso. quantidadePontos = aQuantidadePontos;
		updateCirculo();
	}

	atualização de vazio privadoCirculo() {
		repor();
		duplo intervaloMinimo = 0, intervalorMaximo = 2*Matemática. PI;
		duplo incremento = intervalorMaximo/quantidadePontos;

		Ponto 2D. Ponto duploInicial = calculaPonto(intervaloMinimo );

		moveTo(pontoInicial. x, pontoInicial. y);

		para(int i=1; i<quantidadePontos; eu++) {
			duplo t = i*incremento;
			Ponto 2D. Duplo p = calculaPonto(t);
			linhaTo(p. Págs. y);
		}

		fecharCaminho();

	}

	 privado Point2D.  Duplo cálculoPonto(duplo t){
		duplo x = centro. x + raio*Matemática. cos(t);
		duplo y = centro. y + raio*Matemática. pecado(t);
		retornar novo Point2D. Duplo(x, y);
	}



	 público Point2D. Duplo getPontoCentral() {
		Retângulo2D. Duplo retângulo = (Rectangle2D. Duplo)getBounds2D();

		Ponto 2D. Canto duplo  = novo Point2D. Duplo(retangulo. x, retangulo. y);

		Ponto 2D. Ponto duplo = novo Point2D. Dobrar(
				canto. x + retangulo. largura/2, 
				canto. y + retangulo. altura/2 
				);

		retorno pontoCentral;
	}



}
