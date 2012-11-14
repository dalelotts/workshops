/*      CONTENTS PROPRIETARY AND CONFIDENTIAL
*
*      Copyright © 2012 Dale Dennis Lotts. All rights reserved.
*/
package DuckUSim;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Defines a Redhead Duck in the simulation.
 *
 * @author Dale "Ducky" Lotts
 * @since 10/31/12
 */
final class RedheadDuck extends Duck {

	private static final Logger LOG = LoggerFactory.getLogger(RedheadDuck.class);

	/**
	 * Constructs a new instance of RedheadDuck.
	 */

	RedheadDuck() {
		super(new WingFlightBehavior(), new DefaultQuackBehavior());
	}


	@Override
		// Duck

	String display() {
		return "I'm Displaying RedheadDuck @" + hashCode();
	}
}