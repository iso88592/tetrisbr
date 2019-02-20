public class TetrisComponent {
    protected boolean[][] matrix;

    public TetrisComponent() {

    }

    public static TetrisComponent newTetrisComponent (int melyik, int irany) {
        switch (melyik) {
            case 1:
                return new Hosszukas(irany);
            default:
                return new LAlak(irany);
        }
    }
}
