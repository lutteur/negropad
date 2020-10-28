import javax.swing.*;
import java.awt.*;

public class Solution extends JPanel {

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("negropad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Here will negropad", SwingConstants.CENTER);
        frame.getContentPane().add(label);


        Dimension d = new Dimension(500, 500);
        frame.setSize(d);

        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
