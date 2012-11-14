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

	/**
	 * Performs implementation specific display the duck within the simulation.
	 */

	abstract String display();


	/**
	 * Causes this duck to quack.
	 */

	String quack() {
		return "I'm Quacking";
	}


	/**
	 * Causes this duck to swim around.
	 */

	String swim() {
		return "I'm Swimming";
	}
}