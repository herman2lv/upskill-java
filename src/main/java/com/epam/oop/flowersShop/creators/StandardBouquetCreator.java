package com.epam.oop.flowersShop.creators;

import com.epam.oop.flowersShop.beans.Bouquet;
import com.epam.oop.flowersShop.beans.StandardBouquet;

public class StandardBouquetCreator implements BouquetCreator {
    @Override
    public Bouquet createBouquet() {
        return new StandardBouquet();
    }
}
