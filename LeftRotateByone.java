public class LeftRotateByone {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int arr[] = new int[] { 10, 20, 25, 30, 40 };
    int n = arr.length;

    leftRotateOne(arr, n);
  } // End main

  public static void leftRotateOne(int arr[], int n) {
    int temp = arr[0];
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    } // End for

    for (int i = 1; i < n; i++) {
      arr[i - 1] = arr[i];
    } // End for
    arr[n - 1] = temp;

    System.out.println();
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    } // End for
  } // End leftRotateOne
} // End class
