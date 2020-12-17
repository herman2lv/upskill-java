package com.epam.oop.flowers.beans;

import com.epam.oop.flowers.enums.Colour;
import com.epam.oop.flowers.enums.Texture;

import java.math.BigDecimal;

public class PaperWrapping implements Wrapping {
    private final Colour colour;
    private final Texture texture;
    private BigDecimal price;

    public PaperWrapping(Colour colour, Texture texture, BigDecimal price) {
        this.colour = colour;
        this.texture = texture;
        this.price = price;
    }

    public Colour getColour() {
        return colour;
    }

    public Texture getTexture() {
        return texture;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nWrapping{" +
                "colour=" + colour +
                ", texture=" + texture +
                '}';
    }
}
