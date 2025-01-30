package recursão;

public class InverterString {
	public static String inverter(String s) {
		if(s.isEmpty()) return s;// Caso base
		return inverter(s.substring(1))+s.charAt(0);
	}
	public static void main(String[] args) {
		System.out.println(inverter("Java"));
	}
}
