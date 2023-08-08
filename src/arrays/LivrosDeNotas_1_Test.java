package arrays;

public class LivrosDeNotas_1_Test {
	public static void main(String[] args) {
		int[][] gradesArray = {{87, 96, 70},
				{68, 87, 90},
				{94, 100, 90},
				{100, 81, 82},
				{83, 65, 85},
				{78, 87, 65},
				{85, 75, 83},
				{91, 94, 100},
				{87, 93, 73},
				{76, 72, 84}};
		LivrosDeNotas_1 myLivrosDeNotas_1_Test = new LivrosDeNotas_1(
				"CS101 Introduction to Java programing", gradesArray);
		
		System.out.printf("Welcome to the grade book for%n%s%n%n", myLivrosDeNotas_1_Test.getCourseName());
		
		myLivrosDeNotas_1_Test.procressGrade();
		
	}// fim da classe principal

}
