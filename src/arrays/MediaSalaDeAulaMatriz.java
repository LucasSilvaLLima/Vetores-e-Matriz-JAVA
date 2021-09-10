/**
 * PROGRAMA QUE RECEBE QUANOTS ALUNOS TEM EM UMA SALA DE AULA,
 * QUANTAS NOTAS PARA CADA ALUNO, EXIBE AS NOTAS E CALCULA A MÉDIA DA SALA
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MediaSalaDeAulaMatriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos tem na classe: ");
		int alunos = entrada.nextInt();
		System.out.print("Quantas notas: ");
		int qtdeNotas = entrada.nextInt();
		
		double[][] notas = new double[alunos][qtdeNotas];
		double total = 0;
		for (int a = 0; a < notas.length; a++) {
			for (int n = 0; n < notas[a].length; n++) {
			System.out.printf("Digite a %d° nota do %d° aluno: ",n+1,a+1);	
			notas[a][n] = entrada.nextDouble();
			total += notas[a][n];
			}
		}

		double media = total / (alunos * qtdeNotas);
		
		for (double[] notasDosAlunos : notas) {
			System.out.println("Notas: " + Arrays.toString(notasDosAlunos));
		}
		
		System.out.println("Média da sala: " + media);
		
		entrada.close();
	}
}
