package edu.disease.asn5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;


class ContainerTest<T> {
	
	List<T> t;
	Container<T> c = new Container("Ben",new String());
	
	@Test
	void testContainer() {
		
		assertThrows(IllegalArgumentException.class, ()->new Container<T>() );
	}

	@Test
	void testSize() {		
		assertEquals(2, c.size());
	}

	@Test
	void testGet() {
		assertEquals("Ben", c.get(0));
	}
	@Test
	void testGet1() {
		assertThrows(IllegalArgumentException.class, ()-> c.get(3));
	}
}
