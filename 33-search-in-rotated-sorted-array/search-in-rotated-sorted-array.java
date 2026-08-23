class Solution {
    public int search(int[] arr, int tar) {
        int n= arr.length;
        int l=0,h=n-1;
        
        while(l<=h){
        int mid=l+(h-l)/2;
    if(arr[mid]==tar) return mid;
    else if (arr[l]<=arr[mid]){
          if(arr[l]<=tar && tar<arr[mid]) h=mid-1;
          else l=mid+1;
       }
    else {
         if(arr[mid]<tar && tar<=arr[h]) l=mid+1;
         else h= mid-1;
    }
    }
    return -1;
    }
    
  
}
