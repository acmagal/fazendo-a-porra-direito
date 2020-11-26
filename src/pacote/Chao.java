package pacote;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//ESTA CLASSE DEVE SE OBRIGATORIAMENTE MANTIDA NO PROJETO. QUALQUER ALTERAÇÃO REALIZADA DEVE OBEDECER A HIERARQUIA.
public class Chao {
	
	private int x;
	private int y;
	private BufferedImage img;
	private Rectangle rectangle;
	
	
	
	public Chao() {
		rectangle = new Rectangle();		
		
		
	}
	
	public Chao(int x, int y, String path) {
		this.setImg(path);

		//O retângulo do desenho tem as mesmas dimensões e coordenadas da imagem.
		rectangle = new Rectangle();
		rectangle.height = this.getImg().getHeight();
		rectangle.width = this.getImg().getWidth();
		
		this.setX(x);
		this.setY(y);
		
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
		rectangle.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
		rectangle.y = y;
	}

	public BufferedImage getImg() {
		return img;
	}

	public void setImg(String path) {
		File fileImg = new File(path);
		try {
			img = ImageIO.read(fileImg);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public Rectangle getRectangle() {
		
		
		return rectangle;
	}
	
	
	public void desenhar(Graphics g) {
		//Desenhando a imagem na tela
		g.drawImage(this.getImg(), this.getX(), this.getY(), null);
	}

	
	

	
}
