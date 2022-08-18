public class TimeFormatter {
	public static String formatDuration(int seconds) {
		
		if (seconds == 0) return "now";
		
		int sec = seconds < 60 ? seconds : seconds % 60;
		int min = (seconds / 60) < 60 ? seconds/60 : (seconds / 60) % 60;
		int hour = seconds / 3600 < 24 ? seconds / 3600 : (seconds / 3600) % 24;
		int day = seconds / 86400 < 365 ? seconds / 86400 : (seconds / 86400) % 365;
		int year = seconds / 31536000;
		
		StringBuilder timeString = new StringBuilder();
		if (year != 0) 
			timeString.append(year).append(year > 1 ? " years, " : " year, ");
		if (day != 0) 
			timeString.append(day).append(day > 1 ? " days, " : " day, ");
		if (hour != 0) 
			timeString.append(hour).append(hour > 1 ? " hours, " : " hour, ");
		if (min != 0) 
			timeString.append(min).append(min > 1 ? " minutes, " : " minute, ");
		if (sec != 0) 
			timeString.append(sec).append(sec > 1 ? " seconds" : " second");
		
		String output = timeString.toString().trim();
		
		if (output.charAt(output.length() - 1) == ',') 
			output = output.substring(0, output.length() - 1);
		
		int lastComma = output.lastIndexOf(",");
		if (lastComma > 0) output = output.substring(0, lastComma) + " and" + output.substring(lastComma + 1);
		
		return output;
	}
}
