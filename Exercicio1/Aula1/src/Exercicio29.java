
public class Exercicio29
{
	public static void main(String[] args)
	{
		int[][] matriz = {{1,2,3},{4,5,6}}; // 2 linhas e 3 colunas
		
		for ( int i = 0; i < matriz.length; i++ )
		{
			for ( int j = 0; j < matriz[0].length; j++)
			{
				// System.out.print(matriz[i][j]);
				System.out.printf("Ao elemento da linha %d e coluna %d corresponde o valor %d \n",i,j,matriz[i][j]);
			}
		}
		
	}

}
