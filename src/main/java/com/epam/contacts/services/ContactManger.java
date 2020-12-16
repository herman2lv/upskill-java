package com.epam.contacts.services;

import com.epam.contacts.beans.Contact;
import com.epam.contacts.dao.ContactDAO;
import com.epam.contacts.daofactory.SimpleContactDAOFactory;

import java.util.List;

public class ContactManger {
    private ContactDAO contactDAO;

    public ContactManger() {
        contactDAO = new SimpleContactDAOFactory().createDAO();
    }

    public long addContact(Contact contact) {
        return contactDAO.addContact(contact);
    }

    public void updateContact(Contact contact) {
        contactDAO.updateContact(contact);
    }

    public void deleteContact(long contactId) {
        contactDAO.deleteContact(contactId);
    }

    public Contact getContact(long contactId) {
        return contactDAO.getContact(contactId);
    }

    public List<Contact> getContacts() {
        return contactDAO.getContacts();
    }
}
