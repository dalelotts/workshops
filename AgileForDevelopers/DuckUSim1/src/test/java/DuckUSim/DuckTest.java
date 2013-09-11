/*      CONTENTS PROPRIETARY AND CONFIDENTIAL
*
*      Copyright © 2012 Dale Dennis Lotts. All rights reserved.
*/
package DuckUSim;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.internal.matchers.StringContains.containsString;

/**
 * @author Dale "Ducky" Lotts
 * @since 11/3/12
 */
public class DuckTest {

	private static final Logger LOG = LoggerFactory.getLogger(DuckTest.class);

	@Test

	public void display() {
		final Duck duck = new Duck();
		Assert.assertThat(duck.display(), containsString("I'm Displaying"));
	}


	@Test

	public void quack() {
		final Duck duck = new Duck();
		Assert.assertThat(duck.quack(), containsString("I'm Quacking"));
	}


	@Test

	public void swim() {
		final Duck duck = new Duck();
		Assert.assertThat(duck.swim(), containsString("I'm Swimming"));
	}
}