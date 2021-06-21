
public class Main {
	public static void main(String[] args) {
		
		People p1 = new People();
		p1.name = "김철수";
		p1.age = 22;
		p1.height = 177.7f;
		p1.introduce();
		
		People p2 = new People();
		p2.name = "김영희";
		p2.age = 20;
		p2.height = 162.0f;
		p2.introduce();
		
		//소수 뒤에 f를 안붙이면 기본적으로 8바이트짜리 double 형태로 인식.
	}
}

class People{
	String name;
	int age;
	float height;
	
	void introduce() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
	}
}
