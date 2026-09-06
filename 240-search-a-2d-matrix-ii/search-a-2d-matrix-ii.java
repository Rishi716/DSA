class Solution {
    public boolean searchMatrix(int[][] arr, int tar) {
         int rows= 0;
        int cols= arr[0].length-1;
   while(rows<arr.length && cols >=0){
           
                if(arr[rows][cols]==tar) return true;
               else if(arr[rows][cols]>tar){
                    cols--;
                } 
                else {
                    rows++;
                }
               
            
        }
       return false ;
    }
}