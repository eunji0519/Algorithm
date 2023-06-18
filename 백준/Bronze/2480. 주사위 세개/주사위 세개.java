import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

//		같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		br.close();
		
		if ((a > 0 && a < 7) && (b > 0 && b < 7) && (c > 0 && c < 7)) {
//			같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
			if ((a == b) && (b == c)) {
				int num1 = 10000 + (a * 1000);
				System.out.println(num1);
			} else if ((a == b) || (b == c) || (c == a)) {
				if(a==b) {
					int num2 = 1000 + a * 100;
					System.out.println(num2);
				}
				if(b==c) {
					int num2 = 1000 + b * 100;
					System.out.println(num2);
				}
				if(c==a) {
					int num2 = 1000 + a * 100;
					System.out.println(num2);
				}
			} else {
//			모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
				int num3 = a > b ? a : b;
				num3 = num3 > c ? num3 : c;
				num3 *= 100;
				System.out.println(num3);
			}
		} else {
			System.out.println("입력범위를 벗어났습니다.");
		}

	}
}