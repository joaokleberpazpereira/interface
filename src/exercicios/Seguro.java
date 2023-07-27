package exercicios;

public class Seguro {
	private int numeroDaConta;
	private String modelo;
	private String estado;
	
	//Iniciando o construtor
	public Seguro( int numeroDaConta, String modelo, String estado) {
		// vou deixar private e se der um erro eu troco por public
		this.numeroDaConta = numeroDaConta;
		this.modelo = modelo;
		this.estado = estado;
	}// fim do construtor seguro
	
	// define o número da conta
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}// fim do método set numero da conta
	
	// retorna o número da conta
	public int getNumerodaconta()  {
		return numeroDaConta;
	}// fim do método get numero da conta
	
	// configura o modelo
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}// fim do método set modelo
	
	//retorna o modelo
	public String getModelo() {
		return modelo;
	}// fim di método get modelo
	
	// Define o estado
	public void setEstado( String estado) {
		this.estado = estado;
	}//fim do método set estado
	
	// Retorna o estado
	public String getEstado () {
		return estado;
	}// fim do método get estados
	
	// método predicato e retornado se o estado tem seguros "Sem Culpa"
	public boolean isNoFaultEstado() {
		boolean noFaultEstado;
		
		// Determina se o estado tem seguros do automovel "Sem Culpa"
		switch (getEstado()) {// Obtém a abreviatura do estado do seguro
		case "MA" : case "CE": case "RJ" : case "SC" :
			noFaultEstado = true;
			break;
			default :
			noFaultEstado = false;
			break;
		}
		
		return noFaultEstado;
	}// fim do método is no fault estado

}// fim da classe seguro
