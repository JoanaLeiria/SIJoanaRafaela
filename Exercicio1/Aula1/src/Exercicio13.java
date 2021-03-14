import java.util.Scanner;

public class Exercicio13
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduza um número: ");
		int n = sc.nextInt();
		
		if( n < 100 ) {; System.out.println(n + " é menor que 1000"); }
		else if (n == 1000) {; System.out.println(n + " é igual a 1000");}
		else {; System.out.println(n + " é maior que 1000"); }
	}
}
