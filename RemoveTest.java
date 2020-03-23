package testing;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class RemoveTest {

	@Test
	public void test() {
		JunitTesting test =new JunitTesting();
		String result=test.remove("aabb");
		assertEquals("bb",result);
		}

}
