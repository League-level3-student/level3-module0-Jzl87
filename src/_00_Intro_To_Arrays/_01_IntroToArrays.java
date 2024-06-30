package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String [] strs = {"hewwo", "mike", "bomb", "child", "car"};
        // 2. print the third element in the array
    	System.out.println(strs[3]);
        // 3. set the third element to a different value
    	strs[3] = "pemdas";
        // 4. print the third element again
    	System.out.println(strs[3]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for (int x = 0; x < strs.length; x++) {
    		strs[x] = "moldy bacon";
    	}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	for (String x : strs) {
    		System.out.println(x);
    	}
        // 7. make an array of 50 integers
    	int[] nums = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	Random ran  = new Random();
    	for (int x = 0; x < nums.length; x++) {
    		nums[x]= ran.nextInt();
    	}
    	 
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	int min = nums[0];
    	for (int x = 0; x < nums.length; x++) {
    		if (nums[x] < min) {
    			min = nums[x];
    		}
    	}
    	System.out.println(min);
        // 10 print the entire array to see if step 8 was correct
    	for (int num : nums) {
    	System.out.println(num);
    	}
        // 11. print the largest number in the array.
    	int max = nums[0];
    	for (int x = 0; x < nums.length; x++) {
    		if (nums[x] > max) {
    			max = nums[x];
    		}
    	}
    	System.out.println(max);
        // 12. print only the last element in the array
    	System.out.println(nums[nums.length - 1]);
    }
}
