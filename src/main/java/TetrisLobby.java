import javax.swing.*;

public class TetrisLobby extends JFrame {
    private JPanel Panel_Lobby;
    private JLabel Label_Cím;
    private JButton Button_Login;
    private JTextField yourNameTextField;
    private JTextPane textPane1;

    public TetrisLobby() {
        super("Tetris battle royale lobby");

        setContentPane(Panel_Lobby);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        this.setSize(600, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        TetrisLobby ujLobby = new TetrisLobby();
    }
}
