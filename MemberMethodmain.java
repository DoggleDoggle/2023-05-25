
public class MemberMethodmain {

	// 메인 블록을 호출하는 놈이 jvm
	public static void main(String[] args) {
		System.out.println("main blodk start");
		MemberMethod mm1 = new MemberMethod();
		mm1.member1 = 123;
		System.out.println("main start1");
		/*
		 * 멤버메쏘드 실행 (호출) -형식:참조변수,메쏘드이름(); -main 실행흐름을 mm1주소에 있는 객체의 method1이라는 이름의
		 * 메쏘드(실행코드)로 보낸다!
		 */
		mm1.method1(); // 참조변수
		System.out.println("main start1");

		mm1.method2();
		System.out.println("main start2");

		System.out.println("main start2");

		mm1.method3(5); //<-매개변수 자리에 인트값 넣어줘야 한다.
		System.out.println("main start3");
		
		mm1.method4("안녕하세요!",3);
		System.out.println("main start7");
		mm1.method4("냠냠!",10);
		
		System.out.println("main block end");
	}

}
