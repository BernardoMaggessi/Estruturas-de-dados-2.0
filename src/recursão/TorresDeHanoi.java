package recursão;

public class TorresDeHanoi {
	public static void moverTorres(int n,char origem, char destino, char auxiliar) {
		 if (n == 1) {
	            System.out.println("Mover disco 1 de " + origem + " para " + destino);
	            return;
	        }
	        moverTorres(n - 1, origem, auxiliar, destino);
	        System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
	        moverTorres(n - 1, auxiliar, destino, origem);
	    }
	    public static void main(String[] args) {
	        moverTorres(3, 'A', 'C', 'B');
	    }
	}