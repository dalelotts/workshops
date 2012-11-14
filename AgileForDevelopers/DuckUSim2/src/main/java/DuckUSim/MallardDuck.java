/*      CONTENTS PROPRIETARY AND CONFIDENTIAL
*
*      Copyright © 2012 Dale Dennis Lotts. All rights reserved.
*/
package DuckUSim;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dale "Ducky" Lotts
 * @since 10/31/12
 */
final class MallardDuck extends Duck {

	private static final Logger LOG = LoggerFactory.getLogger(MallardDuck.class);

	@Override
	String display() {
		return "I'm Displaying MallardDuck @" + hashCode();
	}
}