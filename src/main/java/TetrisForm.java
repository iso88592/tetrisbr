import javax.swing.*;

public class TetrisForm extends JFrame {
    private JPanel tetrisPanel;
    private JPanel Panel_Enemy_1;
    private JPanel Panel_Enemy_2;
    private JPanel Panel_Enemy_3;
    private JPanel Panel_Enemy_4;
    private JPanel Panel_Main;
    private JLabel Label_Enemy_4;
    private JLabel Label_Enemy_3;
    private JLabel Label_Enemy_2;
    private JLabel Label_Enemy_1;
    private JPanel Panel_NextItem;
    private JLabel Label_NextItem;
    private JLabel Label_YP;
    private JLabel Label_Numb_YP;
    private JLabel Label_Cím;

    public TetrisForm() {
        super("Tetris battle royale");

        setContentPane(tetrisPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        this.setSize(800, 800);
        setVisible(true);
    }

    public static void main(String[] args) {
        TetrisForm ujkliens = new TetrisForm();
    }
}
