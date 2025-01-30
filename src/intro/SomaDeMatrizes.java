package intro;

public class SomaDeMatrizes {

	public static void main(String[] args) {
		
		int linhas = 10;
		int colunas = 12;
		int[][] matriz =new int[linhas][colunas];
		
		int sum = 0;
		
		for(int i=0;i < linhas;i++) {
			for(int j=0;j < colunas;j++) {
				matriz[i][j] = i*2;
				sum +=matriz[i][j];
				System.out.println(matriz[i][j]+ " ");
			}
			System.out.println("");
			
		}
		System.out.println("soma - > "+sum);
	}

}
