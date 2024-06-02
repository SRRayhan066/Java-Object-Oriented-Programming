package Socket_Programming;

import java.io.IOException;
import java.util.Scanner;

public class Client1{

    public static void main(String[] args) {
        Client client = new Client();
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        try {
            client.writeMessage(msg);
            client.readMessage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
