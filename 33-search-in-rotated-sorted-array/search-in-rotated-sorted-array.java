class Solution {
    public int search(int[] arr, int target) {
        int n= arr.length;
        int pivot =0;
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) pivot=i;
        }
    
     int l=0,h=pivot ;
    
        while(l<=h){
            int mid= (l+h)/2;
            if(target < arr[mid]) h=mid-1;
                  else  if(target == arr[mid]) 
                     return mid;
    
            else l=mid+1;

        } 
          l=pivot+1
          ;h=n-1 ;
    
        while(l<=h){
            int mid= (l+h)/2;
            if(target <arr[mid]) 
                h=mid-1;
            else if (target > arr[mid])  l=mid+1;
            else return mid;
        } 
        return -1;
    }
}
