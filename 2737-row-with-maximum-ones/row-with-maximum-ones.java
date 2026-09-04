class Solution {
    public int[] rowAndMaximumOnes(int[][] arr) {
        int maxcnt=Integer.MIN_VALUE;
        int row= arr.length;
        int r=-1;
        int col=arr[0].length;
        for(int i=0;i<row;i++){
            int cnt=0;
            for(int j=0;j<col;j++){
                if(arr[i][j]==1) 
                cnt++;
                if(cnt>maxcnt){
                maxcnt=cnt;
                r=i;
                }

            }
        }
return new int[]{r, maxcnt};  
  }
}