package ex04;

//상위 클래스
class Pet {
	String name;
	void eat() {
		System.out.println(name +"가 사료를 먹는다.");
	}
}
//하위 클래스
class Dog extends Pet { // Dog = Pet + Dog
	void bark() {
		System.out.println(name + "가 멍멍.");
	}
}
//하위 클래스
class Cat extends Pet{
	void meow() {
		System.out.println(name + "가 냥냥");
	}
}
class Tiger extends Pet {
	void cry() {
		System.out.println(name + "가 어흥");
	}
}

public class TestAnimalInherit {
	// 상속 : Inherit -> Java 에선 extends
	// 다중 상속 불가능, 즉 상속은 한개만 가능 -> java, c#
	public static void main(String[] args) {
		
		Dog d = new Dog();
		work(d, "개");
//		d.name = "개";
//		d.eat();
//		d.bark();
		System.out.println("========================");

		Cat c = new Cat();
		work(c, "고양이");
//		c.name = "고양이";
//		c.eat();
//		c.meow();
		System.out.println("========================");
		
		Tiger t = new Tiger();
		work(t, "호랑이");
		
		Pet p = new Pet();
		p.name = "뻐금이";
		p.eat();
		//pet.bark(); //error
	}
	
	
	//한개의 work() 함수로 처리
	private static void work(Pet p, String name) {
		p.name = name;
		System.out.println("work:");
		p.eat();
		
		if(p instanceof Dog)
			((Dog) p).bark();
		if(p instanceof Cat)
			((Cat) p).meow();
		if(p instanceof Tiger)
			((Tiger) p).cry();
	}
	
//
//	private static void work(Cat c, String name) {
//		c.name = name;
//		System.out.println("work:");
//		c.eat();
//		c.meow();
//	}
//
//	private static void work(Dog d, String name) {
//		// TODO Auto-generated method stub
//		d.name = name;
//		System.out.print("work:");
//		d.eat();
//		d.bark();
//	}

}
