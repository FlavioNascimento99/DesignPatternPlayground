package proxy_example.entities;

import proxy_example.interfaces.Imagem;

public class ImagemReal implements Imagem {
	public ImagemReal(String imagem) {
		System.out.println("Sua imagem: " + imagem);
	}
	
	public void exibir() {
		System.out.println("Exibindo imagem!");
	}
}
