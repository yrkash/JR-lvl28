package com.javarush.task.task32.task3209.listeners;

import com.javarush.task.task32.task3209.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class UndoMenuListener implements MenuListener {

    private View view;
    private JMenuItem undoItem;
    private JMenuItem redoItem;

    public UndoMenuListener(View view, JMenuItem undoItem, JMenuItem redoItem) {
        this.view = view;
        this.undoItem = undoItem;
        this.redoItem = redoItem;
    }

    @Override
    public void menuSelected(MenuEvent e) {

    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }
}
