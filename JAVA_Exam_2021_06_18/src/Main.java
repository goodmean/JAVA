
public class Main {
	public static void main(String[] args) {
		
		People p1 = new People();
		p1.name = "김철수";
		p1.age = 22;
		p1.height = 177.7;
		p1.introduce();
		
		People p2 = new People();
		p2.name = "김영희";
		p2.age = 20;
		p1.height = 162.0;
		p2.introduce();
	}
}

class People{
	String name;
	int age;
	double height;
	
	void introduce() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
	}
}
