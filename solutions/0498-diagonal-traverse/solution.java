class Solution {
   
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int idx = 0;

        for (int k = 0; k < m + n - 1; k++) {
            if (k % 2 == 0) {
                // Traverse upward
                for (int i = Math.min(k, m - 1); i >= 0; i--) {
                    int j = k - i;
                    if (j < n) {
                        result[idx++] = mat[i][j];
                    }
                }
            } else {
                // Traverse downward
                for (int j = Math.min(k, n - 1); j >= 0; j--) {
                    int i = k - j;
                    if (i < m) {
                        result[idx++] = mat[i][j];
                    }
                }
            }
        }

        return result;
    }
}

        
    

