package DuckUSim;


import ch.qos.logback.classic.Logger;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import java.util.Deque;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.internal.matchers.StringContains.containsString;

/**
 * Unit test for the DuckUSim App.
 */

public final class AppTest {

	// ROOT logger - used to get access to log messages from other classes.

	private static final Logger LOG = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);

	// Appender that captures messages that come from the Duck class
	// Declared as static instance variable to we can get access to the messages during the test.

	private static final CaptureMessageAppender APPENDER = new CaptureMessageAppender();

	static {
		// Add the appender to the ROOT logger.
		LOG.addAppender(APPENDER);
	}

	/**
	 * Test the App.main method.
	 */

	@Test

	public void testApp() {
		// What is wrong with this test implementation?

		App.main(new String[0]);

		final Deque<String> messages = APPENDER.getMessages();

		assertEquals("Expected simulator to log four messages, Display, Swim, Quack, and Fly", 16, messages.size());


		assertThat(messages.pop(), containsString("I'm Displaying"));
		assertThat(messages.pop(), containsString("I'm Quacking"));
		assertThat(messages.pop(), containsString("I'm Swimming"));
		assertThat(messages.pop(), containsString("I'm Flying"));

		assertThat(messages.pop(), containsString("I'm Displaying"));
		assertThat(messages.pop(), containsString("I'm Quacking"));
		assertThat(messages.pop(), containsString("I'm Swimming"));
		assertThat(messages.pop(), containsString("I'm Flying"));

		assertThat(messages.pop(), containsString("I'm Displaying"));
		assertThat(messages.pop(), containsString("I'm Squeaking"));
		assertThat(messages.pop(), containsString("I'm Swimming"));
		assertThat(messages.pop(), containsString("I can't fly"));

		assertThat(messages.pop(), containsString("I'm Displaying"));
		assertThat(messages.pop(), containsString("I can't quack"));
		assertThat(messages.pop(), containsString("I'm Swimming"));
		assertThat(messages.pop(), containsString("I can't fly"));
	}
}