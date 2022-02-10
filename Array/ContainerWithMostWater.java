/**
 * Problem Description :-
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints
 * of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 */


public class ContainerWithMostWater {

        public int maxArea(int[] height) {
            int i = 0;
            int j = height.length -1 ;
            int maxArea = 0;
            while(i!=j){
                int w = j - i;
                int h = Math.min(height[i] , height[j]);
                int area = h * w;
                /**
                 * counter should be incremented or decremented only if the height of the line is less than the other one
                 * , it opens up the possibility of next line to be greater than the water capacity might increase or else if
                 * height is lower it might result in decrement, but if any greater height line is decremented it will
                 * surely decrease the water capacity as only the minimum height is taken into account while calculating
                 * the water capacity.
                 *
                 */

                if(height[i] <  height[j]){
                    i++;
                }else{
                    j--;
                }

                if(area > maxArea){
                    maxArea = area;
                }


            }

            return maxArea;
        }

}
