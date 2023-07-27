package exercicios;

public class SeguroTeste {
	public static void main(String[] args) {
		// criando dois objetos da classe Seguro
		Seguro conta1 = new Seguro (1111,"fusca", "MA");// aqui o new seguro ja esta com os valores explicido
		Seguro conta2 = new Seguro (2222, "peugout", "CE");
			
		// Exibe se cada objet esta em um Estado "Sem culpa"
		seguroInNoFaultEstado(conta1);
		seguroInNoFaultEstado(conta2);
		
	}// fim do método principal
	
	// método que mostra se um estado tem o seguro "Sem culpa"
	public static void seguroInNoFaultEstado(Seguro seguro) {
		System.out.println("Política de segurança;");
		System.out.printf("Conta:%d, modelo: %s, Estado: %s, %s  tem seguro%n%n",
				seguro.getNumerodaconta(),
				seguro.getModelo(), 
				seguro.getEstado(),
				(seguro.isNoFaultEstado() ? "sim": "não"));
		
	}// fim do método seguro in fault estado

}// fim da classe seguro teste;
