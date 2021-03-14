import java.util.Scanner;

public class Exercicio19
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// Pedir X e Y
		
		int X, Y;
		
		System.out.println("X: ");
		X = sc.nextInt();
		
		System.out.println("Y: ");
		Y = sc.nextInt();
		
		for ( int i = X; i <= Y; i++ )
		{
			if ( i%2 != 0 )
			{
				System.out.println(i);
			}
		}
		sc.close();
	}

}
