package com.epam.oop.treasury.main;

import com.epam.oop.treasury.dao.TreasureFromFileReader;
import com.epam.oop.treasury.dao.TreasuryDAO;
import com.epam.oop.treasury.dao.TreasuryDAOI;
import com.epam.oop.treasury.service.TreasureService;
import com.epam.oop.treasury.userInreface.UI;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        ui.greet();
        TreasuryDAOI treasuryDAO = new TreasuryDAO();
        ui.getData(new TreasureFromFileReader(treasuryDAO));
        ui.mainMenu(new TreasureService(treasuryDAO));
    }
}
