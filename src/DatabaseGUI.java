import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.table.TableColumn;

public class DatabaseGUI extends JFrame {

    //GUI Buttons and labels
    private JTable table;
    private final JButton addButton;
    private final JButton clearButton;
    private final JButton returnButton;
    private JTextField activeSaveField;
    private final JButton updateSaveButton;

    public static int nextId = 1;

    public DatabaseGUI() {
        setTitle("Save File Entries");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);
        setLocationRelativeTo(null);

        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.LINE_AXIS));

        // Add labels to buttons
        addButton = new JButton("Add Entry");
        clearButton = new JButton("Clear Database");
        returnButton = new JButton("Return to Main Menu");
        activeSaveField = new JTextField(10);
        updateSaveButton = new JButton("Update Active Save");

        // Add buttons to GUI
        inputPanel.add(activeSaveField); 
        inputPanel.add(updateSaveButton);
        inputPanel.add(Box.createHorizontalGlue());
        inputPanel.add(addButton);
        inputPanel.add(clearButton);
        inputPanel.add(returnButton);

        getContentPane().add(inputPanel, BorderLayout.SOUTH);

        //Get all the entries in the database
        Database.getEntries(table);
        
        // Adjust column widths
        TableColumn idColumn = table.getColumnModel().getColumn(0);
        TableColumn nameColumn = table.getColumnModel().getColumn(1);

        idColumn.setPreferredWidth(15); // 15 pixels for ID column
        nameColumn.setPreferredWidth(200); // Adjust the width of the name column

        // method to add an entry to database
        addButton.addActionListener((ActionEvent e) -> {
            DatabaseWriter.addEntry(nextId, table);
            nextId++;
        });
        
        // methodd to remove all entries to database
        clearButton.addActionListener((ActionEvent e) -> {
            DatabaseWriter.clearDatabase(table);
        });
        
        // method to return back to casinogui
        returnButton.addActionListener((ActionEvent e) -> {
            Database.returnToMainMenu();
            dispose();
        });

        // method to change the active save file
        updateSaveButton.addActionListener((ActionEvent e) -> {
            Database.updateActiveSave(activeSaveField);
        });

        setVisible(true);
    }

    public JTable getTable() {
        return table;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DatabaseGUI databaseGUI = new DatabaseGUI();
            if (Database.activeSave == null) {
                String id = JOptionPane.showInputDialog(databaseGUI, "Enter an ID to make active:");
                if (id != null) {
                    try {
                        Database.activeSave = Integer.valueOf(id);
                        JOptionPane.showMessageDialog(databaseGUI, "Active save set to ID: " + Database.activeSave);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(databaseGUI, "Invalid ID.");
                    }
                }
            }
        });
    }
}
