package ia.view;

import java.io.FileNotFoundException;
import java.util.List;

import ia.io.ReadFile;
import ia.model.KNN;
import ia.util.Imagem;

public class KNNMain {

	public static void main(String[] args) {
		try {
			List<Imagem> imagens = ReadFile.read();
			KNN knn = new KNN(imagens);
			double classificacao = knn.classificarImagens(50);
			System.out.println("O algoritmo teve "+classificacao+"% de sucesso");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
