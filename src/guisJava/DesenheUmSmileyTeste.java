package guisJava;
import javax.swing.JFrame;

public class DesenheUmSmileyTeste {
	
	public static void main(String[] args) {
		DesenheUmSmiley painel = new DesenheUmSmiley();
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.add(painel);
		aplicacao.setSize(230, 250);
		aplicacao.setVisible(true);
		}// fim do método principal

}
