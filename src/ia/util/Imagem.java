package ia.util;

public class Imagem {
	private int rotulo;
	private int[] pixels;
	
	public Imagem(int rot, int[] matriz) {
		this.rotulo = rot;
		this.pixels = matriz;
	}
	
	public int getRotulo() {
		return rotulo;
	}
	public void setRotulo(int rotulo) {
		this.rotulo = rotulo;
	}
	public int[] getPixelMatriz() {
		return pixels;
	}
	public void setPixelMatriz(int[] pixelMatriz) {
		this.pixels = pixelMatriz;
	}
	
	
}
