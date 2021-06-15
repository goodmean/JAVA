// 문제 : 아래와 같이 출력해주세요.

class Main2 {
  public static void main(String[] args) {
	
	for(int dan = 2; dan <= 9; dan++) {
		System.out.println("==" + dan + "단" + "==");
		for(int i = 1; i <=9; i++) {
			System.out.println(dan + "x" + i + "=" + dan*i);
		}
		System.out.println();
	}
    
    // 출력
    /*
    8 * 1 = 8
    8 * 2 = 16
    8 * 3 = 24
    8 * 4 = 32
    8 * 5 = 40
    8 * 6 = 48
    8 * 7 = 56
    8 * 8 = 64
    8 * 9 = 72
    */
  }
}