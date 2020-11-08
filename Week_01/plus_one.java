class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[0] == 0) {
            digits[digits.length-1]++;
            return digits;
        }
        boolean flag = true;
        for ( int i =digits.length-1 ; i >= 0 ; i--) {
            if (flag){
                if (digits[i] == 9){
                    digits[i] = 0;

                } else {
                    digits[i]++;
                    break;
                }
            }
        }
        if (digits[0] == 0) {
            digits = new int[digits.length+1];
            digits[0]++;
        }
        return digits;
    }
}