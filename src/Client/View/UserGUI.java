package Client.View;

import Client.Controller.Listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserGUI {

    private JPanel panel;
    private JButton showToolsButton;
    private JTextArea ItemList;
    private JTextField textField1;
    private JButton searchButton;
    private Listener listener;
    /**
     * Default constructor for the GUI
     */
    public UserGUI() {}
    /**
     * sets the listener
     *
     * @param listener
     */
    public void setListener(Listener listener) {
        this.listener = listener;
    }

    /**
     * Displays the tools of the "Show Tools" button is pressed
     */
    public void displayTools() {
        showToolsButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String tools = listener.actionPerformed("DISPLAY");
                ItemList.setText(tools);
            }
        });
    }

    /**
     * searches for the tool if "search" button is pressed
     */
    public void searchTools() {
        showToolsButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });
    }

    /**
     * updates the GUI
     *
     * @param gui
     */
    public void updateView(UserGUI gui) {
        JFrame frame = new JFrame("Toolshop");
        frame.setContentPane(gui.panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        gui.displayTools();
        gui.searchTools();
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout(0, 0));
        panel.setMinimumSize(new Dimension(500, 500));
        panel.setPreferredSize(new Dimension(500, 500));
        final JToolBar toolBar1 = new JToolBar();
        panel.add(toolBar1, BorderLayout.NORTH);
        showToolsButton = new JButton();
        showToolsButton.setText("Show Tools");
        toolBar1.add(showToolsButton);
        textField1 = new JTextField();
        toolBar1.add(textField1);
        searchButton = new JButton();
        searchButton.setText("Search");
        toolBar1.add(searchButton);
        final JScrollPane scrollPane1 = new JScrollPane();
        panel.add(scrollPane1, BorderLayout.CENTER);
        ItemList = new JTextArea();
        scrollPane1.setViewportView(ItemList);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel;
    }

}
