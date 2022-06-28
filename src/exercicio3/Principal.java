package exercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Trabalhador trabalhador1 = new Trabalhador();
		Trabalhador trabalhador2 = new Trabalhador();
		Trabalhador trabalhador3 = new Trabalhador();
		Trabalhador trabalhador4 = new Trabalhador();
		Trabalhador trabalhador5 = new Trabalhador();
		
		System.out.println("Trabalhador1");
		System.out.print("Digite o nome:");
		String nome = sc.nextLine();
		trabalhador1.setNome(nome);
		System.out.println("Valor por hora: ");
		double salarioPorHora = sc.nextDouble();
		trabalhador1.setSalarioPorHora(salarioPorHora);
		System.out.println("Horas trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();
		trabalhador1.setHoraTrabalhada(horasTrabalhadas);

		trabalhador1.calcularSalario(salarioPorHora, horasTrabalhadas);
		
		
		System.out.println();
		System.out.println("Trabalhador2");
		System.out.print("Digite o nome:");
		sc.nextLine();
		String nome2 = sc.nextLine();
		trabalhador2.setNome(nome2);
		System.out.println("Valor por hora: ");
		double salarioPorHora2 = sc.nextDouble();
		trabalhador2.setSalarioPorHora(salarioPorHora2);
		System.out.println("Horas trabalhadas: ");
		int horasTrabalhadas2 = sc.nextInt();
		trabalhador2.setHoraTrabalhada(horasTrabalhadas2);

		trabalhador2.calcularSalario(salarioPorHora, horasTrabalhadas);
	
		System.out.println();
		System.out.println("Trabalhador3");
		System.out.print("Digite o nome:");
		sc.nextLine();
		String nome3 = sc.nextLine();
		trabalhador3.setNome(nome3);
		System.out.println("Valor por hora: ");
		double salarioPorHora3 = sc.nextDouble();
		trabalhador3.setSalarioPorHora(salarioPorHora3);
		System.out.println("Horas trabalhadas: ");
		int horasTrabalhadas3 = sc.nextInt();
		trabalhador3.setHoraTrabalhada(horasTrabalhadas3);

		trabalhador3.calcularSalario(salarioPorHora, horasTrabalhadas);
		
		System.out.println();
		System.out.println("Trabalhador4");
		System.out.print("Digite o nome:");
		sc.nextLine();
		String nome4 = sc.nextLine();
		trabalhador4.setNome(nome4);
		System.out.println("Valor por hora: ");
		double salarioPorHora4 = sc.nextDouble();
		trabalhador4.setSalarioPorHora(salarioPorHora4);
		System.out.println("Horas trabalhadas: ");
		int horasTrabalhadas4 = sc.nextInt();
		trabalhador4.setHoraTrabalhada(horasTrabalhadas4);

		trabalhador4.calcularSalario(salarioPorHora, horasTrabalhadas);
		
		System.out.println();
		System.out.println("Trabalhador5");
		System.out.print("Digite o nome:");
		sc.nextLine();
		String nome5 = sc.nextLine();
		trabalhador5.setNome(nome5);
		System.out.println("Valor por hora: ");
		double salarioPorHora5 = sc.nextDouble();
		trabalhador5.setSalarioPorHora(salarioPorHora5);
		System.out.println("Horas trabalhadas: ");
		int horasTrabalhadas5 = sc.nextInt();
		trabalhador5.setHoraTrabalhada(horasTrabalhadas5);

		trabalhador5.calcularSalario(salarioPorHora, horasTrabalhadas);

		
		sc.close();
	}
}
