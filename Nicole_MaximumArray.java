
public class Nicole_MaximumArray {
	public static void main(String[] args) {
		int integerArray[] = new int[10];
		final int MIN = 1, MAX = 100;
		int maxOrt = 0;

        System.out.println("Unsere 10 schönsten Zahlen des Tages lauten:");
		
		for (int index = 0; index < integerArray.length; index++) {
            int random = MIN + (int)(Math.random() * MAX);
            integerArray[index] = random;

            System.out.println(integerArray[index]);
        }
		for (int index = 0; index < integerArray.length; index++) {
			for (int next = index + 1; next < integerArray.length; next++) {
				if (integerArray[index] > integerArray[next]) {
					int helper = integerArray[index];
					integerArray[index] = integerArray[next];
					integerArray[next] = helper;
				}
			}
		}
		maxOrt = integerArray.length -1;
        int integer_big = integerArray[integerArray.length -1];

        System.out.println("Die größte Zahl lautet: " + integer_big + " und hat den Index " + maxOrt);
	}
}
