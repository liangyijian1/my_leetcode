import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int turn_tag = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] copy = new int[row][col];
        List<Integer> ret = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < row && j < col && copy[i][j] != 1) {
            switch (turn_tag) {
                case 0:
                    if (copy[i][j] == 0) {
                        ret.add(matrix[i][j]);
                        copy[i][j] = 1;
                    }
                    if (j == col - 1 || copy[i][j + 1] == 1) {
                        turn_tag++;
                        i++;
                        break;
                    }
                    j++;
                    break;
                case 1:
                    if (copy[i][j] == 0) {
                        ret.add(matrix[i][j]);
                        copy[i][j] = 1;
                    }
                    if (i == row - 1 || copy[i + 1][j] == 1) {
                        turn_tag++;
                        j--;
                        break;
                    }
                    i++;
                    break;
                case 2:
                    if (copy[i][j] == 0) {
                        ret.add(matrix[i][j]);
                        copy[i][j] = 1;
                    }
                    if (j == 0 || copy[i][j - 1] == 1) {
                        turn_tag++;
                        i--;
                        break;
                    }
                    j--;
                    break;
                case 3:
                    if (copy[i][j] == 0) {
                        ret.add(matrix[i][j]);
                        copy[i][j] = 1;
                    }
                    if (i == 0 || copy[i - 1][j] == 1) {
                        turn_tag++;
                        j++;
                        break;
                    }
                    i--;
                    break;
                default:
                    turn_tag = 0;
                    break;
            }
            if (i < 0 || j < 0) {
                break;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        //1 2 3 6 9 8 7 4 5
        // int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix ={{3}, {2}};
        new Solution().spiralOrder(matrix);
    }
}
// @lc code=end

