package com.epam.contacts.ui;

import com.epam.contacts.beans.Contact;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteConfirmationWindow extends JDialog implements ActionListener {
    private static final String YES = "YES";
    private static final String NO = "NO";
    private final Contact contact;
    private boolean needToDelete;

    public DeleteConfirmationWindow(Contact contact) {
        this.contact = contact;
        setLayout(null);
        displayMessage();
        buildButtons();
        setModal(true);
        setResizable(false);
        int coordinateX = 750;
        int coordinateY = 425;
        int width = 450;
        int height = 165;
        setBounds(coordinateX, coordinateY, width, height);
        setTitle("Deleting confirmation");
        setVisible(true);
    }

    private void displayMessage() {
        JLabel message = new JLabel();
        message.setHorizontalAlignment(SwingConstants.CENTER);
        message.setText("Do you really want to delete this contact?");
        int leftMargin = 75;
        int topMargin = 10;
        int width = 300;
        int height = 25;
        message.setBounds(leftMargin, topMargin, width, height);
        add(message);
        JLabel contactIdInfo = new JLabel();
        contactIdInfo.setText("Contact ID:          " + contact.getContactId());
        topMargin = 35;
        contactIdInfo.setBounds(leftMargin, topMargin, width, height);
        add(contactIdInfo);
        JLabel contactNameInfo = new JLabel();
        contactNameInfo.setText("Contact name:   " + contact.getFirstName() + " " + contact.getLastName());
        topMargin = 50;
        contactNameInfo.setBounds(leftMargin, topMargin, width, height);
        add(contactNameInfo);
    }

    private void buildButtons() {
        JButton yesButton = new JButton("Yes");
        yesButton.setActionCommand(YES);
        yesButton.addActionListener(this);
        int coordinateX = 100;
        int coordinateY = 85;
        int width = 120;
        int height = 25;
        yesButton.setBounds(coordinateX, coordinateY, width, height);
        add(yesButton);
        JButton noButton = new JButton("No");
        noButton.setActionCommand(NO);
        noButton.addActionListener(this);
        coordinateX = 230;
        noButton.setBounds(coordinateX, coordinateY, width, height);
        add(noButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        needToDelete = e.getActionCommand().equals(YES);
        setVisible(false);
    }

    public boolean isNeedToDelete() {
        return needToDelete;
    }
}
