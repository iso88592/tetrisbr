import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {
    public Server() {
        int portNumber = 9999;
        ServerSocket Server = null;
        try {
            Server = new ServerSocket(portNumber);
            while(true) {
                try {
                    Socket soc = null;
                    soc = Server.accept();
                    Boolean[][] matr = new Boolean[10][25];
                    socketThread(soc, matr);
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Server s= new Server();
    }

    public void socketThread(Socket soc,Boolean[][] mat ) throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(soc.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(soc.getInputStream());
        Player p= new Player(soc,out,in,mat);
        System.out.println("Csatlakozva!");
        }
    }

