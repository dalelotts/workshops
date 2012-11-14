/*      CONTENTS PROPRIETARY AND CONFIDENTIAL
  *
  *      Copyright © 2012 Dale Dennis Lotts. All rights reserved.
  */
package DuckUSim;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dale "Ducky" Lotts
 * @since 11/13/12
 */
final class ModelDuck extends Duck {

	private static final Logger LOG = (Logger) LoggerFactory.getLogger(ModelDuck.class);

	/**
	 * Constructs a new instance of Duck.
	 */

	protected ModelDuck() {
		super(new RocketFlightBehavior(), new NoOpQuackBehavior());
	}


	@Override
	String display() {
		return "I'm Displaying ModelDuck @" + hashCode();
	}
}