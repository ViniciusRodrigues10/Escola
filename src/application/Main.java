package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student estud = new Student();
		
		System.out.println("Informe o nome do aluno: ");
		estud.nome = sc.nextLine();
		System.out.println("Informe as três notas do aluno : ");
		estud.nota1 = sc.nextFloat();
		estud.nota2 = sc.nextFloat();
		estud.nota3 = sc.nextFloat();
		
		estud.calcularNota();
		System.out.println(estud.toString());
		
		sc.close();

	}

}
