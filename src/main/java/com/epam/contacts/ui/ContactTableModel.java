package com.epam.contacts.ui;

import com.epam.contacts.beans.Contact;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ContactTableModel extends AbstractTableModel {
    private static final String[] HEADERS = {"ID", "First name", "Last name", "Phone", "Email"};
    private static final int NUMBER_OF_FIELDS_OF_CONTACT = 5;
    private final List<Contact> contacts;
    private static final int COLUMN_INDEX_ID = 0;
    private static final int COLUMN_INDEX_FIRST_NAME = 1;
    private static final int COLUMN_INDEX_LAST_NAME = 2;
    private static final int COLUMN_INDEX_PHONE = 3;

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
            case COLUMN_INDEX_ID -> contact.getContactId();
            case COLUMN_INDEX_FIRST_NAME -> contact.getFirstName();
            case COLUMN_INDEX_LAST_NAME -> contact.getLastName();
            case COLUMN_INDEX_PHONE -> contact.getPhone();
            default -> contact.getEmail();
        };
    }
}
