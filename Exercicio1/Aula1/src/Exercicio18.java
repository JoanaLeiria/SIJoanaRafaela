import java.util.Scanner;

public class Exercicio18
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// Pedido do cliente
		
		double m;  // macas
		double p;  // peras
		
		double p_m = 0.5;  // preco normal maca
		double p_p = 0.9;  // preco normal pera
		
		double preco = 0;  // preco final
		
		System.out.println("Kg de macas: ");
		m = sc.nextDouble();
		
		System.out.println("Kg de peras: ");
		p = sc.nextDouble();
		
		// Verificacao
		
		if ( m < 0 || p < 0 )
		{
			System.out.print("Valores invalidos");
		}
		
		else 
		{
			if ( m < 3 || p < 2) // a preco normal
			{
				preco = m * p_m + p * p_p;
			}
			else 
			{
				// com desconto
				preco = 3 * p_m + 2 * p_p + ( ( m - 3 ) * p_m + ( p - 2 ) * p_p  ) * 0.15;
				
				if ( preco >= 20 && preco < 50 )
				{
					preco = preco * 0.95;
				}
				else if ( preco >= 50 && preco < 100 )
				{
					preco = preco * 0.9;
				}
				else if ( preco >= 100 )
				{
					preco = preco * 0.97;
				}
			}
		
			System.out.printf("O preco final é %.2f €. ", preco);
		
		}
	}

}
