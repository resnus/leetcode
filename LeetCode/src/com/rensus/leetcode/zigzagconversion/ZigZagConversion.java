package com.rensus.leetcode.zigzagconversion;

import java.util.Stack;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
 * of rows like this: (you may want to display this pattern in a fixed font for
 * better legibility)
 * 
 * P A H N A P L S I I G Y I R
 * 
 * And then read line by line: "PAHN APLSIIG YIR" Write the code that will take
 * a string and make this conversion given a number of rows:
 * 
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * 
 * Input: str = "ABCDEFGH" n = 2 Output: "ACEGBDFH" Explanation: Let us write
 * input string in Zig-Zag fashion in 2 rows. A C E G B D F H Now concatenate
 * the two rows and ignore spaces in every row. We get "ACEGBDFH"
 * 
 * Input: str = "GEEKSFORGEEKS" n = 3 Output: GSGSEKFREKEOE Explanation: Let us
 * write input string in Zig-Zag fashion in 3 rows. G S G S E K F R E K E O E
 * Now concatenate the two rows and ignore spaces in every row. We get
 * "GSGSEKFREKEOE"
 * 
 * @author resnus
 *
 */

public class ZigZagConversion {

	public static void main(String[] args) {
		ZigZagConversion zz = new ZigZagConversion();
		String s = "PAYPALISHIRING";
		int numRows = 3;
		String r = zz.convert(s, numRows);
		System.out.println("RESULT: " + r);

	}

	public String convert(String s, int numRows) {
		if (numRows == 1)
			return s;
		char[][] result = new char[numRows][s.length()];
		
		boolean down = true;
		int row = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			result[row][i] = c;
			if (row == numRows - 1) {
				down = false;
			} else if (row == 0 && !down) {
				down = true;
			}

			if (down){
				row++;
			}else{
				row--;
			}

		}

		StringBuilder sb = new StringBuilder();
		for (int x = 0; x < numRows; x++) {
			for (int y = 0; y < s.length(); y++) {
				char c = result[x][y];
				if (c != 0) {
					sb.append(c);
				}
				//System.out.print(c);
			}
			//System.out.println();
		}
		return sb.toString();
	}

}
