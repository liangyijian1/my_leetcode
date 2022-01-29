/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int turn_tag = 0;
        int row, col;
        col = row = n;
        int[][] copy = new int[row][col];
        int i, j, value;
        i = j = 0;
        value = 1;
        while (i < row && j < col && copy[i][j] == 0) {
            if (turn_tag > 3) {
                turn_tag = 0;
                continue;
            }
            switch (turn_tag) {
                case 0:
                    if (copy[i][j] == 0) {
                        copy[i][j] = value;
                    }
                    if (j == col - 1 || copy[i][j + 1] != 0) {
                        turn_tag++;
                        i++;
                        break;
                    }
                    j++;
                    break;

                case 1:
                    if (copy[i][j] == 0) {
                        copy[i][j] = value;
                    }
                    if (i == row - 1 || copy[i + 1][j] != 0) {
                        turn_tag++;
                        j--;
                        break;
                    }
                    i++;
                    break;

                case 2:
                    if (copy[i][j] == 0) {
                        copy[i][j] = value;
                    }
                    if (j == 0 || copy[i][j - 1] != 0) {
                        turn_tag++;
                        i--;
                        break;
                    }
                    j--;
                    break;

                case 3:
                    if (copy[i][j] == 0) {
                        copy[i][j] = value;
                    }
                    if (i == 0 || copy[i - 1][j] != 0) {
                        turn_tag++;
                        j++;
                        break;
                    }
                    i--;
                    break;
            
                default:
                    break;
            }
            if (value < n * n) {
                value++; 
            }
            if (i < 0 || j < 0 || value > n * n) {
                break;
            }
        }
        return copy;
    }

    public static void main(String[] args) {
        int n = 4;
        new Solution().generateMatrix(n);
    }
}
// @lc code=end

