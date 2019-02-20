import java.io.IOException;
import java.util.Vector;

public class Lobby {

    Vector<Player> players;
    Boolean ready = false;

    public Lobby(JatekKerelmek jatekKerelmek)
    {
        players = jatekKerelmek.players;
    }

    public void waiting() throws IOException {
        while (players.size()<5)
        {
            String response = "Várakozás még "+(5-players.size())+"játékosra";
            for (Player player: players) {
                player.out.writeObject(response);
            }
        }
    }
    public void start() throws IOException {
        if(players.size() == 5)
        {
            for (Player player: players) {
                String response = "Amit szeretnél hogy milyen szöveget írjon ki";
                player.out.writeObject(response);
                ready = true;
            }
        }
    }
    public void deletePlayer(Player player)
    {
        if(!player.active)
        {
            players.remove(player);
        }


    }












}
