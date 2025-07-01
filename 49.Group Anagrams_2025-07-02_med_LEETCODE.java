class Solution {
    public String generateKey(String str){
       int[]arr = new int[26];
       for(char ch:str.toCharArray()){
         arr[ch-'a']++;
       }
       return Arrays.toString(arr);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){return new ArrayList<>();}
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            String key = generateKey(str);
            if(map.containsKey(key)){
                map.get(key).add(str);
            }
            else{
                List<String> lst = new ArrayList<>();
                lst.add(str);
                map.put(key,lst);
            }
        }
        return new ArrayList<>(map.values());        
    }
}