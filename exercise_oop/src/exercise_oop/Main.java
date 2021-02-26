package exercise_oop;

public class Main {

	public static void main(String[] args) {
		TimeOfDay mutable = new TimeOfDay(125);
		System.out.println(mutable);

		mutable.setMinutesSinceMidnight(130);
		System.out.println(mutable);
		
		TimeOfDayImu inmutable = new TimeOfDayImu(16, 24);
		System.out.println(inmutable);
	}

}
