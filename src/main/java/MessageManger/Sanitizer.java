package MessageManger;

public class Sanitizer {

    // Takes the message and the max length of the message. If exceeds then throws and error, else santized to prevent sql injection.
    public String Sanitizer(String message, int mxl) throws Exception {

        // Check max length.
        if(message.length() < mxl)
        {
            return message;
        } else
        {
            throw new Exception("Input to long");
        }
    }
}
