package fourinline;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Logger;

public class Sender1 extends Thread
{
    byte[] sendData;
    DatagramPacket sendPacket;
    InetAddress IPAddress;
    String command;
    int port;
    String message;
   
    public Sender1(String s,String message, int portNumber) throws SocketException, UnknownHostException
    {
        this.port = portNumber;
        sendData = new byte[1024];
        this.command = s;
        this.message=message;
        IPAddress = InetAddress.getByName("127.0.0.1");
    }
    public void run()
    {
        while (true)
        {
            try
            {
                DatagramSocket socket = new DatagramSocket();
                sendData=message.getBytes();
                sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
                System.out.println("sended!");
                System.out.println("---------------------");
                socket.send(sendPacket);
                socket.close();
                Thread.currentThread().stop();
            } catch (IOException ex)
            {
                Logger.getLogger(ex.getMessage());
            }
        }
    }
}