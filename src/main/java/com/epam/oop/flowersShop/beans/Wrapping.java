package com.epam.oop.flowersShop.beans;

import com.epam.oop.flowersShop.enums.Colour;
import com.epam.oop.flowersShop.enums.Texture;

import java.math.BigDecimal;

public interface Wrapping {
    Colour getColour();
    Texture getTexture();
    BigDecimal getPrice();
    void setPrice(BigDecimal price);

}
