package com.wantoper.DP;

public class LeetCode_62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }

    public static int uniquePaths(int m, int n) {
        int[][] ints = new int[m+1][n+1];
        ints[0][1]=1;
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=n; j++) {
                ints[i][j]=ints[i-1][j]+ints[i][j-1];
            }
        }
        return ints[m][n];
    }
}
