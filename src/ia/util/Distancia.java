package ia.util;

public class Distancia implements Comparable<Distancia>{
	private double distancia;
	private Imagem imagem;
	
	public Distancia(double distancia, Imagem imagem) {
		this.distancia = distancia;
		this.imagem = imagem;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public Imagem getImagem() {
		return imagem;
	}
	public void setImagem(Imagem imagem) {
		this.imagem = imagem;
	}
	@Override
	public int compareTo(Distancia dist) {
		if(this.distancia > dist.getDistancia())
			return 1;
		else if(this.distancia < dist.getDistancia())
			return -1;
		return 0;
	}
	
	
}
