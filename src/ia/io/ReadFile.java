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
			int[] pixels = new int[784];
			for(int i = 1; i < pixels.length; i++){
				pixels[i] = Integer.parseInt(line[i]);
			}
			imagens.add(new Imagem(rotulo, pixels));
		}
		return imagens;
	}
}
