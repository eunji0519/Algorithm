import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N;

		N = sc.nextInt();

		sc.close();

		for(long i=1; i<=N; i++) {			
			System.out.println(i);
		}
	}
}