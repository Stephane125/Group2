package model.allElements.mobileElem;


import model.allElements.Permeability;
import model.allElements.Sprite;

import java.awt.image.BufferedImage;

public class Player extends MobileElem{

    private static Sprite spritePlayer = new Sprite(3,0,"images/74336.png");
    public Player() { super(spritePlayer, Permeability.BLOCKING); }
    public BufferedImage getSprite(){
        return spritePlayer.loadSprite();
    }
}
