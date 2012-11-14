/*      CONTENTS PROPRIETARY AND CONFIDENTIAL
*
*      Copyright © 2012 Dale Dennis Lotts. All rights reserved.
*/
package DuckUSim;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.ConsoleAppender;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Captures the message of a logging event if the name of the logger equals "Duck"
 *
 * @author Dale "Ducky" Lotts
 * @since 11/3/12
 */

final class CaptureMessageAppender extends ConsoleAppender<ILoggingEvent> {

	private static final Set<String> CAPTURE_CLASSES = new HashSet<>();

	static {
		CAPTURE_CLASSES.add(App.class.getName());
	}

	// Deque to store the messages from the appender

	// ToDo: What is dangerous about this Deque?

	private final Deque<String> messageStack = new LinkedList<>();

	/**
	 * Clears the message Deque.
	 * <p/>
	 * This method should be called before each unit test so
	 * messages from earlier tests are not in the Deque.
	 */

	public void clearMessages() {
		messageStack.clear();
	}


	@Override  // UnsynchronizedAppenderBase<E> to capture messages from Duck class

	public void doAppend(final ILoggingEvent eventObject) {
		//ToDo: What is dangerous about   eventObject.getLoggerName().equals("DuckUSim.Duck")  ?

		if (CAPTURE_CLASSES.contains(eventObject.getLoggerName())) {
			messageStack.add(eventObject.getMessage());
		}
		super.doAppend(eventObject);
	}


	/**
	 * Returns a Deque of messages captured since instantiation or the
	 * previous call to {@linkplain #clearMessages()}
	 *
	 * @return A (possibly empty) Deque of message strings captured DuckUSim.Duck.class logging events
	 */

	// ToDo: Why Deque here and not LinkedList?
	public Deque<String> getMessages() {
		return new LinkedList<>(messageStack);
	}
}