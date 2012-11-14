/*      CONTENTS PROPRIETARY AND CONFIDENTIAL
  *
  *      Copyright © 2012 Dale Dennis Lotts. All rights reserved.
  */
package DuckUSim;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Dale "Ducky" Lotts
 * @since 11/7/12
 */
public final class DuckTest {

	@Test

	public void throwExceptionWhenFlyBehaviorIsNull() {
		try {
			new MockDuck(null, new NoOpQuackBehavior());
			Assert.fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException ignore) {
			// Expected
		}
	}


	@Test

	public void throwExceptionWhenQuackBehaviorIsNull() {
		try {
			new MockDuck(new NoOpFlightBehavior(), null);
			Assert.fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException ignore) {
			// Expected
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
			return "";
		}
	}
}