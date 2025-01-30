package ordenacao;

import java.util.Arrays;

public class MergeSort {
	public static void mergeSort(int[] array) {
		
		if(array.length<2) 
			return;
		
		int mid = array.length/2;
		int[] left = Arrays.copyOfRange(array,0, mid);
		int[] right =  Arrays.copyOfRange(array,mid, array.length);
		
		//Ordenar cada metade
		mergeSort(left);
		mergeSort(right);
		
		merge(array,left,right);
	}
	
	//função que mescla dois arrays ordenados
	private static void merge(int[] array,int[] left,int[] right) {
		int i=0,j=0,k=0;
		
		while(i<left.length && j<right.length) {
			if(left[i]<=right[j]) 
				array[k++] = left[i++];
			else 
				array[k++] = right[j++];
			
		}
		// Copiar os elementos restantes de left (se houver)
		while(i<left.length) 
			array[k++] = left[i++];
		
		 // Copiar os elementos restantes de right (se houver)
		 while (j < right.length) 
	            array[k++] = right[j++];
	     
	}
	
	public static void main(String[] args) {
		int[] array = {38,27,43,3,9,82,10};
		
		System.out.println("Array original: "+Arrays.toString(array));
		
		mergeSort(array);
		
		System.out.println("Array ordenado: "+Arrays.toString(array));
	}
}
