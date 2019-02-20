import java.util.Random;

public class Jatek {
    public TetrisComponent GetRandomTetrisComponent() {
        Random rnd = new Random();
        // alakzat randomizalasa kezdetben: 1-2
        int melyik = rnd.nextInt(1) + 1;
        // irany randomizalasa 1-4
        int irany = rnd.nextInt(3) + 1;

        return TetrisComponent.newTetrisComponent(melyik, irany);
    }
}
