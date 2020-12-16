package com.epam.gui.component;

import java.awt.Graphics;
import javax.swing.JComponent;

public abstract class AbstractShape extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintShape(g);
    }

    protected abstract void paintShape(Graphics g);
}
