import java.util.Scanner;

public class Exercicio20
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int X, Y;
		
		System.out.println("X: ");
		X = sc.nextInt();
		
		System.out.println("Y: ");
		Y = sc.nextInt();
		
		int i = X;
		while ( i <= Y )
		{
			if ( i % 2 != 0 )
			{
				System.out.println(i);
			}
			i++;
		}
		sc.close();
		
	}

}
