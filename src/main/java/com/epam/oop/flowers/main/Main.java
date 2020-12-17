package com.epam.oop.flowers.main;

import com.epam.oop.flowers.dao.FlowersShopDAO;
import com.epam.oop.flowers.service.StorageService;
import com.epam.oop.flowers.ui.UI;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        ui.greet();
        StorageService storageService = new StorageService(new FlowersShopDAO());
        ui.mainMenu(storageService);
    }
}
