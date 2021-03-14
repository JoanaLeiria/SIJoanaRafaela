
public class Exercicio4
{
	public static void main(String[] args) {
		
		final float nota1 = (float) 15.6;  // teste 1 
		final float nota2 = (float) 11.5;  // teste 2
		final float nota3 = (float) 18.0;  // teste 3
		
		final float PL1 = (float) 0.95;  
		final float PL2 = (float) 0.78;
		
		final float TF = 17.9f;  // Trabalho Final 
		
		final float nota = (float) ( ( nota1 + nota2 + nota3 ) / 3 ) * 0.5f + ( PL1 + PL2 ) * 0.5f * 0.25f + TF * 0.25f;
			
		System.out.println(Math.round(nota));

	}
}
