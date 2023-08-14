class MultidimensionalArray{
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1,2,3},{1,2,3}};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j<arr.length-1; j++) {
                System.out.print(arr[i][j]+" ");
            }//End for j 
            System.out.println();
        }//End for i
    }//End main
}//End class