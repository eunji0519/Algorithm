import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		br.close();
		// 상금
		int price;
		
		if ((a > 0 && a < 7) && (b > 0 && b < 7) && (c > 0 && c < 7)) {
//			같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
			if ((a == b) && (b == c)) {
				price = 10000 + (a * 1000);
				System.out.println(price);
//				같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
			} else if ((a == b) || (b == c) || (c == a)) {
				if(a==b) {
					price = 1000 + a * 100;
					System.out.println(price);
				}
				if(b==c) {
					price = 1000 + b * 100;
					System.out.println(price);
				}
				if(c==a) {
					price = 1000 + a * 100;
					System.out.println(price);
				}
			} else {
//			모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
				price = a > b ? a : b;
				price = price > c ? price : c;
				price *= 100;
				System.out.println(price);
			}
		} else {
			System.out.println("입력범위를 벗어났습니다.");
		}

	}
}