class Solution {
     public boolean isSpecil_char(char ch) {
        if (ch >= '0' && ch <='9') {
            return false;
        } else if (ch >= 'a' && ch <='z') {
            return false;
        } else {
            return true;
        }
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        
        int i = 0, j = s.length() - 1;
       
        if(i==j){
            return true;
        }
        while (i < j) {
           

            while (isSpecil_char(s.charAt(i))){
                i++;
                if(i>j){
                    return true;
                }

            }
            while (isSpecil_char(s.charAt(j))) {
                 j--;
                if(i>j){
                    return true;
                }

            }
            if (!(s.charAt(i) == s.charAt(j))) {
                return false;

            }
            i++;
            j--;
        }
        if (j <= i) {
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Solution vp=new Solution();
        String s="abc*BD";
        System.out.print(vp.isPalindrome(s));
    }
}