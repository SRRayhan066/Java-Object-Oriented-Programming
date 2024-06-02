package Socket_Programming;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket serverSocket = new ServerSocket(6000);
        System.out.println("Server Connected...");

        while(true){
            Socket socket = serverSocket.accept();
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            Object clientMsg = ois.readObject();
            System.out.println("Client : "+clientMsg.toString());

            String serverMsg = clientMsg.toString().toUpperCase();
            oos.writeObject(serverMsg);

        }
    }
}
