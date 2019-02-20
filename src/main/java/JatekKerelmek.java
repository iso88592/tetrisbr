import java.io.IOException;
import java.util.Vector;

public class JatekKerelmek {

    public Vector<Player> players = new Vector<Player>();
    Lobby lobby = new Lobby();

    public void uzenet() throws IOException {
        for (Player player:players) player.out.writeObject(joined(player));
    }

    public String joined(Player player){
        if(player.active){
            players.add(player);
            return "Joined";
        }
        else
        {
            return "";
        }
    }
}
