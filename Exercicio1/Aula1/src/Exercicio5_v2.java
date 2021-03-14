import java.util.Scanner;
import java.util.Vector;


public class Exercicio5_v2
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		final int n = 9;  // tamanho do vetor
		int NIF[] = new int[n];  // declara��o do vetor NIF
		int i;  
		int a = 0;  // para verificar se � v�lido 
		
		for ( i=0; i<n; i++ )
		{
			System.out.printf("%do. digito: ", i+1);
			NIF[i] = sc.nextInt();  // adicionar valores ao NIF
			a = a + NIF[i] * (n-i); 
		}
			
		
		if ( a % 11 == 0 )
		{
			System.out.printf("O NIF %d � v�lido", NIF);  
		}
		else
		{
			System.out.printf("O NIF %d � inv�lido", NIF);
		}
		
	}
}
