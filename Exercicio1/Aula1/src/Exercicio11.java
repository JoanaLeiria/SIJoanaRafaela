import java.util.Scanner;

public class Exercicio11
{
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pagamento: Visa, Mastercard, Multibanco, ou Dinheiro?");
		String pagamento = sc.next();
		
		// verifica��o de string
		
		if( pagamento.equals("Visa") || pagamento.equals("Mastercard") || pagamento.equals("Multibanco") || pagamento.equals("Dinheiro")) {
		}
		else {
			System.out.println("Introduza um m�todo de pagamento v�lido");
			pagamento = sc.next();
		}
		
		System.out.println("Introduza o valor a pagar em euros: ");
		double v = sc.nextDouble();
		
		// Convers�o para dollar
		
		double d = v*1.189;
		
		System.out.println("Pagamento de " + v +  " euros efectuado com " + pagamento + "\nPayment of " + d + " dollars with " + pagamento);
		// COMO LIMITAR AS CASAS DECIMAIS ??
	}

}
