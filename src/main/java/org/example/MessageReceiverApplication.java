package org.example;

public class MessageReceiverApplication {
    public static void main(String[] args) {
        ConfigReader configReader = new ConfigReader();
        SocketReader socketReader = new SocketReader();
        String serverPort = configReader.readProperties();
        Receiver receiver = new Receiver();
        receiver.receive(serverPort, socketReader);
    }
}

