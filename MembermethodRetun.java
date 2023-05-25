
public class MembermethodRetun {
	/*
	 * 멤버필드 -멤버필드선언시 값을 대입할 수 있다.
	 */

	int memberField1 = 10;
	int memberField2 = 20;
	int memberField3 = 30;
	public int add;

	/*
	 * 멤버메쏘드
	 * 
	 */
	int method1() {
		System.out.println("\t ---method1 실행");
		int result = 1 + 2;
		System.out.println("\t ---method1 실행 종료 후 실행흐름과" + "int 데이터 반환");
		/*
		 * return <<호출한 클래스(객체)에게 반환할 값 (변수,리터럴 연산의 결과) 호출한 곳으로 실행흐름을 되돌려 줌 데이터도 반환한다 반환
		 * 할 데이터가 없는 경우에는 즉 데이터 타입이 void 인 경우에는 return 생략 가능한다 반대로 반환 할 데이터가 존재할 경우
		 * 예)int return 을 필수로 사용해야한다.
		 */

		return result;
	}

	boolean method2() {
		System.out.println("\t ---method2() 실행");
		boolean isMarried = false;
		System.out.println("\t-----boolean method2()실행 후" + "데이터+ 실행흐름 반환한다.");
		return isMarried;
	}

	/*
	 * 두개의 점수를 파라미터로 받아서 더한 결과를 (정수)로 반환하는 메쏘드
	 */
	int add(int a, int b) {

		System.out.println("\t-- int add (int a,int b)--실행 ");
		int result = a + b;
		System.out.println("--\t int add (int a,int b)--종류 후 데이터" + " 변환 ");
		return result;

	}
	/*
	 * 이름을 매개변수로 입력 받아서 인사말을 만들어서 문자열로 반환하는 매소드
	 */

	String hello(String name) {
		String mas = name + "님 안녕하세요!";
		return mas;
	}

}
