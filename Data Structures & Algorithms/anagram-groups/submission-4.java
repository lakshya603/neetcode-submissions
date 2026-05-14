class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> res =  new HashMap<>();

        for(String s : strs){
            int[] arr = new int[26];

            for(char c : s.toCharArray()){
                arr[c - 'a'] += 1;
            }
            String key = Arrays.toString(arr);

            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);

        }
        return new ArrayList<>(res.values());



    }
}
