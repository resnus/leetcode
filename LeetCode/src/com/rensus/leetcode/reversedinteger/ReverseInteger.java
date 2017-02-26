package com.rensus.leetcode.reversedinteger;

/**
 * 1000000003
 *  
 * @author resnus
 *
 */
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Integer.MAX_VALUE
		ReverseInteger ri = new ReverseInteger();
		int i  = ri.reverse(-100);
		System.out.println(i);
	}

	public int reverse(int x) {
		int result;
		StringBuilder sb = new StringBuilder(String.valueOf(x));
		if(sb.length() <= 0 ) return x;
		
		if(sb.charAt(0) == '-'){
			sb.deleteCharAt(0);
			sb.append('-');
		}
		
		try {
			result = Integer.valueOf(sb.reverse().toString());
		}catch(NumberFormatException ne){
			return 0;
		}
		//System.out.println(sb.toString());
		return result;
	}
	
//	public int reverse(int x) {
//		if(x > Integer.MAX_VALUE || x <= Integer.MIN_VALUE)
//			return 0;
//		
//		int y = x;
//		int z = 0;
//		
//		do{
//			int temp = y % 10;
//			y = y/10;
//			z = z*10 + temp;
//			//System.out.println("x=" + x + " temp=" + temp + " y=" + y + " z=" + z);
//			
//		}while(y != 0);
//		
//		if(z > Integer.MAX_VALUE) return 0;
//		return z;
//	}

}
