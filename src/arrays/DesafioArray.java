/**
	DESAFIO ARRAY 
	PROGRAMA EM QUE O ALUNO INSERE SUAS NOTAS, O PROGRAMA AS ARMAZENA EM UM VETOR
	PERCORRE O VETOR E CALCULA A MÉDIA, MOSTRA A NOTAS INSERIDAS E A MÉDIA DO ALUNO
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas voce vai inserir ? ");
		int numNotas = entrada.nextInt();
		
		double notas[] = new double[numNotas];
		
		for (int i = 0; i < numNotas; i++) {
			System.out.printf("Digite a %d° nota: ", (i+1));
			notas[i] = entrada.nextDouble();
		}
		double total = 0;
		for (double d : notas) {
			total += d;
		}
		double media = total/numNotas;
		
		System.out.println("As suas notas: " + Arrays.toString(notas));
		System.out.println("A sua média é " + media);
		
		entrada.close();
	}
	
	}