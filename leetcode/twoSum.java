int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
  int *arr = malloc(2*sizeof(int));
  int i,j;
  *returnSize=2;
  for(i=0;i<numsSize;i++)
  {
    for(j=i+1;j<numsSize;j++)
    {
        if((nums[i]+nums[j])==target)
        {
          arr[0] = i;
          arr[1] = j;
            
        }        
    }
  }
  return arr;
}