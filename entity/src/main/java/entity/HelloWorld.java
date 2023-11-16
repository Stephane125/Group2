package entity;
/**
 * The Class Entity.

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

    public HelloWorld(int id, String nom, int diamond, int time, String map) {
        this.id = id;
        this.nom = nom;
        this.diamond = diamond;
        this.time = time;
        this.map = map;
    }
    public HelloWorld() {
        this(0, "", 0, 0, "");
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getDiamond() {
        return diamond;
    }
    public void setDiamond(int diamond) {
        this.diamond = diamond;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
    public String getMap() {
        return map;
    }
    public void setMap(String map) {
        this.map = map;
    }
    // Nouvelles méthodes ajoutées
    public char getHelloWorld(int x, int y) {
        // Récupérer le caractère à la position (x, y) dans la carte du monde
        if (x >= 0 && x < getHelloWorldSize() && y >= 0 && y < getHelloWorldSize()) {
            return map.charAt(x * getHelloWorldSize() + y);
        } else {
            // Gérer les erreurs de limites
            return ' ';
        }
    }
    public int getHelloWorldSize() {
        // Renvoyer la taille de la carte du monde (supposée carrée)
        return (int) Math.sqrt(map.length());
    }
    public void loadHelloWorld(String filePath) {
        // Charger la carte du monde à partir d'un fichier
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder worldMap = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                worldMap.append(line);
            }
            map = worldMap.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
