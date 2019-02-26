package Logic;

public class TetrisField {

    private final int width = 10;
    private final int height = 20;

    private boolean[][] field;

    public boolean[][] GetField() {
        return field;
    }

    public TetrisField() {
        FillField();
    }

    private void FillField() {
        field = new boolean[width][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                field[i][j] = false;
            }
        }
    }

    public void LogField() {
        for (int i = 0; i < height; i++) {
            String line = "";
            for (int j = 0; j < width; j++) {
                line+=(field[i][j])?"X":" ";
            }
            System.out.println(line);
        }
    }
}
