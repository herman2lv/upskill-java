package com.epam.oop.flowersShop.service;

import com.epam.oop.flowersShop.beans.Flower;
import com.epam.oop.flowersShop.beans.Wrapping;
import com.epam.oop.flowersShop.dao.ShopDAOI;
import com.epam.oop.flowersShop.enums.Colour;
import com.epam.oop.flowersShop.enums.FlowerKind;
import com.epam.oop.flowersShop.enums.Length;
import com.epam.oop.flowersShop.enums.Texture;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StorageService {
    private final ShopDAOI flowersShopDAO;

    public StorageService(ShopDAOI flowersShopDAO) {
        this.flowersShopDAO = flowersShopDAO;
    }

    public List<Flower> getFlowersList() {
        return flowersShopDAO.getFlowers();
    }

    public List<Wrapping> getWrappingsList() {
        return flowersShopDAO.getWrappings();
    }

    public List<Wrapping> sortWrappingByColour() {
        List<Wrapping> wrappings = flowersShopDAO.getWrappings();
        wrappings.sort(Comparator.comparing(Wrapping::getColour));
        return wrappings;
    }

    public List<Wrapping> sortWrappingByTexture() {
        List<Wrapping> wrappings = flowersShopDAO.getWrappings();
        wrappings.sort(Comparator.comparing(Wrapping::getTexture));
        return wrappings;
    }

    public List<Wrapping> sortWrappingByPrice() {
        List<Wrapping> wrappings = flowersShopDAO.getWrappings();
        wrappings.sort(Comparator.comparing(Wrapping::getPrice));
        return wrappings;
    }

    public List<Flower> sortFlowersByPrice() {
        List<Flower> flowers = flowersShopDAO.getFlowers();
        flowers.sort(Comparator.comparing(Flower::getPrice));
        return flowers;
    }

    public List<Flower> sortFlowersByKind() {
        List<Flower> flowers = flowersShopDAO.getFlowers();
        flowers.sort(Comparator.comparing(Flower::getKind));
        return flowers;
    }

    public List<Flower> sortFlowersByLength() {
        List<Flower> flowers = flowersShopDAO.getFlowers();
        flowers.sort(Comparator.comparing(Flower::getLength));
        return flowers;
    }

    public List<Flower> getFlowersByKind(FlowerKind kind) {
        List<Flower> selectedFlowers = new ArrayList<>();
        for (Flower flower : flowersShopDAO.getFlowers()) {
            if (flower.getKind().equals(kind)) {
                selectedFlowers.add(flower);
            }
        }
        return selectedFlowers;
    }

    public List<Flower> getFlowersByLength(Length length) {
        List<Flower> selectedFlowers = new ArrayList<>();
        for (Flower flower : flowersShopDAO.getFlowers()) {
            if (flower.getLength().equals(length)) {
                selectedFlowers.add(flower);
            }
        }
        return selectedFlowers;
    }

    public List<Flower> getFlowersByPrice(int minPrice, int maxPrice) {
        List<Flower> selectedFlowers = new ArrayList<>();
        for (Flower flower : flowersShopDAO.getFlowers()) {
            if (flower.getPrice().intValue() >= minPrice
                    && flower.getPrice().intValue() <= maxPrice) {
                selectedFlowers.add(flower);
            }
        }
        return selectedFlowers;
    }

    public List<Wrapping> getWrappingsByColour(Colour colour) {
        List<Wrapping> selectedWrappings = new ArrayList<>();
        for (Wrapping wrapping : flowersShopDAO.getWrappings()) {
            if (wrapping.getColour().equals(colour)) {
                selectedWrappings.add(wrapping);
            }
        }
        return selectedWrappings;
    }

    public List<Wrapping> getFlowersByLength(Texture texture) {
        List<Wrapping> selectedWrappings = new ArrayList<>();
        for (Wrapping wrapping : flowersShopDAO.getWrappings()) {
            if (wrapping.getTexture().equals(texture)) {
                selectedWrappings.add(wrapping);
            }
        }
        return selectedWrappings;
    }

    public List<Wrapping> getWrappingsByPrice(int minPrice, int maxPrice) {
        List<Wrapping> selectedWrappings = new ArrayList<>();
        for (Wrapping wrapping : flowersShopDAO.getWrappings()) {
            if (wrapping.getPrice().intValue() >= minPrice
                    && wrapping.getPrice().intValue() <= maxPrice) {
                selectedWrappings.add(wrapping);
            }
        }
        return selectedWrappings;
    }

    public Optional<Flower> getFlower(FlowerKind kind, Length length) {
        return flowersShopDAO.getFlowers().stream()
                .filter(flower -> flower.getKind().equals(kind) && flower.getLength().equals(length))
                .findFirst();
    }

    public Optional<Wrapping> getWrapping(Colour colour, Texture texture) {
        return flowersShopDAO.getWrappings().stream()
                .filter(wrapping -> wrapping.getColour().equals(colour) && wrapping.getTexture().equals(texture))
                .findFirst();
    }

}
