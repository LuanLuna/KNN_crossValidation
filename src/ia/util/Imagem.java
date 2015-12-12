package ia.util;

public class Imagem {
	private int rotulo;
	private int[][] pixelMatriz;
	
	public Imagem(int rot, int[][] matriz) {
		this.rotulo = rot;
		this.pixelMatriz = matriz;
	}
	
	public int getRotulo() {
		return rotulo;
	}
	public void setRotulo(int rotulo) {
		this.rotulo = rotulo;
	}
	public int[][] getPixelMatriz() {
		return pixelMatriz;
	}
	public void setPixelMatriz(int[][] pixelMatriz) {
		this.pixelMatriz = pixelMatriz;
	}
	
	
}
