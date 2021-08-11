package Core;

import org.java_websocket.server.WebSocketServer;
import socketManger.SocketManger;
import sqlManger.PStatment;

import java.net.InetSocketAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Core {

    public static void main(String[] args) {
        System.out.println("LABMATT DOLUDE SERVER SYSTEMS");

        String host = "localhost";
        int port = 8080;

        new PStatment().getQury();

        WebSocketServer server = new SocketManger(new InetSocketAddress(host, port));
        server.run();


    }
}

