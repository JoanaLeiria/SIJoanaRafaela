import java.util.Scanner;

public class Exercicio23
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduz inteiro: ");
		int n = sc.nextInt();
		
		int n1 = n;
		
		int s = 0;  // soma 
		
		while ( n != 0 )
		{
			s = s + n % 10;
			n = n / 10;
		}
		
		System.out.printf("soma dos algarismos de %d = %d", n1 , s);
	}

}
