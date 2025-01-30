package intro;

import java.util.Scanner;

public class SomaDeVetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vect = new int[100];
		int sum = 0;
		for(int i=0;i<vect.length;i++) {
			vect[i] = i*2;
			sum+=vect[i];
		}
		System.out.println("SOMA DO VETOR -> "+sum);
		
		System.out.println("Deseja ver todos os valores do vetor, se sim escreva 1 e se não pressiona qualquer outra tecla");
		int op = sc.nextInt();
		
		if(op == 1) {
			for(int x:vect) 
				System.out.println(x);	
			System.out.println("programa finalizado");
		}else {
			System.out.println("programa finalizado");
		}
		
		sc.close();

	}

}
