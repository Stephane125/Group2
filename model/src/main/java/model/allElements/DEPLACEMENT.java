package model.allElements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DEPLACEMENT extends JFrame implements KeyListener {
    private int positionX;
    private int positionY;
    private JLabel labelImage;

    public DEPLACEMENT() {
        // Initialisation des positions
        positionX = 0;
        positionY = 0;

        // Création du label pour afficher l'image
        labelImage = new JLabel();

        // Chargement de l'image
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("images/74336.png")); // Remplacez par le chemin de votre image


        } catch (IOException e) {
            e.printStackTrace();
        }

        if (image != null) {
            ImageIcon imageIcon = new ImageIcon(image);
            labelImage.setIcon(imageIcon);
            labelImage.setBounds(positionX, positionY, imageIcon.getIconWidth(), imageIcon.getIconHeight());
        }

        // Ajout du KeyListener à la fenêtre
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        // Ajout du label à la fenêtre
        setLayout(null);
        add(labelImage);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_UP) {
            deplacerHaut();
        } else if (keyCode == KeyEvent.VK_DOWN) {
            deplacerBas();
        } else if (keyCode == KeyEvent.VK_LEFT) {
            deplacerGauche();
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            deplacerDroite();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Ne pas utiliser
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Ne pas utiliser
    }

    private void deplacerHaut() {
        if (positionY > 0) {
            positionY -= 10;
            mettreAJourPosition();
        }
    }

    private void deplacerBas() {
        int imageHeight = labelImage.getHeight();
        int frameHeight = getContentPane().getHeight();

        if (positionY + imageHeight < frameHeight) {
            positionY += 10;
            mettreAJourPosition();
        }
    }

    private void deplacerGauche() {
        if (positionX > 0) {
            positionX -= 10;
            mettreAJourPosition();
        }
    }

    private void deplacerDroite() {
        int imageWidth = labelImage.getWidth();
        int frameWidth = getContentPane().getWidth();

        if (positionX + imageWidth < frameWidth) {
            positionX += 10;
            mettreAJourPosition();
        }
    }

    private void mettreAJourPosition() {
        labelImage.setLocation(positionX, positionY);
    }


}

