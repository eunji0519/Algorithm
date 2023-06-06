import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

		int score;
		score = sc.nextInt();
        
		sc.close();

		if (0 <= score && score <= 100) {
			switch ((int)score/10) {
			case 10:
            case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
				break;
			}
		} else {
			System.out.println("점수를 잘못 입력했습니다.");
		}
		
	}
}