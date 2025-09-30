package Assignment2;

public class FooCorporation {
	public static double paid(double pay, int day) {
		double minpay = 8.00;
		int maxday = 60;
		if (pay < minpay || day > maxday || day < 0) {
			System.out.println("ERROR");
			return -1;
		}
		else if (day <= 40) {
			return day * pay;
		} else {
			return 40 * pay + (day - 40) * pay * 1.5;
		}

	}

	public static void main(String[] args) {
		double pay = 8.20;
		double day = 47;
		double results = paid(8.20, 47);
		if (results > 0) {
			System.out.println("The wage for the employee is " + results);
		}
	}
}

// 官方答案
class WeeklyPay {
	public static void pay(double basePay, int hours) {
		if (basePay < 8.0) {
			System.out.println("You must be paid at least $8.00/hour");
		} else if (hours > 60) {
			System.out.println("You can't work more than 60 hours a week");
		} else {
			int overtimeHours = 0;
			if (hours > 40) {
				overtimeHours = hours - 40;
				hours = 40;
			}
			double pay = basePay * hours;
			pay += overtimeHours * basePay * 1.5;
			System.out.println("Pay this employee $" + pay);
		}
	}

	public static void main(String[] arguments) {
		pay(7.5, 35);
		pay(8.2, 47);
		pay(10.0, 73);
	}
}