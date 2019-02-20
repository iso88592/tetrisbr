import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketAddress;

public class Client {
    Client() throws IOException {
        String line;
        int portNumber = 9999;
        String host = "localhost";

        Socket clinet = new Socket(host, portNumber);
        DataOutputStream out = new DataOutputStream(clinet.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(clinet.getInputStream()));
//        line = in.readLine();
//        out.writeBytes(line + "\n");

    }

    public static void main(String[] args) throws IOException {
        Client c= new Client();
    }
}
