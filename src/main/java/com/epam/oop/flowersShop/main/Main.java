package com.epam.oop.flowersShop.main;

import com.epam.oop.flowersShop.dao.FlowersShopDAO;
import com.epam.oop.flowersShop.service.StorageService;
import com.epam.oop.flowersShop.userInterface.UI;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        ui.greet();
        StorageService storageService = new StorageService(new FlowersShopDAO());
        ui.mainMenu(storageService);
    }
}
