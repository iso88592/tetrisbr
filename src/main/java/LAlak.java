public class LAlak extends TetrisComponent{
    public LAlak(int irany) {
        switch (irany) {
            case 1:
                /*
                O
                O O O
                */
                matrix = new boolean[][] {
                        new boolean[] {true, false, false, false},
                        new boolean[] {true, true, true, false},
                        new boolean[] {false, false, false, false},
                        new boolean[] {false, false, false, false}
                };
                break;
            case 2:
                /*
                  O
                  O
                O O
                */
                matrix = new boolean[][] {
                        new boolean[] {false, true, false, false},
                        new boolean[] {false, true, false, false},
                        new boolean[] {true, true, false, false},
                        new boolean[] {false, false, false, false}
                };
                break;
            case 3:
                /*
                O O O
                    O
                */
                matrix = new boolean[][] {
                        new boolean[] {true, true, true, false},
                        new boolean[] {false, false, true, false},
                        new boolean[] {false, false, false, false},
                        new boolean[] {false, false, false, false}
                };
                break;
            default:
                /*
                O O
                O
                O
                */
                matrix = new boolean[][] {
                        new boolean[] {true, true, false, false},
                        new boolean[] {true, false, false, false},
                        new boolean[] {true, false, false, false},
                        new boolean[] {false, false, false, false}
                };
        }
    }
}