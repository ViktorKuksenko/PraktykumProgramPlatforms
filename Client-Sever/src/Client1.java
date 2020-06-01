import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client1 {
    public static final int PORT = 9999;
    public static final String ADDRESS = "127.0.0.1";
    public static void main(String[] ar) {
        Scanner keyboard = new Scanner(System.in);

        try {
            System.out.println("IP address " + ADDRESS + " and port " + PORT + "?");
            Socket socket = new Socket(ADDRESS, PORT);
            System.out.println("Tell your name");
            String name = keyboard.nextLine() + "\t";

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            String line;
            System.out.println("To send message to the sever type something and press enter. ");

            while (true) {
                line = keyboard.nextLine();
                String newLine = name + "" + line;
                System.out.println("Sending to the server : " + newLine);
                out.writeUTF(newLine); // надсилаю line серверу.
                out.flush(); // перериваю потік
                newLine = in.readUTF(); // чекаю відповідь від сервера
                System.out.println("Server response : " + newLine);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}