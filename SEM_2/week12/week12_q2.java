package week12;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.io.IOException;
import java.net.URL;

class CustomIOException extends Exception{
    public CustomIOException(String message){
        super(message);
    }
}

class CloseableHttpUrlConnection implements AutoCloseable{
    private final HttpURLConnection connection;
    public CloseableHttpUrlConnection(URL url) throws IOException{
        this.connection = (HttpURLConnection) url.openConnection ();
    }

    public HttpURLConnection getConnection () {
        return connection;
    }

    @Override
    public void close() {
        if (connection != null) {
            connection.disconnect();
            System.out.println("Connection closed successfully.");
        }
    }
}

public class week12_q2 {
    public static void main ( String[] args ) {

        try(CloseableHttpUrlConnection connection = new CloseableHttpUrlConnection ( new URL ( "http://nonexistent.abc" ) )){
            HttpURLConnection conn = connection.getConnection();
            conn.setRequestMethod("GET");
            int responseCode = conn.getResponseCode();
            System.out.println("Response Code: " + responseCode);

        }catch (MalformedURLException e){
            System.err.println (e.getMessage () );
        }catch (IOException e){
            try {
                throw new CustomIOException("Custom network error: " + e.getMessage());
            } catch (CustomIOException ce) {
                System.err.println("CustomIOException: " + ce.getMessage());
            }
        }finally {
            System.out.println("Finished network operation.");

        }
    }
}
