package contract;

import javax.swing.ImageIcon;

public interface IElement extends IMobile {

    int getX();

    int getY();

    void setX(int x);

    void setY(int y);

    ImageIcon getImageIcon();

    String getFileName();

    Permeability getPermeability();
}
