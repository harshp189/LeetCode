/**
 * Problem Description :-
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int solution[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                solution[0] = i;
                solution[1] = j;
                }
            }
        }

        return solution;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int nums[] = {2,7,11,15};
        int target = 9;
        int solution[] = new int[nums.length];
        solution = ts.twoSum(nums,target);
        for(int i=0;i< solution.length;i++){
            System.out.print(solution[i] + " ");
        }

    }
}




