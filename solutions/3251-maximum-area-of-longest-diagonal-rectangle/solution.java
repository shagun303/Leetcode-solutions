public class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = 0;
        int maxArea = 0;

        for (int[] rect : dimensions) {
            int length = rect[0];
            int width = rect[1];
            double diagonal = Math.sqrt(length * length + width * width);
            int area = length * width;

            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
            } else if (diagonal == maxDiagonal) {
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
        public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] dimensions1 = {{9, 3}, {8, 6}};
        System.out.println("Output 1: " + sol.areaOfMaxDiagonal(dimensions1)); // Expected: 48

        int[][] dimensions2 = {{3, 4}, {4, 3}};
        System.out.println("Output 2: " + sol.areaOfMaxDiagonal(dimensions2)); // Expected: 12

        int[][] dimensions3 = {{5, 12}, {13, 5}};
        System.out.println("Output 3: " + sol.areaOfMaxDiagonal(dimensions3)); // Expected: 65
    }
}


