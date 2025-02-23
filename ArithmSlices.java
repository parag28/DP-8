// DP approach
// TC:SC: O(n)
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        //null case
        if(nums==null || nums.length==0) return 0;

        int n = nums.length;
        int dp[]= new int [n];
        int sum=0;

        for(int i=0,j=2;i<n-2 && j<n;i++, j++){
            if(nums[j]-nums[j-1]== nums[i+1]-nums[i])
            {
                dp[j]= dp[j-1]+1;
                sum+= dp[j];
            }
        }
        return sum;
    }
}
