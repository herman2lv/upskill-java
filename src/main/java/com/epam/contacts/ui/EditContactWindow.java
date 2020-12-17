package com.epam.contacts.ui;

import com.epam.contacts.beans.Contact;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditContactWindow extends JDialog implements ActionListener {
    private static final String SAVE = "Save";
    private static final String CANCEL = "Cancel";
    private static final int INTERVAL = 5;
    private static final int LABEL_WIDTHS = 100;
    private static final int TEXT_FIELD_WIDTHS = 325;
    private static final int BUTTON_WIDTH = 120;
    private static final int COMPONENT_HEIGHT = 25;
    private final JTextPane firstNameTextFrame = new JTextPane();
    private final JTextPane lastNameTextFrame = new JTextPane();
    private final JTextPane phoneTextFrame = new JTextPane();
    private final JTextPane emailTextFrame = new JTextPane();
    private long contactId;
    private boolean needToSave;

    public EditContactWindow(Contact contact) {
        setLayout(null);
        buildFields();
        initFields(contact);
        buildButtons();
        setModalityType(Dialog.DEFAULT_MODALITY_TYPE);
        setResizable(false);
        setBounds(600, 350, 450, 195);
        setTitle("Contact editor");
        setVisible(true);
    }

    public EditContactWindow() {
        this(null);
    }

    private void buildFields() {
        JLabel labelFirstName = new JLabel("Name:");
        labelFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
        labelFirstName.setBounds(INTERVAL, INTERVAL, LABEL_WIDTHS, COMPONENT_HEIGHT);
        add(labelFirstName);
        firstNameTextFrame.setBounds(LABEL_WIDTHS + 2 * INTERVAL, INTERVAL, TEXT_FIELD_WIDTHS, COMPONENT_HEIGHT);
        firstNameTextFrame.setBorder(BorderFactory.createEtchedBorder());
        add(firstNameTextFrame);
        JLabel labelLastName = new JLabel("Last name:");
        labelLastName.setHorizontalAlignment(SwingConstants.RIGHT);
        labelLastName.setBounds(INTERVAL, 2 * INTERVAL + COMPONENT_HEIGHT, LABEL_WIDTHS, COMPONENT_HEIGHT);
        add(labelLastName);
        lastNameTextFrame.setBounds(LABEL_WIDTHS + 2 * INTERVAL, 2 * INTERVAL + COMPONENT_HEIGHT,
                TEXT_FIELD_WIDTHS, COMPONENT_HEIGHT);
        lastNameTextFrame.setBorder(BorderFactory.createEtchedBorder());
        add(lastNameTextFrame);
        JLabel labelPhone = new JLabel("Phone:");
        labelPhone.setHorizontalAlignment(SwingConstants.RIGHT);
        labelPhone.setBounds(INTERVAL, 3 * INTERVAL + 2 * COMPONENT_HEIGHT, LABEL_WIDTHS, COMPONENT_HEIGHT);
        add(labelPhone);
        phoneTextFrame.setBounds(LABEL_WIDTHS + 2 * INTERVAL, 3 * INTERVAL + 2 * COMPONENT_HEIGHT,
                TEXT_FIELD_WIDTHS, COMPONENT_HEIGHT);
        phoneTextFrame.setBorder(BorderFactory.createEtchedBorder());
        add(phoneTextFrame);
        JLabel labelEmail = new JLabel("Email:");
        labelEmail.setHorizontalAlignment(SwingConstants.RIGHT);
        labelEmail.setBounds(INTERVAL, 4 * INTERVAL + 3 * COMPONENT_HEIGHT, LABEL_WIDTHS, COMPONENT_HEIGHT);
        add(labelEmail);
        emailTextFrame.setBounds(LABEL_WIDTHS + 2 * INTERVAL, 4 * INTERVAL + 3 * COMPONENT_HEIGHT,
                TEXT_FIELD_WIDTHS, COMPONENT_HEIGHT);
        emailTextFrame.setBorder(BorderFactory.createEtchedBorder());
        add(emailTextFrame);
    }

    private void initFields(Contact contact) {
        if (contact != null) {
            contactId = contact.getContactId();
            firstNameTextFrame.setText(contact.getFirstName());
            lastNameTextFrame.setText(contact.getLastName());
            phoneTextFrame.setText(contact.getPhone());
            emailTextFrame.setText(contact.getEmail());
        }

    }

    private void buildButtons() {
        JButton saveButton = new JButton(SAVE);
        saveButton.setActionCommand(SAVE);
        saveButton.addActionListener(this);
        saveButton.setBounds(BUTTON_WIDTH, 5 * INTERVAL + 4 * COMPONENT_HEIGHT, BUTTON_WIDTH, COMPONENT_HEIGHT);
        add(saveButton);
        JButton cancelButton = new JButton(CANCEL);
        cancelButton.setActionCommand(CANCEL);
        cancelButton.addActionListener(this);
        cancelButton.setBounds(2 * BUTTON_WIDTH + INTERVAL, 5 * INTERVAL + 4 * COMPONENT_HEIGHT,
                BUTTON_WIDTH, COMPONENT_HEIGHT);
        add(cancelButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        needToSave = SAVE.equals(e.getActionCommand());
        setVisible(false);
    }

    public boolean isNeedToSave() {
        return needToSave;
    }

    public Contact getContact() {
        return new Contact(contactId, firstNameTextFrame.getText(), lastNameTextFrame.getText(),
                phoneTextFrame.getText(), emailTextFrame.getText());
    }
}
