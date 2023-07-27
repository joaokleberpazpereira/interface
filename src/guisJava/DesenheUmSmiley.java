package guisJava;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DesenheUmSmiley extends JPanel {
	
	/**
	 * Esta classe vai ser usada para formar e colorir o rosto,
	 * Os olhos, a boca e o retoque para criar um sorriso 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// desenha o rosto
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200);
		
		// Desenha os olhos
		g.setColor(Color.black);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65, 30, 30);
		
		// Desenha a boca
		g.fillOval(50, 110, 120, 60);
		
		// Retoca a boca para criar um sorriso
		g.setColor(Color.YELLOW);
		g.fillRect(50, 110, 120, 30);
		g.fillOval(50, 120, 120, 40);
	
	}// fim do método graphics
	

}// fim da classe desenhe um Smiley
