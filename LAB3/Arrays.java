package aa224iu_lab3;

public class Arrays {
	public static void main(String[] arg) {

		int[] test = { 3, 4, 5, 6, 7 };
		// sumx
		System.out.println("Summan av alla tal : " + sum(test));

		// to string
		System.out.println("Skriva ut tal i array : " + toString(test));

		// addN
		System.out.println("arr + 2 : " + toString(addN(test, 2))); // n = 2

		// Reverse
		System.out.println("Reverse : " + toString(reverse(test)));

		// hasN
		System.out.println("True / False : " + hasN(test, 3)); // n = 3

		// Replace All
		int[] test2 = { 3, 4, 5, 6, 7 };
		replaceAll(test2, 3, 1);
		System.out.println("Replace :" + toString(test2));

		// sort
		int[] notSort = { 9, 2, 11, 1, 7 };
		System.out.println("Sort : " + toString(sort(notSort)));

		// hasSubsequence
		int[] test3 = { 1, 2, 3, 4, 5 };
		int[] lookFor = { 3, 4, 5 };
		System.out.println(" True / False : " + hasSubsequence(test3, lookFor));

	}

	// method sum
	private static int sum(int[] arr) {
		int summan = 0;
		for (int i = 0; i < arr.length; i++) {
			summan = summan + arr[i];

		}
		return summan;
	}

	// method toString
	private static String toString(int[] arr) {

		String empty = ", ", newString = "";
		for (int i = 0; i < arr.length; i++) {
			newString += arr[i] + empty;
		}
		return newString;

	}

	// method addN
	private static int[] addN(int[] arr, int n) {
		int[] newArr = new int[arr.length];
		// göra om detta
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i] + n;
		}

		return newArr;

	}

	// method reverse
	private static int[] reverse(int[] arr) {
		int cout = 0;
		int[] newReverse = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {

			newReverse[cout] = arr[i];
			cout++;
		}

		return newReverse;
	}

	// method boolean
	private static boolean hasN(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (n == arr[i]) {
				return true;
			}

		}
		return false;
	}

	// method Replace all
	private static void replaceAll(int[] arr, int old, int nw) {
		for (int i = 0; i < arr.length; i++) {
			if (old == arr[i]) {
				arr[i] = nw;
			}

		}

	}

	// metod sort
	private static int[] sort(int[] arr) {
		int[] newArr = new int[arr.length];
		int temp;

		// copy
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}

		// sort
		for (int n = 0; n < newArr.length; n++) {
			int minsta = n;
			for (int j = n; j < newArr.length; j++) {
				if (newArr[j] < newArr[minsta]) {
					minsta = j;
				}
			}
			temp = newArr[n];
			newArr[n] = newArr[minsta];
			newArr[minsta] = temp;
		}

		return newArr;

	}

	private static boolean hasSubsequence(int[] arr, int[] sub) {
		int count = 0; // räknar hur många tal i sub

		for (int i = 0; i < arr.length; i++) {

			if (sub[count] == arr[i]) {
				count++;
				if (count == sub.length) // hela är med
					return true;
			}

			else // när den inte hitta så börja den från första tal i sub igen
				count = 0;

		}
		return false;
	}

}
