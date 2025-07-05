class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty()){
            return 0;
        }
        int sign=1,start=0;
        if(s.charAt(start)=='-' || s.charAt(start)=='+'){
            sign = (s.charAt(start)=='-')?-1:1;
            start = 1;
        }
        long num = 0L;
        for(;start<s.length();start++){
            if(!Character.isDigit(s.charAt(start))){
                break;
            }
            num = num*10+s.charAt(start)-48;
            if(num*sign>=Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
            else if(num*sign<=Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
            }
        }
        return sign*(int)num;                
    }
}