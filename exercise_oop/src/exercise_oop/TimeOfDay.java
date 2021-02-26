package exercise_oop;
	/**
	 * 
	 * @inmutable
	 */
public class TimeOfDay {
	protected int minutesSinceMidnight;

	public TimeOfDay(int minutesSinceMidnight) {
		this.minutesSinceMidnight = minutesSinceMidnight;
	}
	
	public void setMinutesSinceMidnight(int minutesSinceMidnight) {
		this.minutesSinceMidnight = minutesSinceMidnight;
	}

	public int getMinutesSinceMidnight() {
		return minutesSinceMidnight;
	}

	@Override
	public String toString() {
		
		int hours = minutesSinceMidnight/60;
		int minutes = minutesSinceMidnight%60;
		
		return "TimeOfDay [hours=" + hours + ", minutes=" + minutes + "]";
	}
	

	
}