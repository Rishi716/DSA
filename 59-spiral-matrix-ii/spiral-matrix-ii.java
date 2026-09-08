class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr= new int [n][n];
        int num=1;
        int fr=0;
        int lr=n-1;
        int fc=0,lc=n-1;
        while (fr<=lr && fc<= lc){
            //right
            for(int j=fc; j<=lc ;j++){
                arr[fr][j] =num++;
            }
            fr++;
            if(fr>lr || fc> lc) break;
            // down
            for(int i=fr; i<=lr ;i++){
               arr[i][lc]=num++;
            }
            lc--;
            if(fr>lr || fc> lc) break;

            //left
            for(int j=lc; j>=fc ;j--){
              arr[lr][j] = num++;
            }
            lr--;
               if(fr>lr || fc> lc) break;
            // up
            for(int i=lr; i>=fr ;i--){
            arr[i][fc]= num++;
            }
            fc++;
            

        }
        return arr;
    }
}