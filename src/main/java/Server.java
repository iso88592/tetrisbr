import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {
    public Server() {
        int portNumber = 1721;
        try {
            ServerSocket Server = new ServerSocket(portNumber);
            Socket soc = null;
            soc = Server.accept();
            socketThread(soc);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Server();
    }

    public void socketThread(Socket soc) throws IOException, ClassNotFoundException {
        ObjectOutputStream out = new ObjectOutputStream(soc.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(soc.getInputStream());
        Integer action = (Integer)in.readObject();
        }
    }

