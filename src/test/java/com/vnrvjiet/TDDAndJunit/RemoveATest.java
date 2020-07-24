package com.vnrvjiet.TDDAndJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveATest {
	RemoveA removeA;
	@BeforeEach
	void setup()
	{
		RemoveA removeA=new RemoveA();
	}
	@Test
	void remove1A() {
		
		String actual=RemoveA.manipulate("ABCD");
		assertEquals("BCD",actual);
	}
	
	@Test
	void remove2A() {
		
		String actual=RemoveA.manipulate("AACD");
		assertEquals("CD",actual);
	}
	@Test
	void removesecondA() {
	
		String actual=RemoveA.manipulate("BACD");
		assertEquals("BCD",actual);
	}
	@Test
	void removeA() {
		
		String actual=RemoveA.manipulate("BBAA");
		assertEquals("BBAA",actual);
	}
	@Test
	void removeA2() {
	
		String actual=RemoveA.manipulate("AABAA");
		assertEquals("BAA",actual);
	}
	@Test
	void removeSingleA() {
		
		String actual=RemoveA.manipulate("A");
		assertEquals("",actual);
	}
	@Test
	void removeDoubleA() {
		
		String actual=RemoveA.manipulate("AA");
		assertEquals("",actual);
	}
	@Test
	void removeEmptyA() {
	
		String actual=RemoveA.manipulate("");
		assertEquals("",actual);
	}
}
