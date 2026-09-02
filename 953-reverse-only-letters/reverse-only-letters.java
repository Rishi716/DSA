class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder();

        // collect all letters
        for (int i = 0; i < s.length(); i++)
            if (Character.isLetter(s.charAt(i)))
                sb.append(s.charAt(i));

        sb.reverse();

        // replace letters
        int j = 0;
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))
                ans += sb.charAt(j++);
            else
                ans += s.charAt(i);
        }

        return ans;
    }
}