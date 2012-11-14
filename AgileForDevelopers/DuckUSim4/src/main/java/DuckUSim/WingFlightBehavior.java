/*      CONTENTS PROPRIETARY AND CONFIDENTIAL
  *
  *      Copyright © 2012 Dale Dennis Lotts. All rights reserved.
  */
package DuckUSim;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A {@linkplain FlightBehavior} where the Duck flies using wings.
 *
 * @author Dale "Ducky" Lotts
 * @since 11/7/12
 */

final class WingFlightBehavior implements FlightBehavior {

	private static final Logger LOG = LoggerFactory.getLogger(WingFlightBehavior.class);

	/**
	 * Performs flight with wings.
	 */

	public String fly() {
		return "I'm Flying with wings.";
	}
}