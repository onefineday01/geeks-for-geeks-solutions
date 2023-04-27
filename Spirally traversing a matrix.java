/*

Problem Name : Spirally traversing a matrix

Link : https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/0

*/


class Solution {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int count = r * c, operation = 0, left = 0, top = 0, right = c-1, bottom = r-1; 
        while(count > 0) {
            operation++;
            switch (operation) {
                case 1 :
                    for(int i = left; i <= right; i++){
                        count--;
                        result.add(matrix[top][i]);
                    }
                    top++;
                    break;
                case 2 :
                    for(int i = top; i <= bottom; i++){
                        count--;
                        result.add(matrix[i][right]);
                    }
                    right--;
                    break;
                case 3 :
                    for(int i = right; i >= left; i--){
                        count--;
                        result.add(matrix[bottom][i]);
                    }
                    bottom--;
                    break;
                case 4 :
                    for(int i = bottom; i >= top; i--){
                        count--;
                        result.add(matrix[i][left]);
                    }
                    left++;
                    operation = 0;
                    break;
            }
        }
        return result;
    }
}