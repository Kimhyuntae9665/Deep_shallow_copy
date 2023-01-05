package Shallow_Copy;

public class Human {
	String name;
	int age;
	
	public Human(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public Human() {
		
	}
	
	public void changeName(String name) {
		this.name = name;
	}
	
	public void changeAge(int age) {
		this.age = age;
	}
	
	public static void shallowCopy() {
		Human human = new Human("sooyeol",26);
		Human humanCopy = human; //shallow copy 
		
		human.changeName("mainsoo");
		human.changeAge(40);
		
		System.out.println(human.name);
		System.out.println(human.age);
		System.out.println(humanCopy.name);
		System.out.println(humanCopy.age);
	}

	public static void main(String[] args) {
		shallowCopy();

	}

}
