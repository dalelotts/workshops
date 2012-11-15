package DuckUSim;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		final ApplicationContext context = new ClassPathXmlApplicationContext("DuckUSim/App.spring.xml");

		final App simulator = new App();
		simulator.simulate(context);
	}


	/**
	 * Initiates the entire DuckUSim simulation.
	 */

	void simulate(final ApplicationContext context) {
		final Duck mallardDuck = (Duck) context.getBean("mallardDuck");
		final Duck redheadDuck = context.getBean("redheadDuck", RedheadDuck.class);
		final Duck rubberDuck = context.getBean(RubberDuck.class);
		final Duck decoyDuck = context.getBean(DecoyDuck.class);
		final Duck modelDuck = context.getBean(ModelDuck.class);

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(decoyDuck);
		simulate(rubberDuck);
		simulate(modelDuck);
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
		LOG.info(duck.fly());
	}
}