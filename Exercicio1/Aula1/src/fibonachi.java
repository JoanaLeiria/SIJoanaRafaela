
public class fibonachi
{
	
	public static void main(String[] args) {
		
		long a = 0;  // usamos long em vez de int porque no final da sequência os valores são muito grande, já não é possível escrevê-los só com int
		long b = 1;
		long c;
		System.out.println(a);
		System.out.println(b);
		
		for(int i = 2; i<50; i++)  
		{
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
			
		}
		
		// pelo ciclo while
		
		int n = 2;
		long d = 0;
		long e = 1;
		long f;
		System.out.println(d);
		System.out.println(e);
		
		while (n<50)
		{
			f = d + e;
			System.out.println(f);
			d = e;
			e = f;
			n++;
		}

		
	}
}
