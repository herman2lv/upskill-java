package com.epam.contacts.dao;

import com.epam.contacts.beans.Contact;

import java.util.List;

public interface ContactDAO {
    long addContact(Contact contact);
    void updateContact(Contact contact);
    void deleteContact(long contactId);
    Contact getContact(long contactId);
    List<Contact> getContacts();
}
