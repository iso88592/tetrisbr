import javax.swing.*;

public class TetrisForm extends JFrame {
    private JPanel tetrisPanel;

    public TetrisForm() {
        super("Tetris battle royale");

        setContentPane(tetrisPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        this.setSize(800, 800);
        setVisible(true);
    }
}
