
public class Exercicio7
{
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		boolean v1 = false;
		
		if (x > 10 ) { v1 = true; }
		System.out.println("a) " + v1);
		
		if ( x > 1 && y < 15 ) { v1 = true; }
		System.out.println("b) " + v1);
		
		if ( x == 10 && y == 10 ) { v1 = true; }
		System.out.println("c) " + v1);
		
		if ( x == 10 || y == 10 ) { v1 = true; }
		System.out.println("d) " + v1);
		
		if ( x > 5 || !(y == 10 ) ) { v1 = true; }
		System.out.println("e) " + v1);
	}
}
