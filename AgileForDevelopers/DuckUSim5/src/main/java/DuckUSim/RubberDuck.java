/*      CONTENTS PROPRIETARY AND CONFIDENTIAL
  *
  *      Copyright © 2012 Dale Dennis Lotts. All rights reserved.
  */
package DuckUSim;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dale "Ducky" Lotts
 * @since 11/7/12
 */
final class RubberDuck extends Duck {

	private static final Logger LOG = LoggerFactory.getLogger(RubberDuck.class);


	/**
	 * Constructs a new instance of Duck.
	 */

	RubberDuck(final FlightBehavior flightBehavior, final QuackBehavior quackBehavior) {
		super(flightBehavior, quackBehavior);
	}


	@Override
	String display() {
		return "I'm Displaying RubberDuck @{}" + hashCode();
	}
}