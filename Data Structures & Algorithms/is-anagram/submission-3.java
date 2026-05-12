class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c, 1);
            }
            else{
                int n = map.get(c);
                map.put(c, n+1);
            }
        }

        for(char c : t.toCharArray()){
            if((!map.containsKey(c))){
                return false;
            }
            else{
                int n = map.get(c);
                map.put(c, n-1);
            }
        }

        for(int val : map.values()){
            if(val != 0){
                return false;
            }
        }

        return true;
    }
}
