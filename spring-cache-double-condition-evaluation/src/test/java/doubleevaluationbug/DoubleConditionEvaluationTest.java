package doubleevaluationbug;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfiguration.class)
public class DoubleConditionEvaluationTest {
	
	@Autowired
	Capitalizer someComponent;
	
	@Autowired
	CacheChecker checker;
	
	@Test
	public void test() {
		assertEquals(0, checker.getInvocationCount());
		assertEquals("BIG", someComponent.capitalize("big"));
		assertEquals(1, checker.getInvocationCount());
		assertEquals("NOCACHE-BIG", someComponent.capitalize("nocache-big"));
		assertEquals(2, checker.getInvocationCount());
	}

}
