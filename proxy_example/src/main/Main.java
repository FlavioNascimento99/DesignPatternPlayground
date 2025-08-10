package main;

import proxy.ImagemProxy;
import proxy_example.interfaces.Imagem;

public class Main {
	public static void main(String[] args) {
		Imagem img = new ImagemProxy("Photo_Graduation_2025.jpg");
		img.exibir();
		img.exibir();
	}
}
