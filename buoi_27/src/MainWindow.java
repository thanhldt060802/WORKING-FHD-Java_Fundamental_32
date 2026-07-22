import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainWindow extends JFrame {

    private final JButton startButton;
    private final JLabel statusLabel;
    private final JProgressBar progressBar;

    public MainWindow() {
        setTitle("SwingWorker Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        startButton = new JButton("Bắt đầu");
        statusLabel = new JLabel("Chưa chạy", SwingConstants.CENTER);

        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);

        JPanel centerPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        centerPanel.add(statusLabel);
        centerPanel.add(progressBar);

        add(centerPanel, BorderLayout.CENTER);
        add(startButton, BorderLayout.SOUTH);

        // startButton.addActionListener((event) -> System.out.println("Hello world"));
        startButton.addActionListener((event) -> startWorker());
    }

    private void startWorker() {
        startButton.setEnabled(false);
        progressBar.setValue(0);

        SwingWorker<String, Integer> worker =
            new SwingWorker<>() {

                @Override
                protected String doInBackground()
                        throws Exception {

                    for (int i = 1; i <= 10; i++) {
                        Thread.sleep(500);

                        int progress = i * 10;

                        // Gửi dữ liệu sang method process()
                        publish(progress);
                    }

                    return "Xử lý hoàn tất";
                }

                @Override
                protected void process(
                        List<Integer> chunks) {

                    int latestProgress =
                        chunks.get(chunks.size() - 1);

                    progressBar.setValue(latestProgress);
                    statusLabel.setText(
                        "Đang xử lý: "
                            + latestProgress
                            + "%"
                    );
                }

                @Override
                protected void done() {
                    try {
                        String result = get();
                        statusLabel.setText(result);
                    } catch (Exception e) {
                        statusLabel.setText(
                            "Lỗi: " + e.getMessage()
                        );
                    } finally {
                        startButton.setEnabled(true);
                    }
                }
            };

        worker.execute();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }
}