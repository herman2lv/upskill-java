package com.epam.oop.flowers.creators;

import com.epam.oop.flowers.beans.PaperWrapping;
import com.epam.oop.flowers.beans.Wrapping;
import com.epam.oop.flowers.enums.Colour;
import com.epam.oop.flowers.enums.Texture;

import java.math.BigDecimal;

public class PaperWrappingCreator implements WrappingCreator {
    @Override
    public Wrapping createWrapping(Colour colour, Texture texture, BigDecimal price) {
        return new PaperWrapping(colour, texture, price);
    }
}
