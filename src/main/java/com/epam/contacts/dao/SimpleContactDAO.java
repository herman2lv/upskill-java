package com.epam.contacts.dao;

import com.epam.contacts.beans.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimpleContactDAO implements ContactDAO {
    private final List<Contact> contacts = new ArrayList<>();
    private final Random random = new Random();

    public SimpleContactDAO() {
        addContact(new Contact("Andrew", "Balalaikin", "+375332435455", "Hbo@gmail.com"));
        addContact(new Contact("Andy", "Fisher", "+375335479982", "Fdddshjs@gmail.com"));
        addContact(new Contact("Hellen", "Gardens", "+375337412145", "Hsdgf@tut.by"));
        addContact(new Contact("Tony", "Kensigton", "+375339983295", "Pgd@yandex.ru"));
        addContact(new Contact("Ben", "Great", "+375332235418", "Nddf@gmail.com"));
        addContact(new Contact("Whiskey", "Neo", "+375339659971", "Kld@tut.by"));
        addContact(new Contact("Brian", "Smith", "+375337578264", "Iodfgdgfp@yandex.ru"));
        addContact(new Contact("Mathew", "Johnson", "+375337441912", "Mgb@tut.by"));
        addContact(new Contact("John", "Lissan", "+375331223546", "Mssdk@yandex.ru"));
        addContact(new Contact("Chris", "Namberg", "+375337854963", "Pfsdfgsfsd@yandex.ru"));
        addContact(new Contact("Sergei", "Klimov", "+375295742484", "Petushok1999@yandex.ru"));
    }

    @Override
    public long addContact(Contact contact) {
        long contactId = generateContactId();
        contact.setContactId(contactId);
        contacts.add(contact);
        return contactId;
    }

    @Override
    public void updateContact(Contact contact) {
        Contact contactToUpdate = getContact(contact.getContactId());
        if (contactToUpdate != null) {
            contactToUpdate.setFirstName(contact.getFirstName());
            contactToUpdate.setLastName(contact.getLastName());
            contactToUpdate.setPhone(contact.getPhone());
            contactToUpdate.setEmail(contact.getEmail());
        }
    }

    @Override
    public void deleteContact(long contactId) {
        contacts.removeIf(contact -> contact.getContactId() == contactId);
    }

    @Override
    public Contact getContact(long contactId) {
        for (Contact contact : contacts) {
            if (contact.getContactId() == contactId) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public List<Contact> getContacts() {
        return new ArrayList<>(contacts);
    }

    private long generateContactId() {
        long contactId;
        do {
            contactId = Math.abs(random.nextLong());
        } while (getContact(contactId) != null);
        return contactId;
    }
}
