package model.allElements;

import model.allElements.mobileElem.Monster;
import model.allElements.mobileElem.Player;
import model.allElements.staticElem.*;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Represents a map and provides methods to load elements from a file.
 * @author Group2
 */
public class Map {
    private int width;
    private int height;

    /**
     * Sets the width of the map.
     * @param width The width of the map.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Gets the width of the map.
     * @return The width of the map.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the height of the map.
     * @param height The height of the map.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Gets the height of the map.
     * @return The height of the map.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Loads the map elements from a file and converts them into BufferedImages.
     * @param fileMap The path of the file containing the map elements.
     * @return A 2D array of BufferedImages representing the map elements.
     * @throws IOException If an I/O error occurs while reading the file.
     */
    public static BufferedImage[][] loadMap(String fileMap) throws IOException {
        final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileMap)));
        String line;
        line = buffer.readLine();
        BufferedImage[][] Element = new BufferedImage[line.toCharArray().length][line.toCharArray().length];
        int y = 0;
        while (line != null) {
            for (int x = 0; x <= line.length() - 1; x++) {
                char c = line.toCharArray()[x];
                BufferedImage elem = charToSprite(c);
                Element[x][y] = elem;
            }
            y++;
            line = buffer.readLine();
        }
        buffer.close();
        return Element;
    }

    /**
     * Converts a character representing an element to its corresponding sprite.
     * @param fchar The character representing an element.
     * @return The BufferedImage representing the element's sprite.
     */
    public static BufferedImage charToSprite(char fchar) {
        BufferedImage accSprite = null;
        switch (fchar) {
            case 'S':
                accSprite = new Monster().getSprite();
                break;
            case 'B':
                accSprite = new Monster().getSprite();
                break;
            case ' ':
                accSprite = new Empty().getSprite();
                break;
            case 'P':
                accSprite = new Rock().getSprite();
                break;
            case 'D':
                accSprite = new Diamond().getSprite();
                break;
            case 'M':
                accSprite = new Wall().getSprite();
                break;
            case 'J':
                accSprite = new Player().getSprite();
                break;
            case 'T':
                accSprite = new Sand().getSprite();
                break;
        }
        return accSprite;
    }
}
