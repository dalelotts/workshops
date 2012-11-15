/*      CONTENTS PROPRIETARY AND CONFIDENTIAL
*
*      Copyright © 2012 Dale Dennis Lotts. All rights reserved.
*/
package DuckUSim;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.internal.matchers.StringContains.containsString;

/**
 * @author Dale "Ducky" Lotts
 * @since 11/3/12
 */
public final class DecoyDuckTest {

	private static final Logger LOG = LoggerFactory.getLogger(DecoyDuckTest.class);

	private Duck duck;


	@Test

	public void display() {
		Assert.assertThat(duck.display(), containsString("I'm Displaying DecoyDuck"));
	}


	@Test

	public void fly() {
		Assert.assertThat(duck.fly(), containsString("I can't fly"));
	}


	@Test

	public void quack() {
		Assert.assertThat(duck.quack(), containsString("I can't quack"));
	}


	@Before

	public void setupCaptureMessageAppender() {
		final ApplicationContext context = new ClassPathXmlApplicationContext("DuckUSim/App.spring.xml");
		duck = context.getBean(DecoyDuck.class);
	}


	@Test

	public void swim() {
		Assert.assertThat(duck.swim(), containsString("I'm Swimming"));
	}
}