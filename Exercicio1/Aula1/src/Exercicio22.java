import java.util.Scanner;

public class Exercicio22
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("min: ");
		int min = sc.nextInt();
		
		System.out.println("max: ");
		int max = sc.nextInt();
		
		int n; // inteiros a serem inseridos
		int s = 0;  // soma dos n entre min e max
		int c = 0;  // contar apenas os n entre min e max
		
		// verificacao 
		
		if ( min < max )
		{
			System.out.println("N :");
			int N = sc.nextInt();
			
			for ( int i = 0; i < N; i++ )
			{
				System.out.println("valor: ");
				n = sc.nextInt();
				
				if ( n > min && n < max )
				{
					s = s + n;
					c++;
				}
			}
			
			System.out.printf("Media: %d", s / c);
			
		}
		else
		{
			System.out.println("min não pode ser igual ou superior a max.");
		}
	}

}
