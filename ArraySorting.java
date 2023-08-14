public class ArraySorting {
    public static void main(String [] args){
        int arr[] = new int[]{10,20,30,70,50};

        if(isSorted(arr)){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is not Sorted");
        }//End if-else
    }//End main

    public static boolean isSorted(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }//End if
        }//End for 
        return true;
    }//end isSorted
}//End class
