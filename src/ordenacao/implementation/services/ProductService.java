package ordenacao.implementation.services;

import java.util.Arrays;
import java.util.List;

import ordenacao.implementation.entities.Product;
//CLASSE EM QUE USO COMO EXEMPLO DE USO REAL DE ORDENAÇÕES
public class ProductService {
	//função para ordenar produtos em QuickSort por preco
	public List<Product> ordenarPorPreco(List<Product> produtos){
		Product[] produtoArray = produtos.toArray(new Product[0]);
		quickSort(produtoArray, 0, produtoArray.length - 1);
		return Arrays.asList(produtoArray);
	}

private void quickSort(Product[] produtos, int low, int high) {
    if (low < high) {
        int pivotIndex = partition(produtos, low, high);
        quickSort(produtos, low, pivotIndex - 1);
        quickSort(produtos, pivotIndex + 1, high);
    }
}

private int partition(Product[] products,int low, int high) {
	Product pivot = products[high];
	int i = (low - 1);
	for(int j=low;j<high;j++) {
		if(products[j].getPreco() <= pivot.getPreco()) {
			i++;
			Product temp = products[i];
			products[i] = products[j];
			products[j] = temp;
		}
	}
	Product temp = products[i+1];
	products[i+1] = products[high];
	products[high] = temp;
	return i+1;
	}
}
