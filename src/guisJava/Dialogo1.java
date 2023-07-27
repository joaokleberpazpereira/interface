package guisJava;
import javax.swing.JOptionPane;
public class Dialogo1 {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		String message = String.format("Seja Bem vindo %s esta é a caixa de dialogo ", nome);
		
		if (message == "") {
		JOptionPane.showMessageDialog(null, message);
		} else {
			JOptionPane.showMessageDialog(null, "Você não inseriu um nome..");
		}
	}// fim do método principal

}
