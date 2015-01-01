public class Problem19 {
	public static void main(String[] args) {

		int[] daysInTheMonth = { 0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int year = 1900;
		int month = 1;
		int day = 1;
		int dayID = 1;
		int mondayCount=0;
		
		while (year <= 2000 && month <= 12 && day <= 31) {
			if(dayID == 1 && day == 1 && year >= 1901){
				mondayCount++;
			}
			day++;
			dayID++;
			
			dayID = dayID%7;
			if(day > daysInTheMonth[month]){
				day = 1;
				month++;
				if(month == 2)
					daysInTheMonth[2] = isLeapYear(year);
				
				if(month == 13){
					month = 1;
					year++;
				}
					
			}
			
		}

		System.out.println(mondayCount);

	}

	public static int isLeapYear(int year) {
		if (year % 4 == 0 && year % 400 != 0) {
			return 29;
		} else {
			return 28;
		}
	}
}
