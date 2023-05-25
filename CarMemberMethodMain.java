
public class CarMemberMethodMain {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.no = "1234";
		car1.inTime = 21;
		car1.outTime = 2;

		car1.fee = (car1.inTime - car1.outTime) * 1000;

	}

}
