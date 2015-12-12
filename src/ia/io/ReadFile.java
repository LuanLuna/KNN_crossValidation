package ia.io;

import ia.util.Imagem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class ReadFile {
	private static final String FILE = "mnisttrain.csv";
	public ReadFile() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<Imagem> read() throws FileNotFoundException{
		Scanner scanner = new Scanner(new FileReader(FILE));
		scanner.nextLine();
		
		List<Imagem> imagens = new ArrayList<>();
		while (scanner.hasNextLine()) {
			String[] line = scanner.nextLine().split(",");
			int rotulo = Integer.parseInt(line[0]);
			int[][] pixels = new int[28][28];
			int w = 0;
			for(int i = 0; i < pixels.length; i++){
				for(int j = 0; j < pixels[i].length; j++){
					pixels[i][j] = Integer.parseInt(line[w]);
					w++;
				}
			}
			imagens.add(new Imagem(rotulo, pixels));
			
			
		}
		return imagens;
	}
}
