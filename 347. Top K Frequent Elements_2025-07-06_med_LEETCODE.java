class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k==nums.length){
            return nums;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        PriorityQueue<Integer> q = new PriorityQueue<>(
            (a,b)->map.get(a)-map.get(b)
        );
        for(int n:map.keySet()){
            q.add(n);
            if(q.size()>k){
                q.poll();
            }
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = q.poll();
        }
        return ans;

    }
}