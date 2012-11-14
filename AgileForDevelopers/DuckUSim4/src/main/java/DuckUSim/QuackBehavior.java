/*      CONTENTS PROPRIETARY AND CONFIDENTIAL
  *
  *      Copyright © 2012 Dale Dennis Lotts. All rights reserved.
  */
package DuckUSim;

/**
 * Interface implemented by classes that provide quacking behavior for Ducks.
 *
 * @author Dale "Ducky" Lotts
 * @since 11/7/12
 */
public interface QuackBehavior {

	/**
	 * Performs implementation specific display the duck within the simulation.
	 */

	String quack();
}
