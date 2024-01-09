package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketReader {
    public void read(Socket clientSocket) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))){
            String message = in.readLine();
            System.out.println("Message received: " + message);
        } catch (IOException e) {
            throw new DataProcessingException("Message wasn't received", e);
        }
    }
}
