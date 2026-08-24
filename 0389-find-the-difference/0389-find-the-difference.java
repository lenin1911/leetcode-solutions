class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer>m=new HashMap<>();
        for(char c:s.toCharArray()) m.put(c,m.getOrDefault(c,0)+1);
        for(char c:t.toCharArray()){ m.put(c,m.getOrDefault(c,0)-1);
        if(m.get(c)<0) return c;}
        return ' ';
    }
}