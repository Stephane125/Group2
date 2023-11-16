package model.allElements;

public class Element {

    private Sprite sprite;
    private Permeability permeability;

    /**
     * Constructs a new Element object with the specified sprite and permeability.
     *
     * @param sprite the sprite of the element
     * @param permeability the permeability of the element
     */
    public Element(final Sprite sprite, final Permeability permeability) {
        this.sprite = sprite;
        this.permeability = permeability;
    }

    /**
     * Sets the sprite of the element.
     *
     * @param sprite the sprite to set
     */
    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
        System.out.println(this.sprite);
    }

    /**
     * Sets the permeability of the element.
     *
     * @param permeability the permeability to set
     */
    public void setPermeability(Permeability permeability) {
        this.permeability = permeability;
    }
}