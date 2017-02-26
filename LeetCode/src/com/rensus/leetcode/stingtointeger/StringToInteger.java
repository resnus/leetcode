package com.rensus.leetcode.stingtointeger;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(Integer.MAX_VALUE);
		// System.out.println(Integer.MIN_VALUE);
		StringToInteger sti = new StringToInteger();
		//String str = "-2147483649asfdkjsflakjsdflkjasdlfkja;ldjsf;lajsdfkljasdlfkjla;sjdfasdfasfdkjsflakjsdflkjasdlfkja;ldjsf;lajsdfkljasdlfkjla;sjdfasdfas1245125341253fdkjsflakjsdflkjasdlfkja;ldjsf;lajsdfkljasdlfkjla;sj1231245dfasdfasfdkjsflakjsdflkjasdlfkja;ldjsf;lajsdfkljasdlfkjla;sjdfasdf12341234"; // MIN_INT
		String str = "-123alswdfjalsdkfjasdf";
		int i = sti.myAtoi(str);
		System.out.println("result:" + i);
	}

	/**
	 * The function first discards as many whitespace characters as necessary
	 * until the first non-whitespace character is found. Then, starting from
	 * this character, takes an optional initial plus or minus sign followed by
	 * as many numerical digits as possible, and interprets them as a numerical
	 * value.
	 * 
	 * The string can contain additional characters after those that form the
	 * integral number, which are ignored and have no effect on the behavior of
	 * this function.
	 * 
	 * If the first sequence of non-whitespace characters in str is not a valid
	 * integral number, or if no such sequence exists because either str is
	 * empty or it contains only whitespace characters, no conversion is
	 * performed.
	 * 
	 * If no valid conversion could be performed, a zero value is returned. If
	 * the correct value is out of the range of representable values, INT_MAX
	 * (2147483647) or INT_MIN (-2147483648) is returned.
	 * 
	 * @param str
	 * @return
	 */
	public int myAtoi(String str) {
		// System.out.println(str);
		StringBuilder sb = new StringBuilder(str.trim());
		if (str.length() == 0)
			return 0;
		
		boolean negate = false;
		char first = sb.charAt(0);
		if (first == '-'){
			negate = true;
			sb.deleteCharAt(0);	
		}else if(first == '+'){
			sb.deleteCharAt(0);
		}
		
		long result = 0;
		
		for (int c : sb.toString().toCharArray()) {
			int i = Character.getNumericValue(c);
			if (i < 0 || i > 9) {
				break; // Not valid digit, out of the loop
			}
			// System.out.println("i=" + i);
			result = (result * 10 + i); // shift position, add
			// System.out.println("result=" +result);

			if (result > Integer.MAX_VALUE) {
				if (negate) {
					result *= -1;
					if (result < Integer.MIN_VALUE)
						return Integer.MIN_VALUE;
					else
						continue;
				}
				return Integer.MAX_VALUE;
			}

		}

		if (negate) {
			result *= -1;
		}

		// System.out.println("Before final check: " + result);

		return (int) result;
	}

	// public int myAtoi(String str) {
	// String s = str.trim(); // Remove white-space
	// if(s.length() == 0) return 0;
	//
	// final StringBuilder sb = new StringBuilder();
	// if(str.charAt(0) == '-'){
	// sb.append("-");
	// }
	//
	// s.chars()
	// .map(c -> Character.getNumericValue(c))
	// .filter(c -> c >= 0 && c <= 9)
	// .forEach(c -> sb.append(c));
	//
	// long result = 0;
	//
	// return 0;
	// }

}
