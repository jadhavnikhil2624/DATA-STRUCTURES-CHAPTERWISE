
public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[] = new int[] { 10, 20, 20, 30, 40 };
		int n = arr.length;

		int result = 1;

		for (int i = 0; i < n; i++) {
			if (arr[result - 1] != arr[i]) {
				arr[result] = arr[i];
				result++;
			} // End if
		} // End for

		int m = result;
		for (int i = 0; i < m; i++) {
			System.out.print(arr[i] + " ");
		} // End for

	}// End main

}// End class
