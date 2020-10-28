import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaDemo extends JPanel {
    protected JTextField textField;
    protected  JTextArea textArea;
    private final static String newline = "\n";

    public TextAreaDemo() {
        setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea("You can write here while you are white");
        textArea.setFont(new Font("Serif", Font.ITALIC, 12));
        textArea.setLineWrap(true); // ?
        textArea.setWrapStyleWord(true); // ?
        JScrollPane areaScrollPane = new JScrollPane(textArea);
        areaScrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        areaScrollPane.setPreferredSize(new Dimension(250, 250));
        areaScrollPane.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createCompoundBorder(
                                BorderFactory.createTitledBorder("Plain Text"),
                                BorderFactory.createEmptyBorder(5, 5, 5, 5)),
                        areaScrollPane.getBorder()));

        JPanel leftPane = new JPanel(new BorderLayout());
        leftPane.add(areaScrollPane, BorderLayout.CENTER);

        add(leftPane, BorderLayout.CENTER);
    }


    private static void createAndShowGUI() {
        JFrame frame = new JFrame("negropad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        JLabel label = new JLabel("Here will negropad", SwingConstants.CENTER);
//        frame.getContentPane().add(label);


        Dimension d = new Dimension(500, 500);
        frame.setSize(d);

        frame.add(new TextAreaDemo());

        //frame.pack();
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //UIManager.put("swing.boldMetal", Boolean.FALSE);
                createAndShowGUI();
            }
        });
    }
}
