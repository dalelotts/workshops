/*      CONTENTS PROPRIETARY AND CONFIDENTIAL
*
*      Copyright © 2012 Dale Dennis Lotts. All rights reserved.
*/
package DuckUSim;

import ch.qos.logback.classic.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import static org.junit.internal.matchers.StringContains.containsString;

/**
 * @author Dale "Ducky" Lotts
 * @since 11/3/12
 */
public final class MallardDuckTest {

	private static final Logger LOG = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);


	private Duck duck;


	@Before

	public void setupCaptureMessageAppender() {
		duck = new MallardDuck();
	}


	@Test

	public void display() {
		Assert.assertThat(duck.display(), containsString("I'm Displaying MallardDuck"));
	}


	@Test

	public void fly() {
		Assert.assertThat(duck.fly(), containsString("I'm Flying with wings"));
	}


	@Test

	public void quack() {
		Assert.assertThat(duck.quack(), containsString("I'm Quacking"));
	}


	@Test

	public void swim() {
		Assert.assertThat(duck.swim(), containsString("I'm Swimming"));
	}
}