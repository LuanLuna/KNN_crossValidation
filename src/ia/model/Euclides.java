package ia.model;

import ia.util.Imagem;

public abstract class Euclides {
	
	public static double distanciaEuclidiana(Imagem imagem1, Imagem imagem2){
		double somatorio = 0;
		for(int i=0; i < imagem1.getPixelMatriz().length; i++){
			for(int j = 0; j < imagem1.getPixelMatriz()[i].length; j++){
				int diferenca = imagem1.getPixelMatriz()[i][j] - imagem2.getPixelMatriz()[i][j];
				somatorio += Math.pow(diferenca, 2);
			}
		}
		return Math.sqrt(somatorio);
	}
}
