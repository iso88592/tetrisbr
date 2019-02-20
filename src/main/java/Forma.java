import java.util.Random;

public class Forma {

    protected enum alakzatok {Z_alak,S_alak,vonal_alak,T_alak,negyzet_alak,L_alak,J_alak};
    private  alakzatok pieceShape;
    private int koordinata[][];
    private int koord_tabla[][][];

    public Forma() {

    }
    private void initShape() {

        koordinata = new int[4][2];
        setAlakzat(alakzatok.Z_alak);
    }

    protected void setAlakzat(alakzatok shape) {

        koord_tabla = new int[][][] {
                { { 0, 0 },   { 0, 0 },   { 0, 0 },   { 0, 0 } },
                { { 0, -1 },  { 0, 0 },   { -1, 0 },  { -1, 1 } },
                { { 0, -1 },  { 0, 0 },   { 1, 0 },   { 1, 1 } },
                { { 0, -1 },  { 0, 0 },   { 0, 1 },   { 0, 2 } },
                { { -1, 0 },  { 0, 0 },   { 1, 0 },   { 0, 1 } },
                { { 0, 0 },   { 1, 0 },   { 0, 1 },   { 1, 1 } },
                { { -1, -1 }, { 0, -1 },  { 0, 0 },   { 0, 1 } },
                { { 1, -1 },  { 0, -1 },  { 0, 0 },   { 0, 1 } }
        };

        for (int i = 0; i < 4 ; i++) {

            for (int j = 0; j < 2; ++j) {

                koordinata[i][j] = koord_tabla[shape.ordinal()][i][j];
            }
        }

        pieceShape = shape;
    }

    private void setX(int index, int x) { koordinata[index][0] = x; }
    private void setY(int index, int y) { koordinata[index][1] = y; }
    public int x(int index) { return koordinata[index][0]; }
    public int y(int index) { return koordinata[index][1]; }
    public alakzatok getAlakzat()  { return pieceShape; }

}
