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
final class DefaultQuackBehavior implements QuackBehavior {

	private static final Logger LOG = LoggerFactory.getLogger(DefaultQuackBehavior.class);

	/**
	 * Performs standard duck quack.
	 */
	@Override

	public String quack() {
		return "I'm Quacking";
	}
}