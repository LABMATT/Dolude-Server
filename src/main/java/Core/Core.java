package Core;

import org.java_websocket.server.WebSocketServer;
import socketManger.SocketManger;
import sqlManger.PStatment;

import java.net.InetSocketAddress;
import java.sql.*;

public class Core {

    public static void main(String[] args) {
        System.out.println("LABMATT DOLUDE SERVER SYSTEMS");

        // The server adress the websocket server and port are going to be hosted on.
        String host = "localhost";
        int port = 8080;

        try {
            new PStatment().getQury("SELECT * FROM dolude.active;");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Starts the websocket server for connections.
        WebSocketServer server = new SocketManger(new InetSocketAddress(host, port));
        server.run();


    }
}

