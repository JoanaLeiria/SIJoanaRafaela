import java.util.Scanner;

public class Exercicio9
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Idade do cliente: ");
		int idade = sc.nextInt();
		
		System.out.println("ID do cliente: ");
		int id = sc.nextInt();
		
		System.out.printf("Período de utilização: \n");
		String p = sc.next();
				
		if ( idade > 16 && ( id > 1000 && id <= 2000 ) && ( p.equals("noite")==true || p.equals("happyHour")==true ))
		{
			System.out.println("O cliente tem acesso à net.");
		}
		else { System.out.println("O clente não tem acesso à net."); }
		
		
	}
	
}
