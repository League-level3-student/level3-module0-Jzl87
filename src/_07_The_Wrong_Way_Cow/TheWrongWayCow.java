/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

import java.util.ArrayList;

public class TheWrongWayCow {

	static int upCow = 0;
	static int downCow = 0;
	static int leftCow = 0;
	static int rightCow = 0;

	public static int[] findWrongWayCow(final char[][] field) {
		// Fill in the code to return the [col, row] coordinate position of the
		// head (letter 'c') of the wrong way cow!

		upCow = 0;
		downCow = 0;
		leftCow = 0;
		rightCow = 0;

		int[] resultArray = new int[2];
		int wrongWay;
		ArrayList<Integer> cowDir = new ArrayList<Integer>();

		for (int y = 0; y < field.length; y++) {
			for (int x = 0; x < field[y].length; x++) {
				if (field[x][y] == 'c') {
					if (checkCow(field, x, y) != -1) {
						cowDir.add(checkCow(field, x, y));

					}
				}
			}
		}

		if (upCow == 1) {
			wrongWay = 0;
		} else if (downCow == 1) {
			wrongWay = 1;
		} else if (leftCow == 1) {
			wrongWay = 2;
		} else if (rightCow == 1) {
			wrongWay = 3;
		} else {
			wrongWay = -1;
		}
		
		for (int y = 0; y < field.length; y++) {
			for (int x = 0; x < field[y].length; x++) {
				if (field[x][y] == 'c' && checkCow(field, x, y) == wrongWay) {
					resultArray[1] = x;
					resultArray[2] = y;
				}
			}
		}

		return resultArray;
	}

	public static int checkCow(char[][] field, int x, int y) {
		// 0 = up
		// 1 = down
		// 2 = left
		// 3 = right

		if (field[x][y + 1] == 'o') {
			if (field[x][y + 2] == 'w') {
				downCow++;
				return 1;

			}
		} else if (field[x][y - 1] == 'o') {
			if (field[x][y - 2] == 'w') {
				upCow++;
				return 0;
			}
		} else if (field[x + 1][y] == 'o') {
			if (field[x + 2][y] == 'w') {
				leftCow++;
				return 2;
			}
		} else if (field[x - 1][y] == 'o') {
			if (field[x - 2][y] == 'w') {
				rightCow++;
				return 3;
			}
		}

		return -1;
	}
}
