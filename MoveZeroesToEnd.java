public class MoveZeroesToEnd {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int arr[] = new int[] { 10, 0, 0, 30, 40 };

    int n = arr.length;

    moveZeros(arr, n);
  } // End main

  public static void moveZeros(int arr[], int n) {
    int j = 0;

    for (int i = 0; i < n; i++) {
      if (arr[i] != 0) {
        if (i != j) {
          arr[j] = arr[i];
          arr[i] = 0;
        } // End if
        j++;
      } // End if
    } // End for

    System.out.println();
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    } // End for
  } // End method
} // End class
