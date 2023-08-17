public class SecondLargestElement {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int arr[] = new int[] { 10, 20, 20, 30, 40 };
    int second;
    int largest = second = Integer.MIN_VALUE;

    System.out.println(largest);

    // Find the largest element
    for (int i = 0; i < arr.length; i++) {
      largest = Math.max(largest, arr[i]);
    } // End for

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != largest) {
        second = Math.max(second, arr[i]);
      } // End if
    } // End for

    if (second == Integer.MIN_VALUE) {
      System.out.println("There is no second largest element");
    } else {
      System.out.println("The second largest element is: " + second);
    } // End if-else
  } // End main
} // End java
