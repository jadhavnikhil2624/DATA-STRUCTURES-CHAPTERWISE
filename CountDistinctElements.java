import java.util.*;

class CountDistinctElements{
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }//End for 

        System.out.println("The distinct element count: "+countDistinct(arr, n));
    }//End main

    public static int countDistinct(int arr[], int n){
        boolean isDistinct = true;
        int count=0;

        for(int i=0;i<n;i++){
            for(int j = (i-1);j>=0;j--){
                if(arr[i] == arr[j]){
                    isDistinct = false;    
                    break;
                }//End if

            }//End for j 
            if(isDistinct==true){
                count++;
            }//End if
        }//End for i
        return count;
    }//End countDistinct
}//End countDistinctElements