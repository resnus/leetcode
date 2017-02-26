package com.rensus.leetcode.zigzagconversion;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ZigZagConversionTest {
	private ZigZagConversion zz;
	
	@Before
	public void setUp(){
		this.zz = new ZigZagConversion(); 
	}
	
	@Test
	public void test0(){
		String s = "PAYPALISHIRING";
		int numRows = 3;
		String result = "PAHNAPLSIIGYIR";
		validate(s,numRows,result);
	}
	
	@Test
	public void test2(){
		String s = "GEEKSFORGEEKS";
		int numRows = 4;
		String result = "GOSEFRKESGEKE";
		validate(s,numRows,result);
	}
	
	@Test
	public void test3(){
		String s = "GEEKSFORGEEKS";
		int numRows = 5;
		String result = "GGEREEOEKFKSS";
		validate(s,numRows,result);
	}
	
	@Test
	public void test4(){
		String s = "E";
		int numRows = 5;
		String result = "E";
		validate(s,numRows,result);
	}
	
	@Test
	public void test5(){
		String s = "AB";
		int numRows = 1;
		String result = "AB";
		validate(s,numRows,result);
	}
	
	@Test
	public void test6(){
		String s = "pmlgymhkdgjthnqflpvtpqodujingqnvcyeamlmruvndkfivufokvcpqoxfunsrptvshhgzbcogotpmlgymhkdgjthnqflpvtpqodujingqnvcyeamlmruvndkfivufokvcpqoxfunsrptvshhgzbcogotpmlgymhkdgjthnqflpvtpqodujingqnvcyeamlmruvndkfivufokvcpqoxfunsrptvshhgzbcogotpmlgymhkdgjthnqflpvtpqodujingqnvcyeamlmruvndkfivufokvcpqoxfunsrptvshhgzbcogotpmlgymhkdgjthnqflpvtpqodujingqnvcyeamlmruvndkfivufokvcpqoxfunsrptvshhgzbcogotpmlgymhkdgjthnqflpvtpqodujingqnvcyeamlmruvndkfivufokvcpqoxfunsrptvshhgzbcogot";
		int numRows = 53;
		String result = "pnpyvmigcqgmncljqvolhqygunkxmkgeydvofpdnamocfutgimhqyunojjlkpevsgtumdtairohdrgvmfpcnoujplktbqqvtlmdvzfpnhfrnsgltdnquvhhpvkqnvuhhvpffhnrgstliltdmzvpfvpjklbtqquvgfmcponftdiaordhopkvegsutkqhuyonjjvomfctuigcdyovpfndpugknmxgkqjlvqloqhoimcggqnmxnppnypvyfgtqimccguqoojhvylnngxukkemsvofddoaprccuogfmtpybnqjulotezsptvmgvagrthirosmhpvnfuchlhtpqkvbhmsvlfdnzgrvsflndgzuthqpvkhbvphnvufhcnrghtrisodsztpmvvgknbjqlutofucgomfptifoddaorvxgkueksuoohjyvnfqtmiccuoppynvpfkcmggnqxvlqo";
		validate(s,numRows,result);
	}
	
	private void validate(String input, int lines, String result){
		long start = System.currentTimeMillis();
		String s = zz.convert(input, lines);
		System.out.println("Runetime: " + (System.currentTimeMillis() - start) + "ms");
		assertTrue("Result is not what is expected: " + result + " returned: " + s, result.equals(s));
	}
	
}
