import java.util.Scanner;
public class Exercicio5
{		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1o digito: ");
		int d1 = scan.nextInt();
		System.out.println("2o digito: ");
		int d2 = scan.nextInt();
		System.out.println("3o digito: ");
		int d3 = scan.nextInt();
		System.out.println("4o digito: ");
		int d4 = scan.nextInt();
		System.out.println("5o digito: ");
		int d5 = scan.nextInt();
		System.out.println("6o digito: ");
		int d6 = scan.nextInt();
		System.out.println("7o digito: ");
		int d7 = scan.nextInt();
		System.out.println("8o digito: ");
		int d8 = scan.nextInt();
		System.out.println("9o digito: ");
		int d9 = scan.nextInt();
		
		int a = d1 * 9 + d2 * 8 + d3 * 7 + d4 * 6 + d5 * 5 + d6 * 4 + d7 * 3 + d8 * 2 + d9;
		// numero que nos permite verificar se o NIF é valido
		System.out.println(a);
		
		float b = (float) a % 11;  // resto da divisao de a por 11
		System.out.println(b);
		
		if ( b == 0)
		{
			System.out.println("NIF válido");
		}
		else
		{
			System.out.println("NIF inválido");
		}
		
	}
}
