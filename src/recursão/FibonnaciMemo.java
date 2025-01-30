package recursão;

import java.util.HashMap;

public class FibonnaciMemo {
	private static HashMap<Integer,Integer> cache = new HashMap<>();
	
	//APLICAÇÃO COM CACHE PARA ARMAZENAR RESULTADOS JÁ CALCULADOS -- solução muito mais rápida
	public static int fibonnaci(int n) {
		
		if(n<=1) return n;
		if(cache.containsKey(n)) return cache.get(n);
		
		int resultado = fibonnaci(n-1)+(n-2);
		cache.put(n, resultado);
		
		return resultado;
	}
	public static void main(String[] args) {
		System.out.println(fibonnaci(50));
	}
}
