package array;

public class RemoveElementFromArray {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int arr[] = new int[] { 10, 45, 78, 30, 40 };

    int n = arr.length;
    int x = 45;

    System.out.println("\n" + removeElement(arr, n, x));
  } // End main

  public static int removeElement(int arr[], int n, int x) {
    int i = 0;
    for (i = 0; i < n; i++) {
      if (arr[i] == x) {
        break;
      } // End if
    } // End for

    if (i == n) {
      return n;
    } // End if

    for (int j = i; j < n - 1; j++) {
      arr[j] = arr[j + 1];
    } // End for

    System.out.println();
    for (int j = 0; j < n; j++) {
      System.out.print(arr[j] + " ");
    } // End for
    return n - 1;
  } // End removeElement
} // End class
