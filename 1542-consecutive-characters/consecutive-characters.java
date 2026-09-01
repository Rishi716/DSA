class Solution {
    public int maxPower(String s) {
        int n= s.length();
        char ans =s.charAt(0);
        int maxcnt= -1;
                for(int i=0; i<n;i++){
                  int cnt=1;
                  char ch=s.charAt(i); // uss substring of store kr rhe hai.
                  for(int j=i+1;j<n;j++){
                     if(s.charAt(i)==s.charAt(j)) cnt++;
                     else break;
                  }
                  if (cnt>maxcnt) {
                    maxcnt=cnt;
                    ans=ch;
                  }
                  else if (cnt==maxcnt && ch<ans)
                  ans=ch;

 
        } return maxcnt;
    }
}