package ex03;

class Dog {
	String name;
	void eat() {
		System.out.println(name +"가 사료를 먹는다.");
	}
	void bark() {
		System.out.println(name + "가 멍멍.");
	}
}
class Cat {
	String name;
	void eat() {
		System.out.println(name + "가 츄르를 먹는다.");
	}
	void meow() {
		System.out.println(name + "가 냥냥");
	}
}

public class TestAnimal {
	public static void main(String[] args) {
		//생성자 호출 -> 생성자가 없다 : 자바가 기본생성자를 생성해준다.
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
