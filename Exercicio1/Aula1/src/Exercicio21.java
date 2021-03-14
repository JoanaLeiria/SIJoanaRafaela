import java.util.Scanner;

public class Exercicio21
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double n = 0; 
		double s = 0;  // soma
		int i = 0;  // contar para fazer media
		
		while ( n >= 0 )
		{
			System.out.println("n: ");
			n = sc.nextDouble();
			s = s + n;
			i++;
		}
		
		System.out.printf("Soma de todos os valores inseridos: %.2f ", s);
		System.out.printf("%nMedia da soma de valores: %.2f ", s / i);		
	}

}
