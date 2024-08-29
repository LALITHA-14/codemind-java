class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentNumberOfOnes = 0;
        int maxConsecOnes = 0;
        int i;
        for(i=0; i<nums.length; i++){
            if(nums[i]==1){
                currentNumberOfOnes++;
            }
            else{
                maxConsecOnes = Math.max(currentNumberOfOnes, maxConsecOnes);
                currentNumberOfOnes = 0;
            }
        }
        return Math.max(maxConsecOnes, currentNumberOfOnes);
    }
}
