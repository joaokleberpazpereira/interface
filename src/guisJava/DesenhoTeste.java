package guisJava;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DesenhoTeste {
	public static void main(String[] args) {
		// Obtém a escolha do formato de desenho do usuário
		String entrada = JOptionPane.showInputDialog(
				"Digite 1 para Desenhar quadrados \n"+
					"Digite 2 para Desenhar ovais");
		
		//convertendo a entrada do usuário do tipo String para o tipo INT.
		int escolha = Integer.parseInt(entrada);
		
		// Criando um painel com a entrada do usuário;
		Desenhos_1_0_0 formato = new Desenhos_1_0_0(escolha);
		
		// criando um novo JFrame
		JFrame aplicacao = new JFrame();
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// lembre-se que toda vez que você for add, adicione o método que foi instanciado
		aplicacao.add(formato);
		aplicacao.setSize(300, 300);
		aplicacao.setVisible(true);
		
	}// fim do método principal

}// fim da classe desenho Teste
