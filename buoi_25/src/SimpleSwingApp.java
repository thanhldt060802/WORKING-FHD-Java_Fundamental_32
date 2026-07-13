import javax.swing.*;
import java.awt.*;

public class SimpleSwingApp extends JFrame {

    private final JTextField nameField;
    private final JLabel resultLabel;

    public SimpleSwingApp() {
        setTitle("Java Swing App");
        setSize(400, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel titleLabel = new JLabel("ỨNG DỤNG CHÀO HỎI", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

        JLabel nameLabel = new JLabel("Nhập tên của bạn:");

        nameField = new JTextField(20);

        JButton helloButton = new JButton("Chào tôi");
        JButton clearButton = new JButton("Xóa");

        resultLabel = new JLabel(" ", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        helloButton.addActionListener(event -> showGreeting());
        clearButton.addActionListener(event -> clearForm());

        JPanel inputPanel = new JPanel();
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(helloButton);
        buttonPanel.add(clearButton);

        JPanel centerPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        centerPanel.add(inputPanel);
        centerPanel.add(buttonPanel);
        centerPanel.add(resultLabel);

        setLayout(new BorderLayout(10, 10));
        add(titleLabel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
    }

    private void showGreeting() {
        String name = nameField.getText().trim();

        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Vui lòng nhập tên!",
                    "Thông báo",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        resultLabel.setText("Xin chào, " + name + "!");
    }

    private void clearForm() {
        nameField.setText("");
        resultLabel.setText(" ");
        nameField.requestFocus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleSwingApp app = new SimpleSwingApp();
            app.setVisible(true);
        });
    }
}