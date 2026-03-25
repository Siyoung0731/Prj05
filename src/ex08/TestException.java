package ex08;

public class TestException {

	public static void main(String[] args) {
//		예외(Exception Handling)
//		예외 : 실행 중 발생하는 오류
		try {
			int n1 = 7;
			int n2 = 0;
			int n = n1 / n2;
			System.out.println(n);
		} catch (ArithmeticException e) { // 오류 발생 시 처리 방법
			System.out.println("계산 오류" + e);
		} catch (Exception e) {
			System.out.println("오류 발생: " + e);
		} finally { // 오류에 상관 없이 무조건 실행
			System.out.println("프로그램 종료");
		}
//		int n1 = 7;
//		int n2 = 2;
//		int n2 = 0;
//		int n = n1 / n2;
//		Exception in thread "main" java.lang.ArithmeticException: / by zero at ex08.TestException.main(TestException.java:9)
//		10 라인에서 강제종료, 이후 코드는 실행 X
//		System.out.println(n);
//		System.out.println("프로그램 종료");
	}

}
