import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N, M;

		N = sc.nextInt();
		M = sc.nextInt();

		sc.close();

		System.out.println(Math.abs(N - M));
	}
}