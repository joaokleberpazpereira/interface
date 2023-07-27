package guisJava;
import javax.swing.JFrame;

public class PainelDeDesenhoTeste {
	public static void main(String[] args) {
		
		//  Cria um painel que contém nosso desenho
		PainelDeDesenhos panel = new PainelDeDesenhos();
		
		// Cria um novo quadro para armazenar o painel
		JFrame application = new JFrame();
		
		// configura o frame para ser encerrado quando é fechado
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);// Adiciona o painel ao Frame
		application.setSize(250 , 250); // Configura o tamanho do Frame
		application.setVisible(true); // Torna o Frame visivel
		
	}// fim do método principal

}// fim da clase Painel de Desenho Teste
