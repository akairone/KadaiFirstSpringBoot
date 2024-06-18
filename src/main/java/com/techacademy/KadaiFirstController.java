package com.techacademy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Calendar;

@RestController
public class KadaiFirstController {

	@GetMapping("/dayofweek/{val1}")
	public String dispDayOfWeek(@PathVariable String val1) {

		int year = Integer.parseInt(val1.substring(0, 3));
		int month = Integer.parseInt(val1.substring(4, 5));
		int date = Integer.parseInt(val1.substring(6, 7));

		Calendar calendar = Calendar.getInstance();
		calendar.set(year,month,date);

		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		String week = null;
		switch(dayOfWeek){
		case Calendar.SUNDAY: week = "Sunday"; break;
		case Calendar.MONDAY: week = "Monday"; break;
		case Calendar.TUESDAY: week =  "Tuesday"; break;
		case Calendar.WEDNESDAY: week = "Wednesday"; break;
		case Calendar.THURSDAY: week = "Thursday"; break;
		case Calendar.FRIDAY: week = "Friday"; break;
		case Calendar.SATURDAY: week = "Saturday";
		}
		return week;


	}

	@GetMapping("/plus/{val1}/{val2}")
	public int calcPlus(@PathVariable int val1,@PathVariable int val2) {
		int res = 0;
		res = val1 + val2;
		return res;
	}

	@GetMapping("/minus/{val1}/{val2}")
	public int calcMinus(@PathVariable int val1,@PathVariable int val2) {
		int res = 0;
		res = val1 - val2;
		return res;
	}

	@GetMapping("/times/{val1}/{val2}")
	public int calcTimes(@PathVariable int val1,@PathVariable int val2) {
		int res = 0;
		res = val1 * val2;
		return res;
	}

	@GetMapping("/divide/{val1}/{val2}")
	public int calcDivide(@PathVariable int val1,@PathVariable int val2) {
		int res = 0;
		res = val1 / val2;
		return res;
	}
}
