class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int uppercase = 0;

        for(int i = 0;i < n;i++){
            if(Character.isUpperCase(word.charAt(i))){
                uppercase++;
            }
        }
        return uppercase == n ||uppercase == 0 || (uppercase == 1 && Character.isUpperCase(word.charAt(0)));
        
    }
}
