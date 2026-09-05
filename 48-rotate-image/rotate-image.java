class Solution {
    public void rotate(int[][] arr) {
         for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <i ; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
         }
              for (int i = 0; i < arr.length; i++) {
               int l=0,r=arr[0].length-1;
               while(l<r){
                int temp=arr[i][l];
                arr[i][l]=arr[i][r];
                arr[i][r]=temp;
                l++;
                r--;
               }
          }
         
    }
}
    