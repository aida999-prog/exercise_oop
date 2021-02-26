package exercise_oop.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import exercise_oop.TimeOfDayImu;

class TimeOfDayImuTest {

	@Test
	public void getHoursTest() {
		int hours = 12;
		TimeOfDayImu mutable = new TimeOfDayImu(hours, 24);
		
		assertEquals(mutable.getHours(), hours);
	}
	
	@Test
	public void setMinutesTest() {
		int minutes = 30;
		TimeOfDayImu mutable = new TimeOfDayImu(16, minutes);
		
		assertEquals(mutable.getMinutes(), minutes);
	}

}
