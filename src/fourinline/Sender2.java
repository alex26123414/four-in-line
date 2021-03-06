package fourinline;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Logger;

public class Sender2 extends Thread
{
    byte[] sendData;
    DatagramPacket sendPacket;
    InetAddress IPAddress;
    String command;
    int port;
    String message;
   
    public Sender2(String s,String message, int portNumber) throws SocketException, UnknownHostException
    {
        this.port = portNumber;
        sendData = new byte[1024];
        this.command = s;
        this.message = message;
        IPAddress = InetAddress.getByName("127.0.0.1");
    }

    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                DatagramSocket socket = new DatagramSocket();
                sendData = message.getBytes();
                sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
                System.out.println("Sent!");
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