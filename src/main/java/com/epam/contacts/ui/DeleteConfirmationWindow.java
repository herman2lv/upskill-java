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
        setBounds(750, 425, 450, 165);
        setTitle("Deleting confirmation");
        setVisible(true);
    }

    private void displayMessage() {
        JLabel message = new JLabel();
        message.setHorizontalAlignment(SwingConstants.CENTER);
        message.setText("Do you really want to delete this contact?");
        message.setBounds(75, 10, 300, 25);
        add(message);
        JLabel contactIdInfo = new JLabel();
        contactIdInfo.setText("Contact ID:          " + contact.getContactId());
        contactIdInfo.setBounds(75, 35, 300, 25);
        add(contactIdInfo);
        JLabel contactNameInfo = new JLabel();
        contactNameInfo.setText("Contact name:   " + contact.getFirstName() + " " + contact.getLastName());
        contactNameInfo.setBounds(75, 50, 300, 25);
        add(contactNameInfo);
    }

    private void buildButtons() {
        JButton yesButton = new JButton("Yes");
        yesButton.setActionCommand(YES);
        yesButton.addActionListener(this);
        yesButton.setBounds(100, 85, 120, 25);
        add(yesButton);
        JButton noButton = new JButton("No");
        noButton.setActionCommand(NO);
        noButton.addActionListener(this);
        noButton.setBounds(230, 85, 120, 25);
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
