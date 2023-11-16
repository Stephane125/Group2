package contract;

import java.lang.System.Logger.Level;
import java.util.Observable;


@SuppressWarnings("deprecation")
public interface IModel {

	/**
	 * Gets the level.
	 *
	 * @return the level entity
	 */
	Level getHelloWorld();

	/**
	 * Load the message.
	 *
	 * @param code
	 */
	
	void loadHelloWorld(String code);

	/**
	 * Gets the observable.
	 * @return the observable
	 */

	Observable getObservable();
	
	/**
	 * Gets the score.
	 * @return the score
	 */
	
	int getScore();

	/**
	 * Sets the score.
	 * @param Score
	 *  the score
	 */
	
	void setScore(int Score);

	/**
	 * Modify the score
	 */
	
	void collectDiamond();
	
	/**
	 * Gets the rockford in IMobile
	 * @return rockford
	 */
	
	IMobile getRockford();

	/**
	 * Gets rockford in IElement.
	 * @return rockford
	 */
	
	IMobile getElement();
	}
	
	