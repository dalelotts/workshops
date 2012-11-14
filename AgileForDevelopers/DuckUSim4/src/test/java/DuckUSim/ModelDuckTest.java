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
 * @since 11/13/12
 */
public final class ModelDuckTest {

	private static final Logger LOG = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);

	private Duck duck;

	@Before

	public void setupCaptureMessageAppender() {
		duck = new ModelDuck();
	}


	@Test

	public void display() {
		Assert.assertThat(duck.display(), containsString("I'm Displaying ModelDuck"));
	}


	@Test

	public void fly() {
		Assert.assertThat(duck.fly(), containsString("I'm Flying with a rocket"));
	}


	@Test

	public void quack() {
		Assert.assertThat(duck.quack(), containsString("I can't quack"));
	}


	@Test

	public void swim() {
		Assert.assertThat(duck.swim(), containsString("I'm Swimming"));
	}
}