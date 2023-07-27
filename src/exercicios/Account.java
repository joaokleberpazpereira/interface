package exercicios;

public class Account {
	private String name;
	private double balance;
	//construtor que recebe dois parâmetros 
	public Account (String name, double balance) {
		this.name = name;
		// mantendo uma variável balance padrão 
		if (balance > 0.0) { // se o saldo for válido 
			this.balance = balance; // atribuí a variável de instância balance
		}// fim do If balance
	}// fim do método account
	// deposita uma quantia válida de saldo
	public void deposit (double depositAmount) {
		if (depositAmount > 0.0) { // se deposito for válido 
			balance = balance + depositAmount;// adiciona ao saldo
		}// fim do IF amount
	}// fim da classe deposit
	// mostra o saldo da conta
	public double getBalance() {
		return balance;
	}// fim do getBalance
	// Método para definir o nome do objeto
	public void setName(String name) {
		this.name = name; // armazena o nome
		
	}// fim do método setName
	
	// Método para recuperar o nome do objeto;
	public String getName() {
		return name;
	}// Fim do método getName
}
