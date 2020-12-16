package com.epam.contacts.ui;

import com.epam.contacts.beans.Contact;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ContactTableModel extends AbstractTableModel {
    private static final String[] HEADERS = {"ID", "First name", "Last name", "Phone", "Email"};
    private static final int NUMBER_OF_FIELDS_OF_CONTACT = 5;
    private final List<Contact> contacts;

    public ContactTableModel(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public int getRowCount() {
        return contacts.size();
    }

    @Override
    public int getColumnCount() {
        return NUMBER_OF_FIELDS_OF_CONTACT;
    }

    @Override
    public String getColumnName(int column) {
        return HEADERS[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Contact contact = contacts.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> contact.getContactId();
            case 1 -> contact.getFirstName();
            case 2 -> contact.getLastName();
            case 3 -> contact.getPhone();
            default -> contact.getEmail();
        };
    }
}
