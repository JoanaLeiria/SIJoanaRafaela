import java.util.Scanner;


public class Exercicio8
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecione uma hora: ");
		float hora = sc.nextFloat();
		
		if ( hora < 0 || hora > 24 )
		{
			System.out.println("Selecione uma hora válida: ");
			hora = sc.nextFloat();
		}
		
		
		if ( (hora <= 7 && hora >= 0 ) || (hora >= 22 && hora <= 24) )
		{
			System.out.println("Perry, cala-te.");
		}
		
		else { System.out.println("O Perry pode falar"); }
	}

}
