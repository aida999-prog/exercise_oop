package exercise_oop.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import exercise_oop.TimeOfDay;

class TimeOfDayTest {

	@Test
	public void getMinutesSinceMidnightTest() {
		int time = 125;
		TimeOfDay mutable = new TimeOfDay(time);
		
		assertEquals(mutable.getMinutesSinceMidnight(), time);
	}
	
	@Test
	public void setMinutesSinceMidnighTest() {
		int time = 125;
		TimeOfDay mutable = new TimeOfDay(123);
		
		mutable.setMinutesSinceMidnight(time);
		
		assertEquals(mutable.getMinutesSinceMidnight(), time);
	}

}
