package org.csc.nsk.java2020.task06.bbs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class BBS {
    private static final int SERVER_PORT = 8089;

    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
        Socket clientSocket = serverSocket.accept();
        PrintWriter out =
                new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));
    }
}
