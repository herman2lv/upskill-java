package com.epam.oop.flowers.creators;

import com.epam.oop.flowers.beans.Wrapping;
import com.epam.oop.flowers.enums.Colour;
import com.epam.oop.flowers.enums.Texture;

import java.math.BigDecimal;

public interface WrappingCreator {
    Wrapping createWrapping(Colour colour, Texture texture, BigDecimal price);
}
