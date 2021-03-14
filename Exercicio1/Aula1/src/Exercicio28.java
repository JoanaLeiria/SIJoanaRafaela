import java.util.Random;

public class Exercicio28
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		
		int [] a = new int[6];
		
		for( int i = 0; i < a.length; i++)
		{
			a[i] = 10 + rand.nextInt(11);  // vai de 10 a 20
			System.out.println(a[i]);
		}
		
	}

}
