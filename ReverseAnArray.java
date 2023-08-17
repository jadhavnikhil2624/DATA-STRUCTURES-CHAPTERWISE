public class ReverseAnArray {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int arr[] = new int[] { 34, 56, 78, 90, 34, 17 };
    int n = arr.length - 1;
    for (int i = n; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    } // End for
    // 17 34 90 78 56 34
  } // End main
} // End class2
