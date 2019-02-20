public class Hosszukas extends TetrisComponent {
    public Hosszukas(int irany) {
        if (irany <= 2) {
            // O O O O
            matrix = new boolean[][]{
                    new boolean[]{true, true, true, true},
                    new boolean[]{false, false, false, false},
                    new boolean[]{false, false, false, false},
                    new boolean[]{false, false, false, false}
            };
        } else {
            /*
            O
            O
            O
            O
            */
            matrix = new boolean[][]{
                    new boolean[]{true, false, false, false},
                    new boolean[]{true, false, false, false},
                    new boolean[]{true, false, false, false},
                    new boolean[]{true, false, false, false},
            };
        }
    }
}
