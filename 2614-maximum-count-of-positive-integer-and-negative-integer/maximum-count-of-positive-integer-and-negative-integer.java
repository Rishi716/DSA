class Solution {
    public int maximumCount(int[] arr) {
        int pos=0,neg=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0) pos++;
            else if(arr[i]<0) neg++;
            
        }
        if(pos>neg) return pos;
        else return neg;
    }
}