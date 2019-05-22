package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		int[] memes = {1, 2, 3, 4, 5};
		//2. print the third element in the array
		System.out.println(memes[2]);
		//3. set the third element to a different value
		memes[2] = 8; 
		//4. print the third element again
		System.out.println(memes[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
	for(int i=0;i<memes.length;i++) {
			System.out.println(memes[i]);
		}
		
		//6. make an array of 50 integers
	int nums[] = new int[50];
		//7. use a for loop to make every value of the integer array a random number
	int min =nums[0];
	for(int i=0; i<nums.length; i++) {
		Random rand = new Random(nums.length);
		nums[i] = rand.nextInt(nums.length);
		if(min>nums[i]) min=nums[i];
		System.out.println(nums[i]);
	}
		//8. without printing the entire array, print only the smallest number in the array
		
	//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
