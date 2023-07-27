package exercicios;

public class TestesDeOperadoresRelacionais {
	public static void main(String[] args) {
	boolean verdade = true;
	boolean falso = false;
	    // cria a tabela-verdade para o operador && (E condicional)
		System.out.printf("%s%n%s %b%n%s %b%n%s %b%n%s %b%n%n", 
				"Relacional And (&&)",
				"Falso && falso           =", (falso && false),
				"falso && verdadeiro      =", (falso && verdade),
				"verdadeiro && falso      =", (verdade && false),
				"verdadeiro && verdadeiro =", (verdade && true));
		// cria a tabela-verdade para o operador || (OU condicional)
		System.out.printf("%s%n%s %b%n%s %b%n%s %b%n%s %b%n%n", 
				"Relacional And (||)",
				"Falso || falso           =", (falso || false),
				"falso || verdadeiro      =", (falso || verdade),
				"verdadeiro || falso      =", (verdade || false),
				"verdadeiro || verdadeiro =", (verdade || true));
		// cria a tabela-verdade para o operador & (E lógico booleano)
		System.out.printf("%s%n%s %b%n%s %b%n%s %b%n%s %b%n%n", 
				"Relacional And (&)",
				"Falso & falso            =", (falso & false),
				"falso & verdadeiro       =", (falso & verdade),
				"verdadeiro & falso       =", (verdade & false),
				"verdadeiro & verdadeiro  =", (verdade & true));
		// cria a tabela-verdade para o operador ^ (OU exclusivo lógico booleano)
		System.out.printf("%s%n%s %b%n%s %b%n%s %b%n%s %b%n%n", 
				"Relacional And (^)",
				"Falso ^ falso      	 =", (falso ^ false),
				"falso ^ verdadeiro 	 =", (falso ^ verdade),
				"verdadeiro ^  falso      =", (verdade ^ false),
				"verdadeiro ^  verdadeiro =", (verdade ^ true));
		// cria a tabela-verdade para o operador | (OU inclusivo lógico booleano)
		System.out.printf("%s%n%s %b%n%s %b%n%s %b%n%s %b%n%n", 
				"Relacional And (|)",
				"Falso | falso      	 =", (falso | false),
				"falso | verdadeiro 	 =", (falso | verdade),
				"verdadeiro | falso       =", (verdade | false),
				"verdadeiro | verdadeiro  =", (verdade | true));
		// cria a tabela-verdade para o operador ! (negação lógica)
		System.out.printf("%s%n%s %b%n%s %b%n",
				"Operação negação logica ( ! )",
				"!Falso   =",(!false),
				"!verdade =", (!true));
	}// fim do método principal

}// fim da classe Teste De Operadores Relacionais
