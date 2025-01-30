package ordenacao;

public class QuickSort{
	//MÉTODO AUXILIAR QUE TROCA ELEMENTOS
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	//MÉTODO DE PARTICIONAMENTO
	private static int partition(int[] array, int low, int high) {
		
		int pivot = array[high];//ESCOLHE ÚLTIMO ELEMENTO COMO PIVÕ
		int i = low-1;//ÍNDICE PARA ELEMENTOS MENORES QUE I PIVÔ
		
		//REORGANIZA OS ELEMENTOS EM VOLTA DO PIVÔ
		for(int j=low;j<high;j++) {
			if(array[j] < pivot) {
				i++;//SE ELEMENTO FOR MENOR QUE PIVOT INCREMENTA LISTA DOS MENORES
				swap(array,i,j);//TROCA ELEMENTO ATUAL PELO DE INDICE I
			}
		}
		//COLOCA PIVÔ NO LUGAR CORRETO
		swap(array,i+1,high);
		return i+1;//RETORNA INDÍCE DO PIVÔ	
	}
	public static void quickSort(int[] array,int low, int high) {
		if(low<high) {//CONDIÇÃO PARA CONTINUAR A DIVISÃO
			// Particiona o array e obtém a posição do pivô
			int pivotIndex = partition(array,low,high);
			
			//Ordena recursicamente os elementos á esquerda e á direita do pivô
			quickSort(array, low, pivotIndex-1);//sublista á esquerda (menores)
			quickSort(array, pivotIndex+1, high);//sublista á direita (maiores)
		}
	}

	public static void main(String[] args) {
		int[] array = {5, 2, 8, 3, 1, 9, 6, 4};
		
		System.out.println("Array original:");
		for (int num : array) 
            System.out.print(num + " ");    

        // Chama o método Quick Sort
        quickSort(array, 0, array.length - 1);

        System.out.println("\n\nArray ordenado:");
        for (int num : array)
            System.out.print(num + " ");
	}
}

