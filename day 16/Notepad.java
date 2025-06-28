import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Notepad extends JFrame implements ActionListener {
    JTextArea textArea;
    JFrame frame;

    JMenuBar menuBar;
    JMenu file, edit;
    JMenuItem newFile, openFile, saveFile, cut, copy, paste, close;

    Notepad() {
        frame = new JFrame("Simple Notepad");

        // Text Area
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);

        // Menu Bar
        menuBar = new JMenuBar();

        // File Menu
        file = new JMenu("File");
        newFile = new JMenuItem("New");
        openFile = new JMenuItem("Open");
        saveFile = new JMenuItem("Save");
        close = new JMenuItem("Close");

        newFile.addActionListener(this);
        openFile.addActionListener(this);
        saveFile.addActionListener(this);
        close.addActionListener(this);

        file.add(newFile);
        file.add(openFile);
        file.add(saveFile);
        file.add(close);

        // Edit Menu
        edit = new JMenu("Edit");
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        menuBar.add(file);
        menuBar.add(edit);

        frame.setJMenuBar(menuBar);

        // Frame Settings
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Event Handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut) {
            textArea.cut();
        } else if (e.getSource() == copy) {
            textArea.copy();
        } else if (e.getSource() == paste) {
            textArea.paste();
        } else if (e.getSource() == newFile) {
            textArea.setText("");
        } else if (e.getSource() == openFile) {
            JFileChooser fileChooser = new JFileChooser();
            int i = fileChooser.showOpenDialog(null);
            if (i == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line = "", output = "";
                    while ((line = reader.readLine()) != null) {
                        output += line + "\n";
                    }
                    textArea.setText(output);
                    reader.close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
                }
            }
        } else if (e.getSource() == saveFile) {
            JFileChooser fileChooser = new JFileChooser();
            int i = fileChooser.showSaveDialog(null);
            if (i == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    writer.write(textArea.getText());
                    writer.close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
                }
            }
        } else if (e.getSource() == close) {
            System.exit(0);
        }
    }

    // Main method
    public static void main(String[] args) {
        new Notepad();
    }
}
