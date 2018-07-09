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
	
	@Test
	public void test() {
		assertEquals("BIG", someComponent.capitalize("big"));
		assertEquals("NOCACHE-BIG", someComponent.capitalize("nocache-big"));
	}

}
