/**
 * Problem Description :-
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 */

public class SearchInsertPosition {

        public int searchInsert(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;
            int mid;
            while(low<=high){
                mid = (low + high)/2;
                if(nums[mid] == target)
                    return mid;
                else if(nums[mid] < target)
                    low = mid + 1;
                else
                    high = mid - 1;
            }

            return low; //return low if the target value is not found
        }

}
