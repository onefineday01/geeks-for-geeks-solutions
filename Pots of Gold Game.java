/*

Problem Name : Pots of Gold Game

Link : https://practice.geeksforgeeks.org/problems/pots-of-gold-game/0

*/


class GfG
{
	static int dp[][];

	public static int maxCoins(int A[],int n)
	{
		dp = new int[n][n];
		for(int i = 0 ; i < n; i++) {
			Arrays.fill(dp[i], -1);
		}
        return gameTheory(A, 0, n-1);
    }

	static int gameTheory(int arr[], int i, int j) {
		if(dp[i][j] != -1) return dp[i][j];
		if( i == j) {
			dp[i][j] = arr[i];
		} else if(j - i == 1) {
			dp[i][j] = Math.max(arr[i], arr[j]);
		} else {
			dp[i][j] = Math.max( 
				(arr[i] + Math.min( gameTheory(arr, i + 2, j), gameTheory(arr, i + 1, j - 1))) ,
				(arr[j] + Math.min( gameTheory(arr, i, j - 2), gameTheory(arr, i + 1, j - 1))) 
			);
		}
		return dp[i][j];
	}

}