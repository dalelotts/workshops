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
final class NoOpQuackBehavior implements QuackBehavior {

	private static final Logger LOG = LoggerFactory.getLogger(NoOpFlightBehavior.class);

	@Override

	public String quack() {
		return "I can't quack";
	}
}