package proxy;

import proxy_example.entities.ImagemReal;
import proxy_example.interfaces.Imagem;

public class ImagemProxy implements Imagem {
	// DI
	private ImagemReal imagemReal;
	private String imagem;
	
	public ImagemProxy(String imagem) {
		this.imagem = imagem;
	}
	
	public void exibir() {
		if(imagemReal == null) 
		{
			imagemReal = new ImagemReal(imagem);
		} 
		
		else 
		{
			imagemReal.exibir();
		}
	}
}
