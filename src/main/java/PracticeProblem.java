public class PracticeProblem {

	public static void main(String args[]) {

	}

	//1.
	public static int[] createdIntArray() {

		int[] arr = new int[5];

		for (int i = 0; i <= 4; i++) {
			arr[i] =  i + 1;
		}

		return arr;
	}

	//2.
	public static String[] createArray(String a, String b, String c, String d) {

		String[] arr = new String[4];

		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;

		return arr;

	}

	//3.
	public static String getElement (int  n, String[] arr) {
		
		return arr[n];
	}

	//4.
	public static double replaceElement (int n1, double n2, double[] arr) {
		
		return arr[n1] = n2;
	}
}