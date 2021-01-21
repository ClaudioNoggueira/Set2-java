package application;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Set<Integer> qtdStudents = new HashSet<>();
		
		try {			
			System.out.print("Quantidade de alunos para o curso A: ");
			int n = input.nextInt();
			for (int i = 1; i <= n; i++) {
				System.out.print("Código do " + i + "º aluno: ");
				qtdStudents.add(input.nextInt());
			}

			System.out.print("\nQuantidade de alunos para o curso B: ");
			n = input.nextInt();
			for (int i = 1; i <= n; i++) {
				System.out.print("Código do " + i + "º aluno: ");
				qtdStudents.add(input.nextInt());
			}

			System.out.print("\nQuantidade de alunos para o curso C: ");
			n = input.nextInt();
			for (int i = 1; i <= n; i++) {
				System.out.print("Código do " + i + "º aluno: ");
				qtdStudents.add(input.nextInt());
			}
			
			System.out.print("\nTOTAL DE ALUNOS: " + qtdStudents.size());

		} catch (InputMismatchException e) {
			System.out.println("\nErro de formato. Foi inserido um valor inadequado para operação.");
			System.out.println("Reinicie o programa para tentar novamente.");
		} finally {
			if (input != null)
				input.close();
		}
	}
}
