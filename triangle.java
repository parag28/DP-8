// TC: O(m x n)
// SC: O(1)
// DP
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle==null || triangle.size()==0|| triangle.get(0).size()==0) return 0;

        int n= triangle.size();
        //bottom up
        for(int i=n-2; i>=0;i--){
            for(int j=0; j<=i; j++){    //i+1 = triangle.get(i).size()
                triangle.get(i).set(j, triangle.get(i).get(j)
                + Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1)));
            }
        }

        return triangle.get(0).get(0);
    }
}
