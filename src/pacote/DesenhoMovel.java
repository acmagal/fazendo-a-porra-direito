package pacote;

//ESTA CLASSE DEVE SE OBRIGATORIAMENTE MANTIDA NO PROJETO. QUALQUER ALTERA��O REALIZADA DEVE OBEDECER A HIERARQUIA
//ELA DEVE SER UTILIZADA NA HERAN�A DE DESENHOS QUE POSSAM SER MOVIMENTADOS PELO USU�RIO 
public class DesenhoMovel extends Chao {
	
	public DesenhoMovel() {}
	
	public DesenhoMovel(int x, int y, String path) {
		super(x, y, path);
		
		
	}
	
	public void moverDireita() {
		this.setX(this.getX() + 25);
	}
	
	public void moverEsquerda() {
		this.setX(this.getX() - 25);
	}
	public void moverCima() {
		this.setY(this.getY() - 25);
	}
	
	public void moverBaixo() {
		this.setY(this.getY() + 25);
	}
	
	
	
	
	
}
