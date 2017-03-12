package com.rensus.leetcode.problem11;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point
 * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
 * of line i is at (i, ai) and (i, 0). Find two lines, which together with
 * x-axis forms a container, such that the container contains the most water.
 * 
 * Note: You may not slant the container and n is at least 2.
 * 
 * @author resnus
 *
 */

public class ContainerWithMostWaterTest {

	private ContainerWithMostWater containerWithMostWater;
	private int[] columns11;
	
	@Before
	public void setUp(){
		//System.out.println("===> SETUP");
		containerWithMostWater = new ContainerWithMostWater();
	}
	
	@Test
	public void test0(){
		int[] columns = {1,1};
		check(columns, 1);
	}
	
	@Test
	public void test1(){
		int[] columns = {4,1,1,1,4};
		check(columns, 16);
	}

	@Test
	public void test2(){
		int[] columns = {4,1,1,5,1,1,4};
		check(columns, 24);
	}

	@Test
	public void test3(){
		int[] columns = {1,6,8,7,4,2,1,1,1,1,1,1,1,1,1,1,1,1};
		check(columns, 17);
	}
	
	@Test
	public void test4(){
		int[] columns = {1,6,8,7,20,2,1,1,23,1,1,1,1,1,1,1,1,1};
		check(columns, 80);
	}
	
	@Test
	public void test5(){
		int[] columns = {3,6,8,7,20,2,1,1,23,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3};
		check(columns, 96);
	}
	
	@Test(timeout=100)
	public void test6(){
		final int SIZE = 10001;
		int[] columns = new int[SIZE];
		for(int i = 0; i < SIZE; i++){
			columns[i] = SIZE-1;
		}
		check(columns, 100000000);
	}
	
	
	@Test(timeout=20)
	public void test7(){
		final int SIZE = 100001;
		int[] columns = new int[SIZE];
		for(int i = 0; i < SIZE; i++){
			columns[i] = 2;
		}
		check(columns, 200000);
	}
	
	@Test(timeout=300)
	public void test8(){
		final int SIZE = 100000001;
		int[] columns = new int[SIZE];
		for(int i = 0; i < SIZE; i++){
			columns[i] = 2;
		}
		check(columns, 200000000);
	}
	
	@Test(timeout=300)
	public void test9(){
		final int SIZE = 100000001;
		int[] columns = new int[SIZE];
		for(int i = 0; i < SIZE; i++){
			columns[i] = 999;
		}
		check(columns, 2147483616);
	}
	
	@Test(timeout=300)
	public void test91(){
		int[] columns11 = readArrayFromFile("data_test_case_11.txt");
		check(columns11, 56250000);
	}
	
	
	
	private  void check(int[] columns, int result){
		long start = System.currentTimeMillis();
		int area = this.containerWithMostWater.maxArea(columns);
		assertTrue("unexpected result! " + area + " != " + result,
				result == area);
		System.out.println("Runetime: " + (System.currentTimeMillis() - start) + "ms");
	}
	
	private int[] readArrayFromFile(String fileName){
		int values[] = null;
		try (Stream<String> stream = Files.lines(Paths.get(getClass().getResource(fileName).toURI()))) {
			values = stream.flatMap(s -> Arrays.stream(s.split(",")))
				.mapToInt(i -> Integer.valueOf(i))
				.toArray();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return values;
	}
	
}
