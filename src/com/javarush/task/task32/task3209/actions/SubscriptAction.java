package com.javarush.task.task32.task3209.actions;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubscriptAction extends StyledEditorKit.StyledTextAction {

    public SubscriptAction() {
        super("Подстрочный знак");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public boolean accept(Object sender) {
        return false;
    }
}
