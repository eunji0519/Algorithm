import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		int n = Integer.parseInt(s);
		br.close();

		int i, sum = 0;
		
		if (n >= 1 && n <= 10000) {
			for (i = 1; i <= n; i++) {
				sum += i;
			}
		} else {
			System.out.println("n의 범위 입력이 잘못되었습니다.");
		}
		System.out.println(sum);
	}
}