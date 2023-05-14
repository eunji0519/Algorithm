import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, B1, B10, B100;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		B1 = B%10;
		B10 = B%100/10;
		B100 = B%1000/100;
		
		System.out.println(A*B1);
		System.out.println(A*B10);
		System.out.println(A*B100);
		System.out.println(A*B);
		
	}
}
