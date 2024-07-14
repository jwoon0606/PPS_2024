package week2;

public class A013_20240714 {
    public int singleNumber(int[] nums) {
        int n = nums[0];
        for(int i = 1 ;i < nums.length; i++){
            n ^= nums[i];
        }
        return n;
    }
}