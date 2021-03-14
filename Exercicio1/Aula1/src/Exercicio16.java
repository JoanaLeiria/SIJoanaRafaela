import java.util.Scanner;

public class Exercicio16
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int v1, v2, v3;
		double d1, d2;
		String s;
		boolean b1, b2, b3, b4, b5;
		b1 = b2 = b3 = b4 = b5 = false;  // vamos usar os booleans para verificar as condicoes de input
		boolean a, b, c;
		a = b = c = false; // regras
		
		// variaveis a usar na verificacao das regras
		int m = 0; // media dos 3 ints
		int s1 = 0;
		double s2 = 0;
		
		// Pedir variaveis
		
		System.out.println("Introduz 1º inteiro: ");
		b1 = sc.hasNextInt();  // return de true ou false
		
		if (b1)  // se v1 for inteiro, avancamos
		{
			v1 = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Introduza 2º inteiro: ");
			b2 = sc.hasNextInt();
			
			if (b2)
			{
				v2 = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Introduza 3º inteiro: ");
				b3 = sc.hasNextInt();
				
				if (b3)
				{
					v3 = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Introduza 1º double: ");
					b4 = sc.hasNextDouble();
					
					if(b4)
					{
						d1 = sc.nextDouble();
						sc.nextLine();
						
						System.out.println("Introduza 2º double: ");
						b5 = sc.hasNextDouble();
						
						if (b5)
						{
							d2 = sc.nextDouble();
							sc.nextLine();
							
							System.out.println("Introduza a string: "); 
							// nao precisamos de verificar se e string, porque e sempre
							
							s = sc.next();
							
							// se chegamos aqui, as variaveis sao do type certo
							// vamos agora verificar as regras
							
							m= (v1 + v2 + v3)/3;
							a = ( (v1 + v2)>m || (v1 + v3)>m || (v2 + v3)>m );
							
							b = ( s.equals("UC") && ( d1 > 1000 || d2 > 1000));
							
							s1 = v1 + v2 + v3;
							s2 = d1 + d2;
							
							c = ( s1%2 == 0 && s2%2!=0 );
							
						}
					}
				}
			}
		}
		
		if ( (b1 && b2 && b3 && b4 && b5) == false)
		{
			System.out.println("Variavel(eis) incorreta(s)");
		}
		
		else
		{
			if (a || b || c)
				if (a)
				{
					System.out.println("A regra a verifica-se");
				}
				if (b)
				{
					System.out.println("A regra b verifica-se");
				}
				if (c)
				{
					System.out.println("A regra c verifica-se");
				}
			else
			{
				System.out.println("Nenhuma das regras se cumpre.");
			}
		}
		
	}

}
