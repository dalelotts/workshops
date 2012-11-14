package DuckUSim;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Application class containing the main entry point to the DuckUSim game.
 */

public class App {

	// Logger instance for this class.

	private static final Logger LOG = LoggerFactory.getLogger(App.class);

	/**
	 * Main entry point for the the DuckUSim game.
	 *
	 * @param args
	 * 		command line arguments. Expected to be empty.
	 */

	public static void main(final String[] args) {
		final App simulator = new App();
		simulator.simulate();
	}


	/**
	 * Initiates the entire DuckUSim simulation.
	 */

	private void simulate() {
		final Duck mallardDuck = new MallardDuck();
		final Duck redheadDuck = new RedheadDuck();

		simulate(mallardDuck);
		simulate(redheadDuck);
	}


	/**
	 * Runs simulation for a specific instance of a Duck.
	 *
	 * @param duck
	 * 		the Duck instance to simulate.
	 */

	private void simulate(final Duck duck) {
		LOG.info(duck.display());
		LOG.info(duck.quack());
		LOG.info(duck.swim());
	}
}