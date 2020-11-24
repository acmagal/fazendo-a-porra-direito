package pacote;

import java.awt.Rectangle;

//ESTA CLASSE FOI CRIADA AQUI APENAS COMO EXEMPLO. O ALUNO DEVE SUBSTITUI-LA POR OUTRA CLASSE CONFORME O PROJETO.
public class Bounce extends DesenhoMovel {
	
	private Rectangle rectangle2;
	public Bounce() {
		
	}
	
	public Bounce(int x, int y, String path) {
		super(x, y, path);
		rectangle2 = new Rectangle();
		rectangle2.height = this.getImg().getHeight();
		rectangle2.width = this.getImg().getWidth();
		
		this.setX(x);
		this.setY(y);
		
	
	
		
	}
	
	
	
	
	
}
