import java.util.Vector;

public class JatekKerelmek {

    public Vector<Player> players = new Vector<Player>();

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
