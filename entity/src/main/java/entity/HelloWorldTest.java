package entity;
/**
 * The Class Entity.
 *
 * @author Group 2
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class HelloWorldTest {

    @Test
    public void testGetHelloWorld() {
        HelloWorld helloWorld = new HelloWorld(1, "Test", 10, 5, "Hello World");

        /** 
         * Check if the character at position (0, 0) is 'H'
         */
        Assertions.assertEquals('H', helloWorld.getHelloWorld(0, 0));

        /**
         * Check if the character at position (1, 1) is 'e'
         */
        Assertions.assertEquals('e', helloWorld.getHelloWorld(1, 1));

        /**
         *  Check if the character at position (10, 10) is ' '
         */
        Assertions.assertEquals(' ', helloWorld.getHelloWorld(10, 10));
    }

    @Test
    public void testGetHelloWorldSize() {
        HelloWorld helloWorld = new HelloWorld(1, "Test", 10, 5, "Hello World");

        /**
         * Check if the size of the world is 11 (the square root of 121)
         */
        Assertions.assertEquals(11, helloWorld.getHelloWorldSize());
    }

    @Test
    public void testLoadHelloWorld() {
        HelloWorld helloWorld = new HelloWorld(1, "Test", 10, 5, "");

        /**
         *  Load the map from a string
         */
        String worldMap = "Hello World!";
        helloWorld.setMap(worldMap);

        /**
         *  Check if the map has been loaded correctly
         */
        Assertions.assertEquals(worldMap, helloWorld.getMap());
    }
}
