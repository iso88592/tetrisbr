import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Player {
    Socket soc;
    ObjectOutputStream out;
    ObjectInputStream in;
    Boolean[][] matrix;
    boolean active=false;

    public Player(Socket s,ObjectOutputStream o,ObjectInputStream i,Boolean[][] m)
    {
        soc=s;
        out=o;
        in=i;
        matrix=m;
        active=true;
    }
}
