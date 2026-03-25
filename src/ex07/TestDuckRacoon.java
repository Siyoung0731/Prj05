package ex07;

interface Duck {
	void swim();
}
interface Racoon {
	void dig();
}
//class DuckRacoon extends Object {} -> Object 는 자바의 최상위 부모 클래스
//모든 자바의 클래스는 Object class 를 상속받아서 만들어졌다
// hashCode : Heap 메모리의 위치, toString : java.lang.Object@8bcc55f(16진수), getClass : class java.lang.Object 
// interface 를 쓰는 이유 : 다중 상속을 못 받기 때문에
class DuckRacoon implements Duck, Racoon{
	@Override
	public void dig() {
		System.out.println("땅을 판다.");
	}
	@Override
	public void swim() {
		System.out.println("헤엄 친다.");
	}
}

public class TestDuckRacoon {
	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dig();
		
		System.out.println(dr.hashCode());
		System.out.println(dr.toString());
		System.out.println(dr.getClass());
		
		Object obj = new Object();
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj.getClass());
		
	}

}
