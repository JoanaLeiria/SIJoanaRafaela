import java.util.Scanner;

public class Exercicio14
{
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		int i = 0; // para contar quantos iguais há
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduz double a: ");
		
		if (sc.hasNextDouble())
		{
			a = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("Introduza double b: ");
			if (sc.hasNextDouble())
			{
				b = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("Introduza double c: ");
				if (sc.hasNextDouble())
				{
					c = sc.nextDouble();
					sc.nextLine();

				}
				else
				{
					System.out.print("Os numeros introduzidos teem de ser double");
				}
			}
			else
			{
				System.out.print("Os numeros introduzidos teem de ser double");
			}
		}
		else
		{
			System.out.println("Os numeros introduzidos teem de ser double");
		}
		
		System.out.println(a);  // não assume a como atribuído 
		/*    ????????????
		
		if ( a == b)
		{
			i++;
		}
		if ( a == c )
		{
			i++;
		}
		if ( b == c )
		{
			i++;
		}
		
		System.out.printf("Há %d valores iguais.", i);
		
		*/
	}
		
	}

