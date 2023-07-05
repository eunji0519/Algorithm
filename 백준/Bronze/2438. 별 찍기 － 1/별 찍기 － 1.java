import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 int N = Integer.parseInt(br.readLine());
		 
		 br.close();
		 
		 if ((N >= 1) && (N <= 100)) {
			 for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			 }
		 } else {
			 System.out.println("입력범위를 벗어났습니다");
		 }
	}
}