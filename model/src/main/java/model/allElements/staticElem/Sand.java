package model.allElements.staticElem;

import model.allElements.Permeability;
import model.allElements.Sprite;

import java.awt.image.BufferedImage;

public class Sand extends StaticElem {

    private static final Sprite SpriteSand = new Sprite(1, 0, "images/74359.png");

    public Sand() {
        super(SpriteSand, Permeability.BLOCKING);
    }
    public BufferedImage getSprite(){
        return SpriteSand.loadSprite();
    }
}