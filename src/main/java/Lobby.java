import java.io.IOException;
import java.util.Vector;

public class Lobby {


    Vector<Player> players = new Vector<Player>();


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
    public void start() throws IOException {
        if(players.size() == 5)
        {
            for (Player player: players) {
                String response = "Amit szeretnél hogy milyen szöveget írjon ki";
                player.out.writeObject(response);
            }
        }
    }












}
