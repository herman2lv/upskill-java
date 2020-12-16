package com.epam.contacts.ui;

import com.epam.contacts.services.ContactManger;
import com.epam.contacts.beans.Contact;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ContactMainWindow extends JFrame implements ActionListener {
    private static final String LOAD = "LOAD";
    private static final String ADD = "ADD";
    private static final String EDIT = "EDIT";
    private static final String DELETE = "DELETE";
    private static final int ID_COLUMN_NUMBER = 0;
    private final ContactManger contactManger = new ContactManger();
    private final JTable contactTable = new JTable();
    private static final int MARGIN = 5;
    private static final int MAIN_WINDOW_WIDTH = 900;
    private static final int MAIN_WINDOW_HEIGHT = 400;
    private static final int MAIN_WINDOW_X_COORDINATE = 400;
    private static final int MAIN_WINDOW_Y_COORDINATE = 300;

    public ContactMainWindow() {
        contactTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setTitle("Contacts");
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(MARGIN, MARGIN, 0, MARGIN);
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(gridBagLayout);
        controlPanel.add(createButton(gridBagLayout, gridBagConstraints, "Refresh", LOAD));
        controlPanel.add(createButton(gridBagLayout, gridBagConstraints, "Add", ADD));
        controlPanel.add(createButton(gridBagLayout, gridBagConstraints, "Edit", EDIT));
        controlPanel.add(createButton(gridBagLayout, gridBagConstraints, "Delete", DELETE));
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BorderLayout());
        leftPanel.add(controlPanel, BorderLayout.NORTH);
        add(leftPanel, BorderLayout.WEST);
        add(new JScrollPane(contactTable), BorderLayout.CENTER);
        setBounds(MAIN_WINDOW_X_COORDINATE, MAIN_WINDOW_Y_COORDINATE, MAIN_WINDOW_WIDTH, MAIN_WINDOW_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loadContact();
    }

    private JButton createButton(GridBagLayout gbl, GridBagConstraints gbc, String title, String action) {
        JButton button = new JButton(title);
        button.setActionCommand(action);
        button.addActionListener(this);
        gbl.setConstraints(button, gbc);
        return button;
    }

    private void loadContact() {
        List<Contact> contacts = contactManger.getContacts();
        ContactTableModel contactTableModel = new ContactTableModel(contacts);
        contactTable.setModel(contactTableModel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case ADD -> addContact();
            case EDIT -> editContact();
            case DELETE -> deleteContact();
            default -> loadContact();
        }
    }

    private void deleteContact() {
        int row = contactTable.getSelectedRow();
        if (row != -1) {
            long contactId = Long.parseLong(contactTable.getModel().getValueAt(row, ID_COLUMN_NUMBER).toString());
            DeleteConfirmationWindow window = new DeleteConfirmationWindow(contactManger.getContact(contactId));
            if (window.isNeedToDelete()) {
                contactManger.deleteContact(contactId);
                loadContact();
            }
        } else {
            JOptionPane.showMessageDialog(this, "You should select one contact (row) to delete it");
        }
    }

    private void addContact() {
        EditContactWindow editContactWindow = new EditContactWindow();
        saveContact(editContactWindow);
    }

    private void editContact() {
        int row = contactTable.getSelectedRow();
        if (row != -1) {
            long contactId = Long.parseLong(contactTable.getModel().getValueAt(row, ID_COLUMN_NUMBER).toString());
            Contact contact = contactManger.getContact(contactId);
            EditContactWindow editContactWindow = new EditContactWindow(contact);
            saveContact(editContactWindow);
        } else {
            JOptionPane.showMessageDialog(this, "You should select one contact (row) to edit it");
        }
    }

    private void saveContact(EditContactWindow editContactWindow) {
        if (editContactWindow.isNeedToSave()) {
            Contact contact = editContactWindow.getContact();
            if (contact.getContactId() != 0) {
                contactManger.updateContact(contact);
            } else {
                contactManger.addContact(contact);
            }
            loadContact();
        }
    }
}
