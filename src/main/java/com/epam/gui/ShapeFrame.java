package com.epam.gui;

import com.epam.gui.component.OvalComponent;
import com.epam.gui.component.RectangleComponent;
import com.epam.gui.component.TriangleComponent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class ShapeFrame extends JFrame {
    public static final String UP = "UP";
    public static final String DOWN = "DOWN";
    private static final int WINDOW_WIDTH = 900;
    private static final int WINDOW_HEIGHT = 320;
    private static final int WINDOW_X_COORDINATE = 200;
    private static final int WINDOW_Y_COORDINATE = 200;
    private static final int NUMBER_OF_ROWS = 2;
    private static final int NUMBER_OF_COLUMNS = 2;

    public ShapeFrame() {
        setLayout(new GridLayout(NUMBER_OF_ROWS, NUMBER_OF_COLUMNS));
        OvalComponent ovalComponent = new OvalComponent();
        RectangleComponent rectangleComponent = new RectangleComponent();
        TriangleComponent triangleComponent = new TriangleComponent();
        add(ovalComponent);
        add(rectangleComponent);
        add(triangleComponent);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(WINDOW_X_COORDINATE, WINDOW_Y_COORDINATE, WINDOW_WIDTH, WINDOW_HEIGHT);

        JButton upButton = new JButton(UP);
        upButton.setActionCommand(UP);
        upButton.addActionListener(rectangleComponent);
        add(upButton, BorderLayout.NORTH);

        JButton downButton = new JButton(DOWN);
        downButton.setActionCommand(DOWN);
        downButton.addActionListener(rectangleComponent);
        add(downButton, BorderLayout.SOUTH);
    }
}
