/*      CONTENTS PROPRIETARY AND CONFIDENTIAL
  *
  *      Copyright © 2012 Dale Dennis Lotts. All rights reserved.
  */
package DuckUSim;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.internal.matchers.StringContains.containsString;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * @author Dale "Ducky" Lotts
 * @since 11/7/12
 */
@RunWith(MockitoJUnitRunner.class)
public class DuckTest {

	private static final Logger LOG = LoggerFactory.getLogger(DuckTest.class);

	private Duck duck;

	@Mock
	private FlightBehavior flightBehavior;

	@Mock
	private QuackBehavior quackBehavior;

	@Test

	public void delegateToFlightBehavior() {
		duck.fly();
		verify(flightBehavior).fly();
	}


	@Test

	public void delegateToQuackBehavior() {
		duck.quack();
		verify(quackBehavior).quack();
	}


	@Test

	public void mockDuckDisplayShouldReturnNull() {
		final MockDuck mockDuck = new MockDuck(flightBehavior, quackBehavior);
		Assert.assertNull(mockDuck.display());
	}


	@Test

	public void notThrowExceptionWhenBehaviorsAreNonNull() {
		new MockDuck(flightBehavior, quackBehavior);
	}


	@Before

	public void setupDuck() {
		duck = mock(Duck.class, CALLS_REAL_METHODS);
		duck.setFlightBehavior(flightBehavior);
		duck.setQuackBehavior(quackBehavior);
	}


	@Test

	public void swim() {
		Assert.assertThat(duck.swim(), containsString("I'm Swimming"));
	}


	@Test

	public void throwExceptionWhenFlyBehaviorIsNull() {
		try {
			new MockDuck(null, quackBehavior);
			Assert.fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException ex) {
			Assert.assertThat(ex.getMessage(), containsString("Null:flightBehavior"));
		}
	}


	@Test

	public void throwExceptionWhenQuackBehaviorIsNull() {
		try {
			new MockDuck(flightBehavior, null);
			Assert.fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException ex) {
			Assert.assertThat(ex.getMessage(), containsString("Null:quackBehavior"));
		}
	}


	private static final class MockDuck extends Duck {

		/**
		 * Constructs a new instance of Duck.
		 *
		 * @param flightBehavior
		 * 		the fly behavior for this instance.
		 * @param quackBehavior
		 * 		the quack behavior for this instance.
		 */

		MockDuck(final FlightBehavior flightBehavior, final QuackBehavior quackBehavior) {
			super(flightBehavior, quackBehavior);
		}


		@Override
		String display() {
			return null;
		}
	}
}