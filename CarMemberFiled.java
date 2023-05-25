
public class CarMemberFiled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1; // 차 객체를 저장 할 Car class타입 변수 선언
		car1 = new Car(); // Car클레스를 사용하여 차 객체를 생성한 후 car1변수에 대입

		car1.no = "1234";
		car1.inTime = 12;

		car1.outTime = 16;

		car1.fee = (car1.outTime - car1.inTime) * 1000;

		System.out.printf("차량번호:%s,입차시간:%d,출차시간:%d,주차요금:%d\n", car1.no, car1.inTime, car1.outTime, car1.fee);

		System.out.printf("=======영수증 출력===============\n");
		System.out.printf("차량 번호:%s\n", car1.no);
		System.out.printf("--------------------------------\n");
		System.out.printf("입차 시간:%d\n", car1.inTime);

		System.out.printf("출차 시간:%d\n", car1.outTime);
		System.out.println("--------------------------------");

		System.out.printf("주차 요금:%d\n", car1.fee);
		System.out.println("--------------------------------");

		System.out.printf("┌-----------------------------------┒\n");
		System.out.printf("│차량번호│입차시간│출차시간│주차요금│\n");
		System.out.printf("%8s│%5d  │%8d│%10d│",car1.no,car1.inTime,car1.outTime,car1.fee);
		
	}

}
