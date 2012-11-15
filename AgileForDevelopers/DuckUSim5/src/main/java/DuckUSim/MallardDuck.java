/*      CONTENTS PROPRIETARY AND CONFIDENTIAL
*
*      Copyright © 2012 Dale Dennis Lotts. All rights reserved.
*/
package DuckUSim;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Defines a Mallard Duck in the simulation.
 *
 * @author Dale "Ducky" Lotts
 * @since 10/31/12
 */
final class MallardDuck extends Duck {

	private static final Logger LOG = LoggerFactory.getLogger(MallardDuck.class);

	/**
	 * Constructs a new instance of MallardDuck.
	 */

	MallardDuck(final FlightBehavior flightBehavior, final QuackBehavior quackBehavior) {
		super(flightBehavior, quackBehavior);
	}


	@Override
		// Duck

	String display() {
		return "I'm Displaying MallardDuck @" + hashCode();
	}
}