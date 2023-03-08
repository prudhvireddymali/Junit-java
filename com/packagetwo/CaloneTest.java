package com.packagetwo;
import com.packageone.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaloneTest {
	Calone cal;

	@Test
	public void testAddition() {
		 cal=new Calone();
		 int actual=cal.Addition(10, 30);
		 int expected=40;
		 assertEquals(actual, expected);
		 
		 
		
	}

	@Test
	public void testMultiplication() {
		cal=new Calone();
		 int actual=cal.Multiplication(10, 30);
		 int expected=300;
		 assertEquals(actual, expected);
		 
		
	}

}
