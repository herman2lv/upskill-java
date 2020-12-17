package com.epam.oop.flowers.creators;

import com.epam.oop.flowers.beans.Bouquet;
import com.epam.oop.flowers.beans.StandardBouquet;

public class StandardBouquetCreator implements BouquetCreator {
    @Override
    public Bouquet createBouquet() {
        return new StandardBouquet();
    }
}
