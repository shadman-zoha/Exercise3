

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
  // initialize socket and input output streams
  private Socket socket            = null;
  // constructor to put ip address and port
  public TCPClient(String address, int port, String data)
  {
	  public static void main(String args[])
	  {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the text ");
	      String data = sc.nextLine();
	      TCPClient tcpClient = new TCPClient("127.0.0.1", 3344, data);
	  }
	  // establish a connection
      Scanner sc = new Scanner(System.in);

      try
      {
          socket = new Socket(address, port);

          System.out.println("Connected Sucessfully");

          // takes input from terminal

          InputStream inputStream = socket.getInputStream();

          OutputStream outputStream = socket.getOutputStream();

          ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);


          objectOutputStream.writeObject(data);

          int val = inputStream.read();

          System.out.println("From Server: The length of the text is: " + val);

          //closes connection.
          socket.close();
      }
      catch(UnknownHostException u)
      {
          System.out.println(u);
      }
      catch(IOException i)
      {
          System.out.println(i);
      }


  }

 
}