
public class Main2 {
	public static void main(String[] args) {
		
		Person a = new Person();
		a.age = 20;
		a.isMarried= false;
		a.name = "Paul";
		a.introduce();
		a.숨쉬다();
	}
}

class Person {
	int age;
	boolean isMarried;
	String name;
	
	void introduce() {
		System.out.println("== 자기소개 시작 ==");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("기혼 여부 : %b\n", isMarried);
		System.out.println("== 자기소개 끝 ==");
	}
	
	void 숨쉬다(){
		System.out.println("숨쉼");
	}
}
