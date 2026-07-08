class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer> map1 = new HashMap<>();
        
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i = 0;i < ransomNote.length();i++){
            map1.put(ransomNote.charAt(i),map1.getOrDefault(ransomNote.charAt(i),0)+1);

        }
        for(int i = 0;i < magazine.length();i++){
            map2.put(magazine.charAt(i),map2.getOrDefault(magazine.charAt(i),0)+1);
            
        }
        return isConstructed(map1,map2);


        
    }

    public boolean isConstructed( HashMap<Character,Integer> map1, HashMap<Character,Integer>map2){

   
        for(Character ch : map1.keySet()){
            if(map2.getOrDefault(ch, 0) < map1.get(ch)) {
                return false;
            }
        }
        return true;
    }
}
