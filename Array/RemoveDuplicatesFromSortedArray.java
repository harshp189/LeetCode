/**
 * Problem Description :-
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique
 * element appears only once. The relative order of the elements should be kept the same.
 * Return k after placing the final result in the first k slots of nums.
 *
 */

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int counter = 1; // counter is 1 because the first element is always unique, we want to start putting other numbers from in index = 1 and so on

        for(int i=0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                nums[counter] = nums[i+1];
                counter++;
            }
        }

        return counter;
    }
}
