package pacote;


import java.util.Random;



//ESTA CLASSE FOI CRIADA AQUI APENAS COMO EXEMPLO. O ALUNO DEVE SUBSTITUI-LA POR OUTRA CLASSE CONFORME O PROJETO.
//Aqui substituo a classe apresenta para sempre criar um objeto inimigo que se move randomicamente no mapa.
public class Inimigo extends DesenhoAnimado {
	
	


	
	private int loopStatus = 0;
	private Thread t = new Thread(this);
	Random gerador = new Random();
	
	

	

	public Inimigo() {
		
	}
	public Inimigo(int x, int y, String path) {
		super(x, y, path);
		
		this.setX(x);
		this.setY(y);
		
		
		t.start();
		
		
		
		
	}
	
	
		
	
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
	        gerador.nextInt(200);
	    }
		
		while(true) {
			switch(loopStatus) {
				case 0:
					this.setX(this.getX() + gerador.nextInt(200));
					break;
				case 1:
					this.setY(this.getY() + 200);
					break;
				
				case 2:
					this.setY(this.getY() - 200);
					break;
				case 3:
					this.setX(this.getX() - gerador.nextInt(200));
					break;
					
					
			}
			
			try {
				t.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			loopStatus++;
			if(loopStatus == 4) loopStatus = 0;
			
				
			
			
		}
	}


	
}