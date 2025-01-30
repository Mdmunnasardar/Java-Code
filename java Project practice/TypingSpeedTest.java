import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TypingSpeedTest extends JFrame {
    private JLabel sentenceLabel, timeLabel, wpmLabel, accuracyLabel;
    private JTextArea typingArea;
    private JButton startButton;
    private String sentence = "The quick brown fox jumps over the lazy dog.";
    private long startTime;
    private boolean isStarted = false;

    public TypingSpeedTest() {
        setTitle("Typing Speed Test with Sentence Highlighting");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // Sentence Label
        sentenceLabel = new JLabel();
        sentenceLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        sentenceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        updateSentenceLabel(0);
        add(sentenceLabel, BorderLayout.NORTH);

        // Typing Area
        typingArea = new JTextArea(5, 50);
        typingArea.setLineWrap(true);
        typingArea.setWrapStyleWord(true);
        typingArea.setEnabled(false);
        add(new JScrollPane(typingArea), BorderLayout.CENTER);

        // Stats Panel
        JPanel statsPanel = new JPanel(new GridLayout(1, 3));
        timeLabel = new JLabel("Time: 0s");
        wpmLabel = new JLabel("WPM: 0");
        accuracyLabel = new JLabel("Accuracy: 0%");
        statsPanel.add(timeLabel);
        statsPanel.add(wpmLabel);
        statsPanel.add(accuracyLabel);
        add(statsPanel, BorderLayout.SOUTH);

        // Start Button
        startButton = new JButton("Start Test");
        startButton.addActionListener(e -> startTest());
        add(startButton, BorderLayout.WEST);

        // Typing Listener
        typingArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (isStarted) {
                    updateSentenceLabel(typingArea.getText().length());
                }
            }
        });

        setVisible(true);
    }

    private void updateSentenceLabel(int typedLength) {
        StringBuilder html = new StringBuilder("<html><p style='font-size:16px;'>");

        for (int i = 0; i < sentence.length(); i++) {
            if (i < typedLength) {
                if (sentence.charAt(i) == typingArea.getText().charAt(i)) {
                    // Correct character
                    html.append("<span style='color:green;'>").append(sentence.charAt(i)).append("</span>");
                } else {
                    // Incorrect character
                    html.append("<span style='color:red;'>").append(sentence.charAt(i)).append("</span>");
                }
            } else if (i == typedLength) {
                // Next character to type (highlighted)
                html.append("<span style='color:blue; font-weight:bold;'>").append(sentence.charAt(i)).append("</span>");
            } else {
                // Remaining characters
                html.append(sentence.charAt(i));
            }
        }

        html.append("</p></html>");
        sentenceLabel.setText(html.toString());
    }

    private void startTest() {
        if (!isStarted) {
            isStarted = true;
            typingArea.setEnabled(true);
            typingArea.setText("");
            typingArea.requestFocus();
            startButton.setText("Finish Test");
            startTime = System.currentTimeMillis();
        } else {
            isStarted = false;
            typingArea.setEnabled(false);
            startButton.setText("Start Test");

            long endTime = System.currentTimeMillis();
            double timeTaken = (endTime - startTime) / 1000.0;

            String typedText = typingArea.getText().trim();
            int correctChars = 0;
            int totalChars = sentence.length();

            for (int i = 0; i < Math.min(sentence.length(), typedText.length()); i++) {
                if (sentence.charAt(i) == typedText.charAt(i)) {
                    correctChars++;
                }
            }

            double accuracy = ((double) correctChars / totalChars) * 100;
            int wordCount = typedText.split("\\s+").length;
            double wpm = (wordCount / timeTaken) * 60;

            timeLabel.setText(String.format("Time: %.2f s", timeTaken));
            wpmLabel.setText(String.format("WPM: %.2f", wpm));
            accuracyLabel.setText(String.format("Accuracy: %.2f%%", accuracy));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TypingSpeedTest::new);
    }
}
