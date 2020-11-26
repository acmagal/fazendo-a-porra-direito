package pacote;

//ESTA CLASSE DEVE SE OBRIGATORIAMENTE MANTIDA NO PROJETO. QUALQUER ALTERAÇÃO REALIZADA DEVE OBEDECER A HIERARQUIA
//ELA DEVE SER UTILIZADA NA HERANÇA DE DESENHOS QUE POSSAM SER MOVIMENTADOS PELO USUÁRIO 
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
