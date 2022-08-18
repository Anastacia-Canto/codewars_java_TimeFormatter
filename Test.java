public class Test {

	public static void main(String[] args) {
		System.out.println("100 s: " + TimeFormatter.formatDuration(100));
		System.out.println("1 s: " + TimeFormatter.formatDuration(1));
		System.out.println("0 s: " + TimeFormatter.formatDuration(0));
		System.out.println("247 s: " + TimeFormatter.formatDuration(247));
		System.out.println("90000 s: " + TimeFormatter.formatDuration(90000));
		System.out.println("3662 s: " + TimeFormatter.formatDuration(3662));
		System.out.println("3600 s: " + TimeFormatter.formatDuration(3600));
		

	}

}
