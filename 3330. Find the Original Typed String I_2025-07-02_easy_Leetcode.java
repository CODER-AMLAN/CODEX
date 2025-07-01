class Solution {
    public int possibleStringCount(String word) {
       int count = 1;
       char prev = word.charAt(0);
       for(int i=1;i<word.length();i++){
          if(prev == word.charAt(i)){
            count++;
          }
          else
            prev = word.charAt(i);
       }
       return count; 
    }
}