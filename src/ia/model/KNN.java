package ia.model;

import ia.util.Categorizador;
import ia.util.Distancia;
import ia.util.Imagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KNN {
	private List<Imagem> treinamento;
	private List<Imagem> teste;
	private Categorizador categorizador;
	
	public KNN(List<Imagem> treinamento) {
		int quantTreino = (int) (treinamento.size()*0.80);
		this.treinamento = treinamento.subList(0, quantTreino);
		this.teste = treinamento.subList(quantTreino, treinamento.size());
//		System.out.println("tamTreino: "+this.treinamento.size());
//		System.out.println("tamTeste: "+this.teste.size());
	}
	public double classificarImagens(int K){
		int acertos = 0;
		int q = 0;
		for(Imagem img: this.teste){
			System.out.println("Classificando..."+q);
			q++;
			int tamTreino = treinamento.size();
			//mapa para quardar as distancias e o indice
			List<Distancia> distancias = new ArrayList<>();
			//calcula a distancia euclidiana dos individuos
			for(int i = 0; i < tamTreino; i++){
				double distancia = Euclides.distanciaEuclidiana(this.treinamento.get(i), img);
				//System.out.println(distancia);
				distancias.add(new Distancia(distancia, this.treinamento.get(i)));
			}
			Collections.sort(distancias);
			//categorizar a imagem
			categorizador = new Categorizador();
			for(int i = 0; i < K; i++){
				int rotulo = distancias.get(i).getImagem().getRotulo();
				rotular(rotulo);
			}
			int categoria = categorizador.categorizar();
			if(categoria == img.getRotulo())
				acertos++;
		}
		
		
		return (acertos*100)/this.teste.size();
	}
	private void rotular(int rotulo){
		switch(rotulo){
		case 0:
			categorizador.cout0();
			break;
		case 1:
			categorizador.cout1();
			break;
		case 2:
			categorizador.cout2();
			break;
		case 3:
			categorizador.cout3();
			break;
		case 4:
			categorizador.cout4();
			break;
		case 5:
			categorizador.cout5();
			break;
		case 6:
			categorizador.cout6();
			break;
		case 7:
			categorizador.cout7();
			break;
		case 8:
			categorizador.cout8();
			break;
		case 9:
			categorizador.cout9();
			break;
		}
	}
}
