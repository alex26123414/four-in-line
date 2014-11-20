package fourinline;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Lisener1 extends Thread
{
    byte[] receiveData;
    byte[] sendData;
    DatagramPacket receivePacket;
    DatagramPacket sendPacket;
    InetAddress IPAddress;
    String command;
    int portt;
    String message;
    String name;
    public Lisener1(String name, int portNumber) throws SocketException, UnknownHostException
    {
        this.portt = portNumber;
        this.command = name;
        System.out.println("in lisener constructor");
        this.name = name;
    }
    public void run()
    {
        while (true)
        {
            try
            {
                DatagramSocket socket = new DatagramSocket(portt);
                receiveData = new byte[1024];
                DatagramPacket receivePacket
                        = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);
                message = new String(receivePacket.getData());
                System.err.println("|"+message+"|");
                if ((message.trim().equals("NewGame")))
                {
                    System.out.println("He wants a new game");
                    JOptionPane.showConfirmDialog(null, "Super smecher!!!!");
                }
                try{
                    int col = Integer.parseInt(message.trim());
                    GUI1.setX(col);
                } catch(Exception ex){
                    System.out.println("so futu");
                }
                System.out.println(name + "      " + message);
                System.out.println("-----------------------");
                socket.close();
            } catch (IOException ex)
            {
                Logger.getLogger(ex.getMessage());
            }
        }
    }
}