package ia.util;

public class Categorizador {
	private int[] frequencia_digitos;
	
	
	public Categorizador() {
		// TODO Auto-generated constructor stub
		this.frequencia_digitos = new int[]{0,0,0,0,0,0,0,0,0,0};
	}
	
	public void cout0(){this.frequencia_digitos[0] ++;}
	public void cout1(){this.frequencia_digitos[1] ++;}
	public void cout2(){this.frequencia_digitos[2] ++;}
	public void cout3(){this.frequencia_digitos[3] ++;}
	public void cout4(){this.frequencia_digitos[4] ++;}
	public void cout5(){this.frequencia_digitos[5] ++;}
	public void cout6(){this.frequencia_digitos[6] ++;}
	public void cout7(){this.frequencia_digitos[7] ++;}
	public void cout8(){this.frequencia_digitos[8] ++;}
	public void cout9(){this.frequencia_digitos[9] ++;}
	
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
