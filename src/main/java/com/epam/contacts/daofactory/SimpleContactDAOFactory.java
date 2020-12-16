package com.epam.contacts.daofactory;

import com.epam.contacts.dao.ContactDAO;
import com.epam.contacts.dao.SimpleContactDAO;

public class SimpleContactDAOFactory implements ContactDAOFactory {
    @Override
    public ContactDAO createDAO() {
        return new SimpleContactDAO();
    }
}
