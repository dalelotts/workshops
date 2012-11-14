/*      CONTENTS PROPRIETARY AND CONFIDENTIAL
*
*      Copyright © 2012 Dale Dennis Lotts. All rights reserved.
*/
package DuckUSim;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Duck that can display, swim, and quack within a DuckUSim simulation.
 *
 * @author Dale "Ducky" Lotts
 * @since 10/31/12
 */
abstract class Duck {

	// Logger instance for this class.

	private static final Logger LOG = LoggerFactory.getLogger(Duck.class);

	private final FlightBehavior flightBehavior;
	private final QuackBehavior quackBehavior;

	/**
	 * Constructs a new instance of Duck.
	 *
	 * @param flightBehavior
	 * 		the fly behavior for this instance.
	 * @param quackBehavior
	 * 		the quack behavior for this instance.
	 */

	Duck(final FlightBehavior flightBehavior, final QuackBehavior quackBehavior) {
		if (flightBehavior == null) {
			throw new IllegalArgumentException("Null:flightBehavior");
		}
		if (quackBehavior == null) {
			throw new IllegalArgumentException("Null:quackBehavior");
		}
		this.flightBehavior = flightBehavior;
		this.quackBehavior = quackBehavior;
	}


	/**
	 * Performs implementation specific display the duck within the simulation.
	 */

	abstract String display();

	/**
	 * Causes this duck to fly.
	 */

	public String fly() {
		return flightBehavior.fly();
	}


	/**
	 * Causes this duck to quack.
	 */

	String quack() {
		return quackBehavior.quack();
	}


	/**
	 * Causes this duck to swim around.
	 */

	String swim() {
		return "I'm Swimming";
	}
}