package recursão;

public class FatorialComCauda {
	 public static int fatorial(int n, int resultado) {
	        if (n == 0) {
	            return resultado;
	        }
	        return fatorial(n - 1, n * resultado);  // chamada recursiva com cauda
	    }//Aqui, fatorial(n - 1, n * resultado) é a última operação, ou seja, a chamada recursiva está na cauda da função.IN

	    public static void main(String[] args) {
	        int n = 5;
	        int resultado = fatorial(n, 1);
	        System.out.println("Fatorial de " + n + " é " + resultado);
	    }
	}

