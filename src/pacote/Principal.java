package pacote;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.swing.JFrame;

//ESTA CLASSE DEVE SE OBRIGATORIAMENTE MANTIDA NO PROJETO. QUALQUER ALTERAÇÃO REALIZADA DEVE OBEDECER A HIERARQUIA
public class Principal extends JFrame implements KeyListener {

	private Chao chao;
	private Barata barata;
	private Pe pe;
	private static final long serialVersionUID = 1L;
	int contador = 0;
	
	
	
	

	public Principal() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Desenhando a tela e seus elementos
		chao = new Chao(0,0,"chao.jpg");
		barata = new Barata(46,340,"barata.png");
		pe = new Pe(490,100,"pe.png");
		//Adicionando o evento de teclado
		this.addKeyListener(this);
		
		
	}
	
	//EVITAR ALTERAR ESSE MÉTODO
	public static void main(String[] args) {
		//Criando uma instância da classe principal
		Principal t = new Principal();
		t.setSize(1000, 700);
		t.createBufferStrategy(1);		
		t.setVisible(true);
		t.createBufferStrategy(2);
		
		
	}

	//EVITAR ALTERAR ESSE MÉTODO
	public void renderizarGraphics() {
		if (!getBufferStrategy().contentsLost()) getBufferStrategy().show();
	    Graphics g = getBufferStrategy().getDrawGraphics();
	     
	    //Criando um contexto gráfico
	    Graphics g2 = g.create();
	    //Limpando a tela
	    g2.setColor(Color.WHITE);        
	    g2.fillRect(0, 0, getWidth(), getHeight());

	    renderizarImagens(g2);
	     
	    //Liberando os contextos criados.
	    g.dispose(); 
	    g2.dispose();
	}
	
	//ESSE É O MÉTODO QUE DEVE SER ADAPTADO AO PROJETO
	public void renderizarImagens(Graphics g2) {
		//Desenhando as imagens
		chao.desenhar(g2);
		barata.desenhar(g2);
		pe.desenhar(g2);
	}
	
	//EVITAR ALTERAR ESSE MÉTODO
	public void paint(Graphics g) {
		this.renderizarGraphics();
		repaint();
	}

	public void keyPressed(KeyEvent evt) {
		//Especificando o comportamento das teclas
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT){
        	barata.moverDireita();
        	
        	repaint();
        }
        else
        if (evt.getKeyCode() == KeyEvent.VK_LEFT){
        	barata.moverEsquerda();
        	repaint();
        }
        
        else
            if (evt.getKeyCode() == KeyEvent.VK_UP){
            	barata.moverCima();
            	repaint();
            }
            else
                if (evt.getKeyCode() == KeyEvent.VK_DOWN){
                	barata.moverBaixo();
                	repaint();
                }
        
        if(barata.getRectangle().intersects(pe.getRectangle())) {
    		System.out.println("Fim de jogo");
    		contador ++;
    	}
    	if(pe.getRectangle().intersects(barata.getRectangle())){
    		System.out.println("Fim de jogo");
    		System.out.println("");
    		contador ++;
    		}
    	}
    	
    
	
	
	public void keyReleased(KeyEvent arg0) {}
	public void keyTyped(KeyEvent arg0) {}
	
	
}
