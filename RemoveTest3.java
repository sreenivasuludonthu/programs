package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveTest3 {

	@Test
	public void test() {
		JunitTesting test =new JunitTesting();
		String result=test.remove("abcd");
		assertEquals("bcd",result);
	}

}
