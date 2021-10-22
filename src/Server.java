import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {
        try {
            ServerSocket server = new ServerSocket(8888);
            int counter = 0;
            System.out.println("Server Started ....");
            do {
                counter++;
                Socket serverClient = server.accept();
                System.out.println("Client No:" + counter + " started!");
                ClientThread sct = new ClientThread(serverClient, counter);
                sct.start();
            } while (true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

