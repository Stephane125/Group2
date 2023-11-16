package entity;

/**
 * The HelloWorld class represents a hello world entity.
 *
 * This class extends the Entity class and provides additional methods and properties specific to the hello world entity.
 * The hello world entity has an ID, name, diamond count, time, and a map. It also provides methods to interact with the map.
 *
 * @author Group 2
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloWorld extends Entity {
    private int id;
    private String nom;
    private int diamond;
    private int time;
    private String map;

    /**
     * Constructs a new HelloWorld object with the specified ID, name, diamond count, time, and map.
     *
     * @param id      the ID of the hello world entity
     * @param nom     the name of the hello world entity
     * @param diamond the diamond count of the hello world entity
     * @param time    the time of the hello world entity
     * @param map     the map of the hello world entity
     */
    public HelloWorld(int id, String nom, int diamond, int time, String map) {
        this.id = id;
        this.nom = nom;
        this.diamond = diamond;
        this.time = time;
        this.map = map;
    }

    /**
     * Constructs a new HelloWorld object with default values for ID, name, diamond count, time, and map.
     */
    public HelloWorld() {
        this(0, "", 0, 0, "");
    }

    /**
     * Gets the ID of the hello world entity.
     *
     * @return the ID
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the hello world entity.
     *
     * @param id the ID to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the name of the hello world entity.
     *
     * @return the name
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets the name of the hello world entity.
     *
     * @param nom the name to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Gets the diamond count of the hello world entity.
     *
     * @return the diamond count
     */
    public int getDiamond() {
        return diamond;
    }

    /**
     * Sets the diamond count of the hello world entity.
     *
     * @param diamond the diamond count to set
     */
    public void setDiamond(int diamond) {
        this.diamond = diamond;
    }

    /**
     * Gets the time of the hello world entity.
     *
     * @return the time
     */
    public int getTime() {
        return time;
    }
    /**
     * Sets the time of the hello world entity.
     *
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * Gets the map of the hello world entity.
     *
     * @return the map
     */
    public String getMap() {
        return map;
    }
    /**
     * Sets the map of the hello world entity.
     *
     * @param map the map to set
     */
    public void setMap(String map) {
        this.map = map;
    }
    /**
     * Gets the character at the specified position (x, y) in the hello world map.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     * @return the character at the position (x, y)
     */
    public char getHelloWorld(int x, int y) {
// Retrieve the character at the position (x, y) in the hello world map
        if (x >= 0 && x < getHelloWorldSize() && y >= 0 && y < getHelloWorldSize()) {
            return map.charAt(x * getHelloWorldSize() + y);
        } else {
// Handle boundary errors
            return ' ';
        }
    }
    /**
     * Gets the size of the hello world map.
     *
     * @return the size of the map
     */
    public int getHelloWorldSize() {
// Return the size of the hello world map (assuming it is square)
        return (int) Math.sqrt(map.length());
    }
}
/**
 * Loads the hello world map from a file.
 *
 * @param filePath the path of the file to load the map from
 */