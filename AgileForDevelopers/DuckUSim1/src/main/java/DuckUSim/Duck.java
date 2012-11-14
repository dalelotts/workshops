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
final class Duck {

	// Logger instance for this class.

	private static final Logger LOG = LoggerFactory.getLogger(Duck.class);

	/**
	 * Displays the duck within the simulation.
	 */

	String display() {
		return "I'm Displaying @" + hashCode();
	}


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