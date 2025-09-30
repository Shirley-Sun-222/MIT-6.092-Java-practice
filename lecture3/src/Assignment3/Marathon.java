package Assignment3;

public class Marathon {
	public static int fastest(int[] times) {
		int minminute = Integer.MAX_VALUE;
		int index = -1;
		for (int i=0;i<times.length;i++) {
		if (times[i] <= minminute) {
			minminute = times[i];
			index = i;
		}
		}
		return index ;
	}
	
	
	public static int secfast(int[] times) {
		int index1 = fastest(times);
		int minminute = 0;
//		times[index1] = Integer.MAX_VALUE;
//		int index2 = fastest(times);
//		return index2 ;
		int index2 = -1; // often an errer.
		for (int i=0;i<times.length;i++) {
		if (index2 == -1 || (times[i] <= minminute && i!=index1)) { // important, add index2 == -1
			minminute = times[i];
			index2 = i;
		}
		}
		return index2;
	}
	
	public static void main(String[] arguments) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", 
							"John", "James","Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i] + ": " + times[i]);
//		}
		int index1 = fastest(times);
		int index2 = secfast(times);
		System.out.println("The fastest friend is " + names[index1] + 
				", his/her grade is " + times[index1] + "seconds.");
		System.out.println("The fastest friend is " + names[index2] + 
				", his/her grade is " + times[index2] + "seconds.");
	}
}

