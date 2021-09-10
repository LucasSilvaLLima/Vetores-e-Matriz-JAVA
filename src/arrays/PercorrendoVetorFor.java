/**
	PROGRAMA QUE RECEBE AS NOTAS DE UM ALUNO AS ARMAZENA EM UM VETOR E CALCULA A MÉDIA. 
	PERCORRENDO O VETOR COM UM FOR
 */
package arrays;

import java.util.Arrays;

public class PercorrendoVetorFor {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		
		System.out.println(Arrays.toString(notasAlunoA));//IMPRIMINDO O VETOR ZERADO AO USUARIO

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 7.8;
		notasAlunoA[3] = 7.8;
		
		System.out.println(Arrays.toString(notasAlunoA));//IMPRIMINDO O VETOR COM AS NOTAS SETADAS
		double mediaAlunoA = 0;
		
		for(int i = 0; i < notasAlunoA.length; i++) {
			mediaAlunoA += notasAlunoA[i];
		}
		
		System.out.println("\nMédia do AlunoA é: " + mediaAlunoA/notasAlunoA.length );
		
		double[] notaAlunoB = {5.9,10,7.5,8.3};
		 
		System.out.println(Arrays.toString(notaAlunoB)); //IMPRIMINDO O VETOR ZERADO AO USUARIO
		
		double totalAlunoB = 0;
		
		for (int i = 0; i < notaAlunoB.length; i++) {
			totalAlunoB += notaAlunoB[i];
		}
		System.out.println("\nMédia do AlunoB é: " + totalAlunoB/notaAlunoB.length);
	}
}
