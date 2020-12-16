package com.epam.oop.paymentTask.main;

import com.epam.oop.paymentTask.dao.ShopDAO;
import com.epam.oop.paymentTask.beans.Payment;
import com.epam.oop.paymentTask.beans.Product;
import com.epam.oop.paymentTask.services.CatalogueService;
import com.epam.oop.paymentTask.services.ShopAssistant;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShopDAO shopDAO = new ShopDAO();
        List<Product> catalogue = shopDAO.getCatalogue();
        CatalogueService catalogueService = new CatalogueService();
        System.out.println(catalogue);
        catalogueService.sortByPrice(catalogue);
        System.out.println(catalogue);
        ShopAssistant shopAssistant = new ShopAssistant(new Payment());
        shopAssistant.order(catalogueService.getById(catalogue, 1), 2);
        shopAssistant.order(catalogueService.getByName(catalogue, "Vodka"), 6);
        shopAssistant.order(catalogueService.getByName(catalogue, "Wine"), 3);
        shopAssistant.order(catalogueService.getByName(catalogue, "Whiskey"), 1);
        System.out.println(shopAssistant.getPaymentInfo());
        shopAssistant.removeOrder(3);
        System.out.println(shopAssistant.getPaymentInfo());
    }
}
