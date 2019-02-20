import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        String line;
        int portNumber=2345;
        String host = "localhost";

        Socket clinet = new Socket(host,portNumber);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream out = new DataOutputStream(clinet.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(clinet.getInputStream()));

        line = in.readLine();
        out.writeBytes(line+ "\n");
        

        clinet.close();

    }
}
