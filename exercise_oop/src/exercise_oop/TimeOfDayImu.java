package exercise_oop;

/**
 * 
 * @inmutable
 */
public class TimeOfDayImu {
	private int hours;
	private int minutes;

	public TimeOfDayImu(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	@Override
	public String toString() {
		return "TimeOfDayImu [hours=" + hours + ", minutes=" + minutes + "]";
	}

}