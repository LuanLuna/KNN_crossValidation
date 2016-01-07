package ia.util;

public class Categorizador {
	private int[] frequencia_digitos;
	
	
	public Categorizador() {
		// TODO Auto-generated constructor stub
		this.frequencia_digitos = new int[]{0,0,0,0,0,0,0,0,0,0};
	}
	public void count(int i){
		this.frequencia_digitos[i] ++;
	}
	
	public int categorizar(){
		int maior = 0; 
		for(int w = 0; w < this.frequencia_digitos.length; w++){
			if(this.frequencia_digitos[w] > this.frequencia_digitos[maior]){
				maior = w;
			}
		}
		return maior;
	}
	
}
