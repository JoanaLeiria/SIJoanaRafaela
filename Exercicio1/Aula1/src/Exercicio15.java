import java.util.Scanner;

public class Exercicio15
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double resultado;
		
		System.out.println("Introduz um valor: ");
		double v1 = sc.nextDouble();
		
		System.out.println("Introduz outro valor: ");
		double v2 = sc.nextDouble();
		
		System.out.println("Operacao: ");
		char operacao = sc.next().charAt(0);
		
		while ( operacao != '+' && operacao != '-' && operacao != '/' && operacao != '*') {
			System.out.print("Introduz uma operacao valida: ");
			operacao = sc.next().charAt(0);
		}
		
		while ( operacao == '/' && v2 == 0) {
			System.out.printf("Não é possível dividir por zero. %nIntroduz um valor para o quociente válido: ");
			v2 = sc.nextDouble();
		}
		
		if ( operacao == '+') {
			resultado = v1 + v2;
			System.out.println(resultado);		
		}
		else if ( operacao == '-' ) {
			resultado = v1 - v2;
			System.out.println(resultado);		
		}
		else if ( operacao == '/' ) {
			resultado = v1 / v2;
			System.out.println(resultado);		
		}
		else if ( operacao == '*') {
			resultado = v1 * v2;
			System.out.println(resultado);		
		}
	}

}
