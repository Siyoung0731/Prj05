package ex05;

// 한개 이상의 abstract 메소드가 있다면 abstract class
abstract class Pet { 
	String name;
	void eat() {
		System.out.println(name + "(이)가 먹는다.");
	}
	abstract void sound(); // 함수의 {} 가 없으면 abstract 필수!
}
// Dog = Dog + Pet
class Dog extends Pet {
	// 코딩이 없는 함수를 상속 받으면 반드시 자식이 코딩을 구현해야한다. -> @Override : 재정의!!!!!
	// Add Unimplemented method
	@Override
	void sound() {
		System.out.println(name + "(이)가 멍멍");
	}
}
// Cat = Cat + Pet
class Cat extends Pet {
	@Override
	void sound() {
		System.out.println(name + "(이)가 냐옹");
	}
}
public class TestAnimal {
	public static void main(String[] args) {
		
		//Pet pet = new Pet(); //오류 : abstract 가 있으면 new 불가능
		
		Dog d = new Dog();
		work(d, "개");

		Cat c = new Cat();
		work(c, "고양이");
	}
	// work 한개로 통일
	// 부모클래스는 자식클래스 담을 수 없다 -> Pet pet = new Pet(); Dog dog1 = pet;//오류
	// 자식 클래스는 부모클래스 담을 수 있다 -> Pet pet = dog1; / Pet pet = cat1; (oK)
	private static void work(Pet pet, String name) {
		// TODO Auto-generated method stub
		pet.name = name;
		pet.eat();
		pet.sound();
	}

	
//--------------------------------------------------
/*
	// 방법 1 : 함수의 overload 기능 활용
	private static void work(Dog d, String name) {
		// TODO Auto-generated method stub
		d.name = "개";
		d.eat();
		d.sound();
	}
	
	private static void work(Cat c, String name) {
		// TODO Auto-generated method stub
		c.name = "고양이";
		c.eat();
		c.sound();
	}
*/
}
