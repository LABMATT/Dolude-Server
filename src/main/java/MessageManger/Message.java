package MessageManger;

import org.java_websocket.WebSocket;

public class Message implements Runnable{

    // The recived message on initinalation.
    private final String message;
    private final WebSocket connection;

    // When class is called then init this class for the message
    public Message(String message, WebSocket connection) {

        this.message = message;
        this.connection = connection;
    }

    // Reciveds message as new thread and exacutes it accordingly.
    @Override
    public void run() {

        final int prefixpos = message.indexOf(':');

        String prefix = message.substring(0, prefixpos);
        String sufix = message.substring(prefixpos + 1);

        try {
            sufix = new Sanitizer().Sanitizer(sufix, 10);



        } catch (Exception e) {
            connection.send(prefix + ": Input unsuitable for use." );
        }

        System.out.println("prefix: " + prefix);
        System.out.println("suffix: " + sufix);

        System.out.println("the thread ran");


        System.out.println("The message is: " + message);

    }
}
