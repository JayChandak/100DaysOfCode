class Solution {
    public boolean isPalindrome(int x) {        
        if(x < 0)
            return false;             
        int reversedNumber = 0, remainder;
        int temp = x;
        while(temp != 0){
            remainder = temp % 10;
            reversedNumber = reversedNumber *  10 + remainder;
            temp = temp/10;
        }
        boolean res = reversedNumber == x ? true : false;
        return res;
    }
}
