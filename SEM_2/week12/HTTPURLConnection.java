package week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPURLConnection {
    public static void main ( String[] args ) {
        HttpURLConnection Connection = null;

        try{
            //Create URL Object and it throws MalformedURLException
            URL url = new URL ( "https://www.example.com" );

            //Open Connection and It throws IOException
            Connection = (HttpURLConnection) url.openConnection ();

            //SET Request Method and GET is used to retrieve data and POST to submit data
            Connection.setRequestMethod ( "GET" );

            //Connect and get Response Code
            int responseCode = Connection.getResponseCode ();
            System.out.println ("Response Code: " + responseCode );

            //Read data from the response
            if(responseCode==HttpURLConnection.HTTP_OK){//200
                BufferedReader br = new BufferedReader ( new InputStreamReader (Connection.getInputStream ()));
                String inputLine;
                int LinesToRead = 3;
                while((inputLine = br.readLine ())!=null && LinesToRead-- >0){
                    System.out.println (inputLine );
                }
                br.close();

            }


        }catch (MalformedURLException e){
            System.out.println ("Error Occurred: " + e.getMessage () );

        }catch (IOException e){
            System.out.println (e.getMessage () );

        }finally {
            //always disconnect
            if(Connection!=null){
                Connection.disconnect ();
                System.out.println ("Connection Closed" );
            }
        }
    }
}
