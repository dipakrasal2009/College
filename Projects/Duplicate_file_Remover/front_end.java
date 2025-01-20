import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.io.*;
import java.util.LinkedList;

public class front_end extends JFrame implements ActionListener {
    private DefaultListModel<String> model;
    private JList<String> l1;
    private JPanel panNorth, panCenter1, panCenter2, panCenter;
    private JLabel name, welcome;
    private JButton b1, b2;
    private JTextField jtext;
    private File f;
    private JMenuBar menubar;
    private JMenu menu1;
    private JMenuItem menu2;
    private JFrame splash;

    front_end() {
        splash = new JFrame("Welcome!");
        splash.setBounds(100, 100, 700, 250);

        welcome = new JLabel("Welcome to Duplicate File Remover!!");
        welcome.setFont(new Font("Courier New", Font.BOLD, 30));
        welcome.setForeground(new Color(100, 0, 0));
        splash.add(welcome);

        splash.setResizable(false);
        splash.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        splash.setVisible(true);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        splash.setVisible(false);
        splash.dispose();

        menubar = new JMenuBar();
        menubar.setBorder(new BevelBorder(BevelBorder.RAISED));
        menu1 = new JMenu("Help");
        menu2 = new JMenuItem("About");
        menubar.add(menu1);
        menubar.add(menu2);
        setJMenuBar(menubar);

        menu2.addActionListener(this);

        name = new JLabel("Duplicate File Remover");
        name.setFont(new Font("Courier New", Font.BOLD, 30));
        name.setForeground(new Color(100, 0, 0));

        panNorth = new JPanel();
        panNorth.setBackground(new Color(127, 112, 219));
        panNorth.add(name);

        b1 = new JButton("Choose Folder");
        b2 = new JButton("Delete Duplicate Files");
        jtext = new JTextField(20);

        b1.setBounds(200, 30, 150, 30);
        b2.setBounds(100, 80, 150, 40);
        panCenter1 = new JPanel();
        panCenter1.setLayout(null);
        panCenter1.add(jtext);
        panCenter1.add(b1);
        panCenter1.add(b2);

        model = new DefaultListModel<>();
        l1 = new JList<>(model);
        l1.setBackground(new Color(205, 201, 201));

        panCenter2 = new JPanel(new GridLayout());
        panCenter2.add(new JScrollPane(l1));

        panCenter = new JPanel(new GridLayout(1, 2));
        panCenter.setBackground(new Color(238, 127, 238));
        panCenter.add(panCenter1);
        panCenter.add(panCenter2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panCenter, "Center");
        this.add(panNorth, "North");
        setTitle("Duplicate File Remover");
        this.setBounds(100, 100, 800, 400);
        this.setResizable(false);

        setVisible(true);

        l1.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                // Handle item selection if needed
            }
        });

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            JFileChooser filechooser = new JFileChooser();
            filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            if (filechooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                f = filechooser.getSelectedFile();
                jtext.setText(f.getAbsolutePath());
            } else {
                JOptionPane.showMessageDialog(this, "No folder selected.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == b2) {
            try {
                Delete_Duplicate dobj = new Delete_Duplicate();
                dobj.list(f.getAbsolutePath());
                LinkedList<String> ll = dobj.getLlist();
                for (String item : ll) {
                    model.addElement(item);
                }
                model.addElement("Deleted All duplicate files!");
                JOptionPane.showMessageDialog(this, "Task Completed!");
            } catch (Exception eobj) {
                eobj.printStackTrace();
            }
        } else if (e.getSource() == menu2) {
            // About window code here (same as original)
        }
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new front_end());
    }
}

