class Solution {
    public void moveZeroes(int[] nums)
    {
        int count=0;
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            
            if(nums[i]==0)
            {
                count++;
            }
            else
            {
                li.add(nums[i]);
            }
        }
        for(int j=0;j<count;j++)
        {
            li.add(0);
        }
        for(int i = 0; i < nums.length; i++) 
        {
             nums[i] = li.get(i);
        }
    }
}