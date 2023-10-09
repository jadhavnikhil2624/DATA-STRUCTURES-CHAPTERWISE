package Array;
//{ Driver Code Starts
//Initial template for JAVA

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {

  public static void main(String args[]) {
    //taking input using class Scanner
    Scanner sc = new Scanner(System.in);

    //taking total count of tetcases
    int t = sc.nextInt();

    while (t-- > 0) {
      //taking total number of elements
      int n = sc.nextInt();

      //taking size of subArrays
      int k = sc.nextInt();

      //Declaring and Intializing an array of size n
      int arr[] = new int[n];

      //adding all the elements to the array
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      //Calling the method max_of_subarrays of class solve
      //and storing the result in an ArrayList
      ArrayList<Integer> res = new Solution().max_of_subarrays(arr, n, k);

      //printing the elements of the ArrayList
      for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
      System.out.println();
    }
  }
}

// } Driver Code Ends

//User function template for JAVA

class Solution {

  //Function to find maximum of each subarray of size k.
  static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
    // Your code here
    ArrayList<Integer> al = new ArrayList<>();

    for (int i = 0; i <= n - k; i++) {
      int max = arr[i];

      for (int j = 1; j < k; j++) {
        if (arr[i + j] > max) {
          max = arr[i + j];
        }
      } //End for j
      al.add(max);
    } //End for
    return al;
  }
}
