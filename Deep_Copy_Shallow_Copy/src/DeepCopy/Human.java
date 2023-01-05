package DeepCopy;

public class Human {
	String name;
	int age;
	
//	���� ������ 
	public Human(Human human) { //������ ��ȯŸ���� ���� 
		this.name = human.name;
		this.age = human.age;
	}
	
	public Human() {//�����ڴ� ��ȯ Ÿ���� ���� 
		this("sooyeol",30);
	}
	
	public Human(String name,int age) {//�����ڴ� ��ȯ Ÿ���� ���� 
		this.name = name;
		this.age = age;
	}
	
//	���� ���丮 
	public static Human newInstance(Human human) { //main �Լ��� static �Լ��̴ϱ� static �� �ٿ����
		Human human2 =  new Human();
		human2.name = human.name;
		human2.age = human.age;
		
		return human2;
	}
	
	

	public static void main(String[] args) {
		
		Human human = new Human();
		Human human2 = new Human(human); //���� ������ 
		
		human.name =  "kim";
		human.age = 10;
		
		System.out.println(human.name);
		System.out.println(human.age);
		System.out.println(human2.name);
		System.out.println(human2.age);
		
		
		Human human3 = new Human();
		Human human4 = Human.newInstance(human3);
//		static �Լ� newInstance �� ��ü ���� Ŭ���� �̸� ��� ��� 
		
		human4.name = "Lee";
		human4.age = 2;
		
		
		System.out.println(human3.name);
		System.out.println(human3.age);
		System.out.println(human4.name);
		System.out.println(human4.age);

	}

}
