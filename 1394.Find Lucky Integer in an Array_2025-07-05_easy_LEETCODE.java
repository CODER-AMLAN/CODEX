class Solution {
    public int findLucky(int[] arr) {
       int[]nums = new int [501];
       for(int x:arr){
         nums[x]++;
       }
       int ans=-1;
       for(int i=1;i<=500;i++){
          if(nums[i]==i){
            ans = nums[i];
          }
       }
       return ans;
    }
}