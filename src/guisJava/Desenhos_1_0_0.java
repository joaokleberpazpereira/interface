package guisJava;
import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Desenhos_1_0_0  extends JPanel{
	// escolha do usuário de qual forma desenhar
   private int escolha;// variável de instância
	
	// configura a escolha do usuario
	public Desenhos_1_0_0 (int userEscolha) {
		escolha = userEscolha;
	}// fim do contrutor
	// densenha uma cascata de formas que iniciam no canto superior esquerdo
	public void paintComponent (Graphics g ) {
		super.paintComponent(g);
		
		for (int i = 0; i < 10; i++) {
			// Seleciona a forma com base na escolha do usuário
			switch (escolha) {
			case 1 :
				g.drawRect(10 + i * 10,
						10 + i * 10,
						50 + i * 10,
						50 + i * 10);
				break;
			case 2:
				g.drawOval(10 + i * 10,
						10 + i * 10,
						50 + i * 10,
						50 + i * 10);
				break;
			}// fim do switch
		}// fim do for
	}// fim do paint component
	

}// fim da classe Desenhos_1_0_0
