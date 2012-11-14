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
final class DecoyDuck extends Duck {

	private static final Logger LOG = LoggerFactory.getLogger(DecoyDuck.class);

	/**
	 * Constructs a new instance of DecoyDuck.
	 */

	DecoyDuck() {
		super(new NoOpFlightBehavior(), new NoOpQuackBehavior());
	}


	@Override
		// Duck

	String display() {
		return "I'm Displaying DecoyDuck @" + hashCode();
	}
}