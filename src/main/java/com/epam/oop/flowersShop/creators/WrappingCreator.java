package com.epam.oop.flowersShop.creators;

import com.epam.oop.flowersShop.beans.Wrapping;
import com.epam.oop.flowersShop.enums.Colour;
import com.epam.oop.flowersShop.enums.Texture;

import java.math.BigDecimal;

public interface WrappingCreator {
    Wrapping createWrapping(Colour colour, Texture texture, BigDecimal price);
}
