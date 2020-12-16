package com.epam.contacts.daofactory;

import com.epam.contacts.dao.ContactDAO;

public interface ContactDAOFactory {
    ContactDAO createDAO();
}
