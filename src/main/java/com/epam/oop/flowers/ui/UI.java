package com.epam.oop.flowers.ui;

import com.epam.oop.flowers.beans.Bouquet;
import com.epam.oop.flowers.beans.Flower;
import com.epam.oop.flowers.beans.Wrapping;
import com.epam.oop.flowers.creators.BouquetCreator;
import com.epam.oop.flowers.creators.StandardBouquetCreator;
import com.epam.oop.flowers.enums.Colour;
import com.epam.oop.flowers.enums.FlowerKind;
import com.epam.oop.flowers.enums.Length;
import com.epam.oop.flowers.enums.Texture;
import com.epam.oop.flowers.service.StorageService;

import java.util.Optional;

public class UI {
    public void greet() {
        System.out.println("Hello, this application allows to create a bouquet");
    }

    public void mainMenu(StorageService storageService) {
        System.out.printf("%nList of flowers: %s%n", storageService.getFlowersList());
        System.out.printf("%nList of wrappers: %s%n", storageService.getWrappingsList());
        FlowerKind selectedKind = FlowerKind.ROSE;
        Length selectedLength = Length.LONG;
        Optional<Flower> selectedFlower = storageService.getFlower(selectedKind, selectedLength);
        BouquetCreator bouquetCreator = new StandardBouquetCreator();
        Bouquet bouquet = bouquetCreator.createBouquet();
        selectedFlower.ifPresent(flower -> bouquet.addFlower(selectedFlower.get()));
        selectedFlower.ifPresent(flower -> bouquet.addFlower(selectedFlower.get()));
        selectedFlower.ifPresent(flower -> bouquet.addFlower(selectedFlower.get()));
        Texture selectedTexture = Texture.GLOSSY;
        Colour selectedColour = Colour.RED;
        Optional<Wrapping> selectedWrapping = storageService.getWrapping(selectedColour, selectedTexture);
        selectedWrapping.ifPresent(wrapping -> bouquet.setWrapping(selectedWrapping.get()));
        System.out.printf("%nYour %s%n", bouquet.getInfo());
        System.exit(0);
    }

}
