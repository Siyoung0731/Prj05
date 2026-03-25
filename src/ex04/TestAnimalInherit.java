package ex04;

//부모 클래스
class Pet {
	String name;
	void eat() {
		System.out.println(name +"가 사료를 먹는다.");
	}
}
// 자식 클래스
class Dog extends Pet { // Dog = Pet + Dog
	void bark() {
		System.out.println(name + "가 멍멍.");
	}
}
// 자식 클래스
class Cat extends Pet{
	void meow() {
		System.out.println(name + "가 냥냥");
	}
}

public class TestAnimalInherit {
	// 상속 : Inherit -> Java 에선 extends
	// 다중 상속 불가능, 즉 상속은 한개만 가능 -> java, c#
	public static void main(String[] args) {
		
		Pet p = new Pet();
		p.name = "뻐끔이";
		p.eat();
		
		Dog d = new Dog();
		d.name = "개";
		d.eat();
		d.bark();
		
		Cat c = new Cat();
		c.name = "고양이";
		c.eat();
		c.meow();
	}

}
