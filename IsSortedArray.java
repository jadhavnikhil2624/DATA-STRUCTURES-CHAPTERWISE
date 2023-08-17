package array;

public class IsSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 10, 20, 25, 30, 40 };
		int n = arr.length;

		if (isSorted(arr, n)) {
			System.out.println("Array is Sorted");
		} else {
			System.out.println("Array is not Sorted");
		} // End if-else
	}// End main

	public static boolean isSorted(int arr[], int n) {
		for (int i = 1; i < n; i++) {
			if (arr[i] < arr[i - 1]) {
				return false;
			} // End if
		} // End for
		return true;
	}// End isSorted
}// End class
