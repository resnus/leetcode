package com.rensus.leetcode.problem12;

/**
 * Given an integer, convert it to a roman numeral.
 * 
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 * 
 * Symbol I V X L C D M 
 * Value 1 5 10 50 100 500 1,000
 * 
 * @author resnus
 *
 */
public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String intToRoman(int num) {
		// 1 to 3999
		if (num > 3999 || num <= 0) {
			return null; // edge case
		}

		String[] values = {"I", "V",  "X",  "L", "C", "D", "M"};
		//int[] increments = {1,    5,   10,   50, 100, 500, 1000};
		StringBuilder sb = new StringBuilder(); // Result

		int pos = 0;
		while(num != 0){
			//System.out.println(increments[i] + "=" + values[i]);
			int d = num % 10;
			
			if(d == 9){
				sb.append(values[pos+2]);
				sb.append(values[pos]);
			}else if(d == 4){
				sb.append(values[pos+1]);
				sb.append(values[pos]);
			}else if(d == 5){
				sb.append(values[pos+1]);
			}else if(d != 0){
				int y = d % 5;
				for(int i = 0; i < y; i++){
					sb.append(values[pos]);
				}
				 if(d > 5){
						sb.append(values[pos+1]);
				 }
			}
			pos += 2;
			num /= 10;
		}
		
		return sb.reverse().toString();
	}
}
