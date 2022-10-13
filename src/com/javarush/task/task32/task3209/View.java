package com.javarush.task.task32.task3209;

<<<<<<< HEAD
import com.javarush.task.task32.task3209.listeners.FrameListener;

=======
>>>>>>> 5106430 (Add gitignore)
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {

    private Controller controller;

<<<<<<< HEAD
    private JTabbedPane tabbedPane = new JTabbedPane();
    private JTextPane htmlTextPane = new JTextPane();
    private JEditorPane plainTextPane  = new JEditorPane();

    public void init(){
        initGui();
        FrameListener listener = new FrameListener(this);
        addWindowListener(listener);
        setVisible(true);
    }

    public void initMenuBar() {

    }

    public void initEditor() {

    }


    public void initGui() {
        initMenuBar();
        initEditor();
        pack();
    }

=======
>>>>>>> 5106430 (Add gitignore)
    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

<<<<<<< HEAD
    public void exit() {
        controller.exit();
    }

=======
>>>>>>> 5106430 (Add gitignore)
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
