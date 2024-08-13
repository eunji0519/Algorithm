import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		if (0<=n&&n<=12) {
			sc.close();
			
			long result = 1;
			
			for(int i=1;i <=n;i++)result*=i;
			System.out.println(result);
			
		} else {
			System.out.println("입력값을 벗어났습니다.");
		}
	}
}