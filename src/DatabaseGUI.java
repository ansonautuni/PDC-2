import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.TableColumn;

public class DatabaseGUI extends JFrame {

    private JTable table;
    private final JButton addButton;
    private final JButton clearButton;
    private final JButton returnButton;
    private JTextField activeSaveField;
    private final JButton updateSaveButton;

    public static int nextId = 1; // Next ID for the new entry

    public DatabaseGUI() {
        setTitle("Database Entries");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);
        setLocationRelativeTo(null);

        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.LINE_AXIS));

        addButton = new JButton("Add Entry");
        clearButton = new JButton("Clear Database");
        returnButton = new JButton("Return to Main Menu");
        activeSaveField = new JTextField(10);
        updateSaveButton = new JButton("Update Active Save");

        inputPanel.add(activeSaveField);
        inputPanel.add(updateSaveButton);
        inputPanel.add(Box.createHorizontalGlue());
        inputPanel.add(addButton);
        inputPanel.add(clearButton);
        inputPanel.add(returnButton);

        getContentPane().add(inputPanel, BorderLayout.SOUTH);

        // Fetch and display data
        Database.fetchEntries(table);
        
        // Adjust column widths
        TableColumn idColumn = table.getColumnModel().getColumn(0);
        TableColumn nameColumn = table.getColumnModel().getColumn(1);

        idColumn.setPreferredWidth(15); // 15 pixels for ID column
        nameColumn.setPreferredWidth(200); // Adjust the width of the name column

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DatabaseWriter.addEntry(nextId, table);
                nextId++;
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DatabaseWriter.clearDatabase(table);
            }
        });

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Database.returnToMainMenu();
                dispose();
            }
        });

        updateSaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Database.updateActiveSave(activeSaveField);
            }
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
                String id = JOptionPane.showInputDialog(databaseGUI, "Enter an ID to make it active:");
                if (id != null) {
                    try {
                        Database.activeSave = Integer.parseInt(id);
                        JOptionPane.showMessageDialog(databaseGUI, "Active save set to ID: " + Database.activeSave);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(databaseGUI, "Invalid ID.");
                    }
                }
            }
        });
    }
}
