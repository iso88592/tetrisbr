import java.io.IOException;
import java.util.Vector;

public class JatekKerelmek {

    public Vector<Player> players = new Vector<Player>();
    Lobby lobby = new Lobby();

    public void uzenet() throws IOException {
        for (int i = 0; i < players.size(); i++) {
            players.get(i).out.writeObject(joined(players.get(i)));
        }
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
