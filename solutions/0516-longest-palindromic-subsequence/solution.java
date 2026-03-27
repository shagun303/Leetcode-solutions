class Solution {
    public int longestPalindromeSubseq(String s) {
    int n = s.length();
    int LCS[][] = new int[n+1][n+1];
    String t = new StringBuilder(s).reverse().toString();

    for(int i = 1 ;i <= n;i++){
        for(int j = 1;j <= n;j++){
            if(s.charAt(i-1) == t.charAt(j-1)){
                LCS[i][j] = 1 + LCS[i-1][j-1];

            }
            else{
                LCS[i][j] = Math.max(LCS[i-1][j],LCS[i][j-1]);
            }
        }
    }return LCS[n][n];
    }
}
