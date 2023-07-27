package exercicios;
import java.security.SecureRandom;

public class InteirosAleatorios {
	public static void main(String[] args) {
		// o objeto securanca produzira numeros seguros
		SecureRandom seguranca = new SecureRandom();
		// for para fazer um loop de 1 a 20;
		for(int contador = 1; contador <= 20; contador++) {
			// selecionar um inteiro aleotorio de 1 a 6
			int tela = 1 + seguranca.nextInt(6);
			// exibe o valor gerado;
			System.out.printf("%d ", tela);
			
			if(contador % 5== 0) {// se o contador for divisivel por 5,
				System.out.println();// inicia uma nova linha;
			}// fim do if
		}// fim do for
	}// fim do método principal

}// fim da classe
