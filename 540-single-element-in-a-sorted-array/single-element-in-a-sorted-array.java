class Solution {
    public int singleNonDuplicate(int[] arr) {
        int l=0;
        int n=arr.length; 
        int h=n-1;
      
        if( n==1) return arr[0];
         if( arr[0] != arr[1]) return arr[0];
        if (arr [n-1] != arr[n-2]) return arr[n-1];
      

        while (l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1] ) return arr[mid];
            int f=mid,s=mid;
           if(arr[mid-1] == arr[mid])
           { f=mid-1; }        
               else {
                s=mid+1;}
          int LeftElem=f-l;
          int RightElem=h-s;
            if(RightElem %2==0) h=f-1;
         else l=s+1;
            
        }  return -1;
    } 
}