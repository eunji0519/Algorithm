import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		sc.close();
		
		if (A < B) {
			System.out.println("<");
		} else if (A > B) {
			System.out.println(">");
		} else if (A == B) {
			System.out.println("==");
		}
		
	}
}