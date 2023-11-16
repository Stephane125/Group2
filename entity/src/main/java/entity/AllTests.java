package entity;

/**
 * The Class Entity.
 *
 * This class represents an entity in the system.
 *
 * @author Group 2
 */
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * The test suite class for running all tests.
 *
 * This class uses JUnit's @RunWith and @SuiteClasses annotations to specify the test classes to be run.
 * In this case, it includes the EntityTest class and the HelloWorldTest class.
 *
 * @author Group 2
 */
@RunWith(Suite.class)
@SuiteClasses({ EntityTest.class, HelloWorldTest.class })
public class AllTests {

}