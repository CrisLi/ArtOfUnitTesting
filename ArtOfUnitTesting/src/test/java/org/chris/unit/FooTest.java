package org.chris.unit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FooTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void doStuffThrowsIndexOutOfBoundsException() {
		Foo foo = new Foo();
		exception.expect(IndexOutOfBoundsException.class);
		foo.doStuff();
	}
}
