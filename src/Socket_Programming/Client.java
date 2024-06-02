package Socket_Programming;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    Socket chatSocket;
    ObjectOutputStream oos;
    ObjectInputStream ois;

    {
        try {
            chatSocket = new Socket("127.0.0.28",6000);
            oos = new ObjectOutputStream(chatSocket.getOutputStream());
            ois = new ObjectInputStream(chatSocket.getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeMessage(String msg) throws IOException{
        oos.writeObject(msg);
    }

    public void readMessage() throws IOException{
        try {
            Object msg = ois.readObject();
            System.out.println("From Server : "+msg.toString().toUpperCase());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
