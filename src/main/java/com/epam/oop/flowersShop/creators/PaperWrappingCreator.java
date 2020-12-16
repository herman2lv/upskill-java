package com.epam.oop.flowersShop.creators;

import com.epam.oop.flowersShop.beans.PaperWrapping;
import com.epam.oop.flowersShop.beans.Wrapping;
import com.epam.oop.flowersShop.enums.Colour;
import com.epam.oop.flowersShop.enums.Texture;

import java.math.BigDecimal;

public class PaperWrappingCreator implements WrappingCreator {
    @Override
    public Wrapping createWrapping(Colour colour, Texture texture, BigDecimal price) {
        return new PaperWrapping(colour, texture, price);
    }
}
