class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
       int l=0,h=n-1;
       while(l<=h){
        int mid=(l+h)/2;
        int crctnum=mid+1;
        int missingnum = arr[mid]-crctnum;
        if(missingnum >= k) h=mid-1;
        else l=mid+1;
        
       }
       return h+1+k;

    }
}