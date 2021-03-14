import java.util.Scanner;

public class Exercicio17
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// Momento inicial + verificacao
		
		System.out.println("Hora de inicio: ");
		int h_i = sc.nextInt();
		
		while ( h_i > 24 || h_i < 0 )
		{
			System.out.println("Introduza uma hora valida: ");
			h_i = sc.nextInt();
		}
		
		System.out.println("Minuto de inicio: ");
		int m_i = sc.nextInt();
		
		while ( m_i > 59 || m_i < 0 )
		{
			System.out.println("Introduza um minuto valido: ");
			m_i = sc.nextInt();
		}
		
		
		// Tempo maximo de funcionamento + verificacao
		
		System.out.println("Tempo maximo: ");
		int h_m = sc.nextInt();
		
		while ( h_m < 0 )
		{
			System.out.println("Introduza uma hora valida: ");
			h_m = sc.nextInt();
		}
		
		System.out.println("Minuto maximo: ");
		int m_m = sc.nextInt();
		
		while ( m_m > 59 || m_m < 0 )
		{
			System.out.println("Introduza um minuto valido: ");
			m_m = sc.nextInt();
		}
		
		
		// Restricao
		
		int h_max = 48;
		
		
		// Determinacao do momento final maximo
		
		int h_f;
		int m_f;
		
		if ( h_m < h_max ) 
		{		
			if ( (m_i + m_m) >= 60 )
			{
				h_f = ( h_m + h_i ) % 24 + 1;
				m_f = m_i + m_m - 60;
			}
			else
			{
				h_f = ( h_m + h_i )%24;
				m_f = m_i + m_m;
			}
		}	
		else 
		{
			h_f = ( h_i + h_max ) % 24;
			m_f = m_i;
		}
		System.out.printf("Desligar maquina, no maximo, as %d horas e %d minutos", h_f, m_f);
	}
}
