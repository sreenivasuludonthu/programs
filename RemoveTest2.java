package testing;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class RemoveTest2 {

	@Test
	public void test() {
		JunitTesting test =new JunitTesting();
		String result=test.remove("bbbb");
		assertEquals("bbbb",result);
	}

}
