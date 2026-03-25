package ex06;

// 오리
class Duck {
	void swim() {
		System.out.println("헤엄을 칩니다.");
	}
}
// 너구리 - 코드 없이 만듬 : abstract
// 모든 항목이 abstract 인 abstract class 는 interface 문법으로 변경 가능
// implements는 여러 개 구현 가능, extends는 다중 상속 불가
/*
abstract class Racoon {
	abstract void dig();
} 
 */
interface Racoon {
	void dig(); // public abstract 키워드 생략 가능
} 
//오리너구리 = 오리+너구리
class DuckRacoon extends Duck implements Racoon {
	@Override
	public void dig() {
		System.out.println("땅을 팝니다.");
	}
}
public class TestDuckRacoon {
	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dig();
	}

}
