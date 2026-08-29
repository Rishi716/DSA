class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {

            String newS = "";

            for (int i = 0; i < s.length(); i += k) {

                int sum = 0;

                for (int j = i; j < i + k && j < s.length(); j++) {
                    sum += s.charAt(j) - '0';
                }

                newS += sum;
            }

            s = newS;
        }

        return s;
    }
}