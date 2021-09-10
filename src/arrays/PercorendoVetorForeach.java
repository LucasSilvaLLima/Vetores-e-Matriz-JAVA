/**
	PROGRAMA QUE RECEBE AS NOTAS DE UM ALUNO AS ARMAZENA EM UM VETOR E CALCULA A MÉDIA. 
	PERCORRENDO O VETOR COM UM FOREACH
 */
package arrays;

import java.util.Arrays;

public class PercorendoVetorForeach {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		
		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 7.8;
		notasAlunoA[3] = 7.8;
		
		System.out.println(Arrays.toString(notasAlunoA));
		double totalAlunoA = 0;
		
		for (double nota : notasAlunoA) {
			totalAlunoA += nota;
		}
		
		System.out.println(totalAlunoA/notasAlunoA.length + "\n");
		
		double[] notaAlunoB = {5.9,10,7.5,8.3};
		
		System.out.println(Arrays.toString(notaAlunoB));
		
		double totalAlunoB = 0;
		
		for (double nota : notaAlunoB) {
			totalAlunoB += nota;
		}
		System.out.println(totalAlunoB/notaAlunoB.length + "\n");
	}
}

