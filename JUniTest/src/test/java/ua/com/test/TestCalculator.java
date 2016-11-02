package ua.com.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ua.com.lesson.Calculator;

public class TestCalculator {
	
	private static Calculator calculator;
	
	@BeforeClass
	public static void init(){
		calculator= new Calculator();
	}
	
	@AfterClass
	public static void destroy(){
		calculator = null;
	}

	
	@Test
	public void testAdd(){
		
		int expected = calculator.add(5, 5);
		int real = 10;
		
		Assert.assertEquals(expected, real);
	}
		
	@Test
	public void testSustruct(){
		Assert.assertEquals(calculator.substract(5, 2),3.0989, 0.1);
	}
		
	
	@Test
	public void testMultiply(){
		int expected = calculator.multiply(2, 2);
		int real = 4;
		Assert.assertEquals(expected, real);
	}
	
	@Test
	public void testDevide(){
		Assert.assertEquals(calculator.devide(3, 2), 1, 0.5);
	}

	@Before
	public void before(){
		System.out.println("before");
	}

}

