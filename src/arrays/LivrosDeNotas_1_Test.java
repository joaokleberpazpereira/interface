package arrays;

public class LivrosDeNotas_1_Test {
	public static void main(String[] args) {
		int[][] gradesArrey = {{87, 96, 70},
				{68, 87, 90},
				{94, 100, 90},
				{100, 81, 82},
				{83, 65, 85},
				{78, 87, 65},
				{85, 75, 83},
				{91, 94, 100},
				{76, 72, 84},
				{87, 93, 73}};
		LivrosDeNotas_1 meuLivrosDeNotas = new LivrosDeNotas_1(
				"CS101 Introducions to java PROGRAMMING",
				gradesArrey);
		System.out.printf("Welcome to the grade for %n%s%n%n",
				meuLivrosDeNotas.getCourseName());
		meuLivrosDeNotas.procressGrade();
	}// fim do método principal

}
