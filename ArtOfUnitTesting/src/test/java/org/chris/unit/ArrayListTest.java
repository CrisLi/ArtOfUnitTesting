package org.chris.unit;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayListTest {

	@Test(expected = IndexOutOfBoundsException.class)
	public void testIndexOutOfBoundsException() {
		ArrayList<Object> emptyList = new ArrayList<Object>();
		Object o = emptyList.get(0);
		System.out.println(o);
	}

}
