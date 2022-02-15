import java.util.Arrays;

/**
 * Problem Description :-
 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
 *
 * Return the sum of the three integers.
 *
 */


public class ThreeSumClosest {

        public int threeSumClosest(int[] nums, int target) {
            int result = nums[0] + nums[1] + nums[2];

            Arrays.sort(nums);
            for(int i=0;i<nums.length-2;i++){
                int left = i + 1;
                int right = nums.length - 1;

                while(left < right){
                    int current_sum = nums[i] + nums[left] + nums[right];
                    if(current_sum > target)
                        right--;
                    else
                        left++;

                    if(Math.abs(current_sum - target) < Math.abs(result - target)){
                        result = current_sum;
                    }
                }
            }

            return result;

        }

}
