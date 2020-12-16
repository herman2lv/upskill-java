package com.epam.gui.component;

import com.epam.gui.ShapeFrame;

import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangleComponent extends AbstractShape implements ActionListener {
    private int x = 5;
    private int y = 5;
    private int step = 10;
    @Override
    protected void paintShape(Graphics g) {
        g.drawRect(x, y, getWidth() - 10, getHeight() - 10);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton btn = (JButton) e.getSource();
            if (ShapeFrame.UP.equals(btn.getActionCommand())) {
                y -= step;
            }
            if (ShapeFrame.DOWN.equals(btn.getActionCommand())) {
                y += step;
            }
            repaint();
        }
    }
}
