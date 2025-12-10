class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
       String[] words = s.split(" ");
       String temp = words[words.length -1];
       count = temp.length();
        return count;

    }
}
