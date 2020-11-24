package pacote;

import java.awt.Rectangle;

//ESTA CLASSE FOI CRIADA AQUI APENAS COMO EXEMPLO. O ALUNO DEVE SUBSTITUI-LA POR OUTRA CLASSE CONFORME O PROJETO.
public class Inimigo extends DesenhoAnimado {
	
	
	
	private int loopStatus = 0;
	private Thread t = new Thread(this);
	private Rectangle rectangle3;

	

	public Inimigo() {
		
	}
	public Inimigo(int x, int y, String path) {
		super(x, y, path);
		rectangle3 = new Rectangle();
		rectangle3 = new Rectangle();
		rectangle3.height = this.getImg().getHeight();
		rectangle3.width = this.getImg().getWidth();
		
		this.setX(x);
		this.setY(y);
		
		

		t.start();
		
		
	}
	
	
		
	
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		while(true) {
			switch(loopStatus) {
				case 0:
					this.setX(this.getX() + 100);
					break;
				case 1:
					this.setY(this.getY() + 200);
					break;
				case 2:
					this.setX(this.getX() - 100);
					break;
				case 3:
					this.setY(this.getY() - 200);
					break;
					
					
			}
			
			try {
				t.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			loopStatus++;
			if(loopStatus == 4) loopStatus = 0;
			
		}
	}


	
}