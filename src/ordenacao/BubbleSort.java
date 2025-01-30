package ordenacao;

public class BubbleSort {
	
	public static void bubble(int[] vect) {
        
		int n = vect.length;
        int aux;

        for (int i = 0; i < n - 1; i++) { // O loop externo percorre os elementos.
            for (int j = 0; j < n - 1 - i; j++) { // O loop interno faz as comparações.
                if (vect[j] > vect[j + 1]) { // Compare o elemento atual com o próximo.
                    aux = vect[j]; // Troca os elementos se estiverem fora de ordem.
                    vect[j] = vect[j + 1];
                    vect[j + 1] = aux;
                }
            }
        }
		for(int x:vect) {
			System.out.println(x);
		}
    }

	public static void main(String[] args) {
		int[] vect = {5,2,8,3,1,9,6,4};
		bubble(vect);
		
	}

}
