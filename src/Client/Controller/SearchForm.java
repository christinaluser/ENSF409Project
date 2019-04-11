package Client.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SearchForm extends JDialog {
    private JPanel contentPane;
    private JButton OKButton;
    private JButton cancelButton;
    protected JComboBox searchType;
    protected JTextField search;


    public SearchForm() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(OKButton);

        OKButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        dispose();
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
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout(0, 0));
        contentPane.setMinimumSize(new Dimension(300, 90));
        contentPane.setPreferredSize(new Dimension(300, 90));
        final JToolBar toolBar1 = new JToolBar();
        contentPane.add(toolBar1, BorderLayout.SOUTH);
        cancelButton = new JButton();
        cancelButton.setBackground(new Color(-1140324));
        cancelButton.setForeground(new Color(-12828863));
        cancelButton.setText("Cancel");
        toolBar1.add(cancelButton);
        OKButton = new JButton();
        OKButton.setAlignmentX(0.0f);
        OKButton.setBackground(new Color(-1140324));
        OKButton.setForeground(new Color(-12828863));
        OKButton.setHorizontalAlignment(0);
        OKButton.setHorizontalTextPosition(11);
        OKButton.setText("OK");
        OKButton.setVerticalAlignment(0);
        toolBar1.add(OKButton);
        searchType = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("Search by ID");
        defaultComboBoxModel1.addElement("Search by Name");
        searchType.setModel(defaultComboBoxModel1);
        contentPane.add(searchType, BorderLayout.EAST);
        final JLabel label1 = new JLabel();
        label1.setBackground(new Color(-1657945));
        label1.setForeground(new Color(-12828863));
        label1.setText("Enter item name or ID");
        contentPane.add(label1, BorderLayout.NORTH);
        search = new JTextField();
        search.setBackground(new Color(-4662027));
        search.setMinimumSize(new Dimension(100, 10));
        search.setPreferredSize(new Dimension(100, 10));
        search.setText("");
        contentPane.add(search, BorderLayout.CENTER);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return contentPane;
    }

}
