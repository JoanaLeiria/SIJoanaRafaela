
public class firstprogram {

		public static void main(String[]args)
		{
				System.out.print("Hello, 2+3=");
				System.out.println(2+3);
				System.out.println("Goodbye");
				
				float saldo;
				float ganho;
				float taxa;
				
				saldo = 1000;
				taxa = (float) 0.09;
				ganho = saldo * taxa;
				
				System.out.println("\nSaldo:" + saldo);
				System.out.println("Taxa:" + taxa);
				System.out.println("Ganho:" + ganho);
				
		}
}
