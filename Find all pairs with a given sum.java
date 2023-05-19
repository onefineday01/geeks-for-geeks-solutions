/*

Problem Name : Find all pairs with a given sum

Link : https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1

*/


class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        HashSet<Long> match = new HashSet<>();
        HashSet<Long> setB = new HashSet<>();
        ArrayList<pair> ans = new ArrayList<>();
        for(long val : B) {
            setB.add(val);
        }
        Arrays.sort(A);
        for(long val : A) {
            if(match.add(val)) {
                if(setB.contains(X-val)) {
                    ans.add(new pair(val, X-val));
                }
            }
        }
        pair res[] = new pair[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}