int missingNumber(int* nums, int numsSize)
{
    int s = numsSize * (numsSize + 1) / 2;
    int sum = 0;
    for (int i = 0; i < numsSize; i++) {
        sum += nums[i];
    }
    return s-sum;
}