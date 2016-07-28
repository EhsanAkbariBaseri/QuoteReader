package ehsan;


import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MainClass {
    public static void main(String[] args) throws IOException {
        while (true) {
            Socket client = new Socket("djxmmx.net", 17);
            PrintWriter writer = new PrintWriter(client.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            writer.println();
            JOptionPane.showMessageDialog(null,reader.readLine());
        }
    }
}
