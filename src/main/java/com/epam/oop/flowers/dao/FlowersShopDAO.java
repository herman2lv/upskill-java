package com.epam.oop.flowers.dao;

import com.epam.oop.flowers.beans.Flower;
import com.epam.oop.flowers.beans.Wrapping;
import com.epam.oop.flowers.creators.FlowerCreator;
import com.epam.oop.flowers.creators.GardenFlowerCreator;
import com.epam.oop.flowers.creators.PaperWrappingCreator;
import com.epam.oop.flowers.creators.WrappingCreator;
import com.epam.oop.flowers.enums.Colour;
import com.epam.oop.flowers.enums.FlowerKind;
import com.epam.oop.flowers.enums.Length;
import com.epam.oop.flowers.enums.Texture;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FlowersShopDAO implements ShopDAOI {
    private final List<Flower> flowers = new ArrayList<>();
    private final List<Wrapping> wrappings = new ArrayList<>();

    public FlowersShopDAO() {
        FlowerCreator flowerCreator = new GardenFlowerCreator();
        flowers.add(flowerCreator.createFlower(FlowerKind.DAISY, Length.SHORT, BigDecimal.valueOf(2.80)));
        flowers.add(flowerCreator.createFlower(FlowerKind.DAISY, Length.MEDIUM, BigDecimal.valueOf(3.99)));
        flowers.add(flowerCreator.createFlower(FlowerKind.TULIP, Length.MEDIUM, BigDecimal.valueOf(7.95)));
        flowers.add(flowerCreator.createFlower(FlowerKind.TULIP, Length.SHORT, BigDecimal.valueOf(5.99)));
        flowers.add(flowerCreator.createFlower(FlowerKind.ROSE, Length.MEDIUM, BigDecimal.valueOf(12.80)));
        flowers.add(flowerCreator.createFlower(FlowerKind.ROSE, Length.LONG, BigDecimal.valueOf(15.20)));
        WrappingCreator wrappingCreator = new PaperWrappingCreator();
        wrappings.add(wrappingCreator.createWrapping(Colour.BLUE, Texture.GLOSSY, BigDecimal.valueOf(3.60)));
        wrappings.add(wrappingCreator.createWrapping(Colour.BLUE, Texture.MATT, BigDecimal.valueOf(3.60)));
        wrappings.add(wrappingCreator.createWrapping(Colour.RED, Texture.GLOSSY, BigDecimal.valueOf(3.60)));
        wrappings.add(wrappingCreator.createWrapping(Colour.RED, Texture.MATT, BigDecimal.valueOf(3.60)));
        wrappings.add(wrappingCreator.createWrapping(Colour.GREEN, Texture.GLOSSY, BigDecimal.valueOf(3.60)));
        wrappings.add(wrappingCreator.createWrapping(Colour.GREEN, Texture.MATT, BigDecimal.valueOf(3.60)));
    }

    public List<Flower> getFlowers() {
        return new ArrayList<>(flowers);
    }

    public List<Wrapping> getWrappings() {
        return new ArrayList<>(wrappings);
    }
}
