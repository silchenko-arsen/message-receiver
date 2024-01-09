package org.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Receiver {

    public void receive(String serverPort, SocketReader socketReader) {
        try (ServerSocket serverSocket = new ServerSocket(Integer.parseInt(serverPort));
             Socket clientSocket = serverSocket.accept()) {
            System.out.println("Server is listening on the port " + serverPort);
            while (true) {
                socketReader.read(clientSocket);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
