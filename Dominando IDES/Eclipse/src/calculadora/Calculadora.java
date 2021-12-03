package calculadora;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro n�mero: ");
		float n1 = sc.nextInt();
		System.out.println("Digite o valor do segundo n�mero: ");
		float n2 = sc.nextInt();
		System.out.println("");
		
		System.out.println("SOMA: "+ somar(n1, n2));
		System.out.println("SUBTRA��O: "+ subtrair(n1, n2));
		System.out.println("MULTIPLICA��O: "+ multiplicar(n1, n2));
		System.out.println("DIVIS�O: "+ dividir(n1, n2));
		
		sc.close();
	}
	
	public static float somar(float a, float b) {
		return a + b;
	}
	
	public static float subtrair(float a, float b) {
		return a - b;
	}
	
	public static float multiplicar(float a, float b) {
		return a * b;
	}
	
	public static float dividir(float a, float b) {
		return a / b;
	}
}
