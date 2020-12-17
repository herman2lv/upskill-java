package com.epam.oop.flowers.beans;

import com.epam.oop.flowers.enums.Colour;
import com.epam.oop.flowers.enums.Texture;

import java.math.BigDecimal;

public interface Wrapping {
    Colour getColour();
    Texture getTexture();
    BigDecimal getPrice();
    void setPrice(BigDecimal price);

}
