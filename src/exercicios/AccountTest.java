package exercicios;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Cria um objeto  Account e o atribui a minhComta
		Account minhaConta1 = new Account("Kleber", 54.53);
		Account minhaConta2 = new Account("Santiago", 7.74);
		
		// Exibe os valores iniciais das contas ;
		System.out.printf("%s valor %.2f%n",
				minhaConta1.getName(), minhaConta1.getBalance());
		System.out.printf("%s valor %.2f%n", 
				minhaConta2.getName(), minhaConta2.getBalance());
		
		//Recebendo o valor de entrada do usuário
		System.out.print("Digite o valor para conta: ");
		double depositAmount = entrada.nextDouble(); // obtém o valor que o usuário dgitou
		
		System.out.printf("Adicionou %.2f$ na conta.%n%n",
				depositAmount);//
		minhaConta1.deposit(depositAmount);// adiciona o saldo da minhaConta1
		// exibe o nome armazenado no objeto myAccount
		System.out.printf("%s conta %.2f %n",
				minhaConta1.getName(), minhaConta1.getBalance());
		System.out.printf("%s conta %.2f %n",
				minhaConta2.getName(), minhaConta2.getBalance());
		
		// recebendo o valor para a segunda conta
		System.out.print("Digite o valor para a segunda conta:");
		 depositAmount =  entrada.nextDouble();
		System.out.printf("Adicionou %.2f$ para a  %n%n", depositAmount);
		minhaConta2.deposit(depositAmount);
		
		System.out.printf("%s valor %.2f%n",
				minhaConta1.getName(), minhaConta1.getBalance());
		System.out.printf("%s valor %.2f%n", 
				minhaConta2.getName(), minhaConta2.getBalance());
		entrada.close();
	}// fim do método principal
}// fim da classe Account test
