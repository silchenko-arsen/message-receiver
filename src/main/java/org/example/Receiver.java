package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Receiver {
    private static final int PORT_NUMBER = 8081;
    public void recive() {
        try (
                ServerSocket serverSocket = new ServerSocket(PORT_NUMBER)) {
            System.out.println("Сервер слухає на порту " + PORT_NUMBER);

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

                    String message = in.readLine();
                    System.out.println("Отримано повідомлення: " + message);

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
