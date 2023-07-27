package guisJava;
import java.awt.Graphics;
import javax.swing.JPanel;
public class PainelDeDesenhos extends JPanel {
	public void paintComponent (Graphics g) {
		//chama paintComponent para assegurar que o painel é exibido corretamente 
		super.paintComponent(g);
		
		int largura = getWidth();
		int altura = getHeight();
		// Desenha uma linha a partir do canto superior esquerdo até o inferior direito.
		g.drawLine(0, 0, largura, altura);
		// Desenha uma linha a partir do canto inferior esquerdo até o superior direito.
		g.drawLine(0, altura, largura, 0);
	}// fim do método paint component

}// fim da classe Painel De Desenhos
