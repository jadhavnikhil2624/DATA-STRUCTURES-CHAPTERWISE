public class RotationOfArray {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int arr[] = new int[] { 10, 20, 25, 30, 40 };
    int n = arr.length;
    int d = 3;
    leftRotate(arr, n, d);
    leftRotates(arr, n, d);
  } // End main

  public static void leftRotateOne(int arr[], int n) {
    int temp = arr[0];
    n = arr.length;
    for (int i = 1; i < n; i++) {
      arr[i - 1] = arr[i];
    } // End for
    arr[n - 1] = temp;
  } // End method

  // NAIVE SOLUTION OF THIS PROBLEM
  public static void leftRotate(int arr[], int n, int d) {
    for (int i = 0; i < d; i++) {
      leftRotateOne(arr, n);
    } // End for

    System.out.println();
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    } // End for
  } // End method

  // OPTIMAL SOLUTION OF THIS PROBLEM
  public static void leftRotates(int arr[], int n, int d) {
    int temp[] = new int[d];
    for (int i = 0; i < d; i++) {
      temp[i] = arr[i];
    } // End for

    for (int i = d; i < n; i++) {
      arr[i - d] = arr[i];
    } // End for

    for (int i = 0; i < d; i++) {
      arr[n - d + i] = temp[i];
    } // End for

    System.out.println();
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    } // End for
  } // End method
} // End class
