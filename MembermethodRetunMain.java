
public class MembermethodRetunMain {

	public static void main(String[] args) {

		MembermethodRetun mmr = new MembermethodRetun();

		int returnData1 = mmr.method1();
		System.out.println("main block-->returnData1:" + returnData1);

		boolean returnData2 = mmr.method2();
		System.out.println("main block-->returnData2:" + returnData2);

		int retunrData3 = mmr.add(1233, 3424);
		System.out.println("main block-->returnData3:" + mmr.add);
		
		System.out.println("main block-->returnData4:" + mmr.add);
		
		String returnMsg=mmr.hello("나자바");
		System.out.println(returnMsg);
		System.out.println("나나나");
		System.out.println("다다다");
		System.out.println("라라라");
	}

}
