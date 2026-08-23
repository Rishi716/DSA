class Solution {
    public boolean searchMatrix(int[][] arr, int tar) {
        int rows= arr.length;
        int cols= arr[0].length;
        int l=0,h=rows*cols-1;
        

        while (l<=h){
            int mid=l+(h-l)/2;
            int midr=mid/cols;
             int midc=mid % cols;
            if(tar == arr[midr][midc]) return true;
            else if(tar < arr[midr][midc] ) h=mid-1;
            else l=mid+1;


        }
       return false ;
    }
        
    
}