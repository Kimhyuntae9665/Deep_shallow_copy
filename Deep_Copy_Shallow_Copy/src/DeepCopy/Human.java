package DeepCopy;

public class Human {
	String name;
	int age;
	
//	복사 생성자 
	public Human(Human human) { //생성자 반환타입이 없다 
		this.name = human.name;
		this.age = human.age;
	}
	
	public Human() {//생성자는 반환 타입이 없다 
		this("sooyeol",30);
	}
	
	public Human(String name,int age) {//생성자는 반환 타입이 없다 
		this.name = name;
		this.age = age;
	}
	
//	복사 팩토리 
	public static Human newInstance(Human human) { //main 함수가 static 함수이니까 static 꼭 붙여줘야
		Human human2 =  new Human();
		human2.name = human.name;
		human2.age = human.age;
		
		return human2;
	}
	
	

	public static void main(String[] args) {
		
		Human human = new Human();
		Human human2 = new Human(human); //복사 생성자 
		
		human.name =  "kim";
		human.age = 10;
		
		System.out.println(human.name);
		System.out.println(human.age);
		System.out.println(human2.name);
		System.out.println(human2.age);
		
		
		Human human3 = new Human();
		Human human4 = Human.newInstance(human3);
//		static 함수 newInstance 는 객체 없이 클래스 이름 대고 사용 
		
		human4.name = "Lee";
		human4.age = 2;
		
		
		System.out.println(human3.name);
		System.out.println(human3.age);
		System.out.println(human4.name);
		System.out.println(human4.age);

	}

}
