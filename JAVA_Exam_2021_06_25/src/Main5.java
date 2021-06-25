// 문제 : 구구단을 만들어주세요
// 출력양식
/*
== 2단 ==
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
...
== 9단 ==
9 * 1 = 9
...
9 * 9 = 81
*/

class Main5 {
	public static void main(String[] args) {
		new 구구단출력기().작동();
	}
}

class 구구단출력기 {
	// 구현시작
	void 작동() {
		for (int i = 2; i <= 9; i++) {
			System.out.printf("== %d단 ==\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}
	// 구현끝
}