import java.util.Scanner;

public class Exercicio12
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Pedir a identifica��o do doente
		
		System.out.println("Nome: ");
		String nome = sc.next();
		
		System.out.println("Idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Toma medicamentos? ");
		String medicamentos = sc.next();
		
		System.out.println("Tempo de espera em minutos: ");
		int tempo = sc.nextInt();
		
		// Ver se o paciente � priorit�rio
		
		boolean prioridade;
		
		if ( ( idade > 65 || idade < 10 ) && ( medicamentos.equals("sim") || medicamentos.equals("Sim") ) && tempo > 30 )
		{
			prioridade = true;
		}
		
		else
		{
			prioridade = false;
		}
		
		System.out.println("Atendimento Priorit�rio Paciente [" + nome + "] = " + prioridade);

	}

}
