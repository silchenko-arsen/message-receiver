package org.example;

import java.io.IOException;
import java.net.ServerSocket;

public class Receiver {

    public void receive(String serverPort, SocketReader socketReader) {
        try (ServerSocket serverSocket = new ServerSocket(Integer.parseInt(serverPort))) {
            System.out.println("Server is listening on the port " + serverPort);
            socketReader.read(serverSocket);
        } catch (IOException e) {
            throw new DataProcessingException("Message not received.", e);
        }
    }
}
