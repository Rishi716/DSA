class Solution {
    public int maximumCount(int[] arr) {
        int pos=0,neg=0;
        int n=arr.length;
        int l=0,h=n-1;
       while(l<=h){
        int mid=l+(h-l)/2;
        if(arr[mid]>=0) h=mid-1;
        else {
            l=mid+1;
            } 
       }
            neg=l;
       
         l=0;
         h=n-1;
        while(l<=h){
    int mid=l+(h-l)/2;
        if(arr[mid]<=0) l=mid+1;
        else {
            h=mid-1;
            } 
           pos=n-l;
       } 
         return Math.max(pos, neg);
    }
   
}