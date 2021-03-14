import java.util.Scanner;

public class Testes
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		/* 
		int a = 5;
		int b = 2;
		
		//System.out.print(a/b);
		
		double [] notas;
		
		notas = new double [5];
		notas[0] = 1;
		notas[1] = 2;
		notas[2] = 3;
		notas[3] = 4;
		notas[4] = 5;
		
		System.out.println(notas[1]);
		
		int[] array1 = {1,2,3};
		System.out.println(array1[0]);
		
		
		boolean acabar_jogo = false;
		String yy = sc.next();
		sc.nextLine(); 
						
		if (yy.equals("Y") || yy.equals("y"))
		{
			acabar_jogo = true;
		}
		
		if (acabar_jogo) 
		{System.out.println("Jogo terminado.");}
		
		int a = 9;
		int b = 2;
		
		System.out.print(a%b);
		
		*/ 
		
		int a;
		boolean b = true;
		
		while(b)
		{
			System.out.println("a :");
			if ( sc.hasNextInt())
			{
				a = sc.nextInt();
				sc.nextLine();
				if ( a < 3 || a > 10 )
				{
					System.out.println("Mal");
					b = true;
				}
				else
				{
					System.out.println("top");
					b = false;
				}
			}
			else 
			{
				sc.nextLine();
				b = true;
			}
		}
		
	}

}


