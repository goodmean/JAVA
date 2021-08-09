import java.util.Scanner;

public class Main2068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int a = 0;
		
		for(int tc = 1; tc <= T; tc++) {
			int temp = 0;
			for(int i = 0; i < 10; i++) {
				a = sc.nextInt();
				if(temp < a) {
					temp = a;
				}
			}
			System.out.println("#" + tc + " " + temp);
		}
		
	}
}
