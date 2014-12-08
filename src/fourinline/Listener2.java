package fourinline;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Listener2 extends Thread
{

    byte[] receiveData;
    byte[] sendData;
    DatagramPacket receivePacket;
    DatagramPacket sendPacket;
    InetAddress IPAddress;
    String command;
    int portNr;
    String message;
    String name;

    public Listener2(String name, int portNumber) throws SocketException, UnknownHostException
    {
        this.portNr = portNumber;
        this.command = name;
        System.out.println("In lisener2 constructor");
        this.name = name;
    }

    public void run()
    {
        Sender2 s = null;
        int confirmation;
        while (true)
        {
            try
            {
                DatagramSocket socket = new DatagramSocket(portNr);
                receiveData = new byte[1024];
                DatagramPacket receivePacket
                        = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);
                message = new String(receivePacket.getData());
                System.err.println("|" + message + "|");

                boolean isAMove = true;
                if ((message.trim().equals("NewGame")))
                {
                    isAMove = false;
                    System.out.println("He wants a new game");
                    // JOptionPane.showConfirmDialog(null, "Let the game begin!");
                    confirmation = JOptionPane.showConfirmDialog(GUI2.getWindows()[0], "Do you want to start a new game?", "Confirm",
                            JOptionPane.YES_NO_OPTION);
                    switch (confirmation)
                    {
                        case 0:
                            try
                            {
                                System.out.println("I want to play too");
                                s = new Sender2("Starting a new game.", "Start!", 8881);
                                s.start();
                                GUI2.jPanel2.setVisible(true);
                                GUI2.setBoard();
                            } catch (SocketException ex)
                            {
                                Logger.getLogger(GUI2.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (UnknownHostException ex)
                            {
                                Logger.getLogger(GUI2.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            break;
                        case 1:
                            try
                            {
                                System.out.println("I don't want to play.");
                                s = new Sender2("Don't want to play.", "NoGame!", 8881);
                                s.start();
                            } catch (SocketException ex)
                            {
                                Logger.getLogger(GUI2.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (UnknownHostException ex)
                            {
                                Logger.getLogger(GUI2.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            break;
                        default:
                            break;
                    }
                }
                if ((message.trim().equals("EndGame")))
                {
                    isAMove = false;
                    System.out.println("He wants to end the game.");
                    s = new Sender2("Game Ended.", "GameOver!", 8881);
                    s.start();
                    JOptionPane.showMessageDialog(GUI2.getWindows()[0], "Game ended by Player1!");
                    System.exit(0);
                }
                if ((message.trim().equals("NoGame!")))
                {
                    isAMove = false;
                    System.out.println("Player1 doesn't want to play.");
                    JOptionPane.showMessageDialog(GUI2.getWindows()[0], "Player1 doesn't want to play...Sorry!");
                    s = new Sender2("Game Ended.", "GameOver!", 8881);
                    s.start();
                    System.exit(0);
                }
                if ((message.trim().equals("GameOver!")))
                {
                    isAMove = false;
                    JOptionPane.showMessageDialog(GUI2.getWindows()[0], "Game over!");
                    System.exit(0);
                }
                if ((message.trim().equals("Start!")))
                {
                    isAMove = false;
                    System.out.println("Start the game.");
                    JOptionPane.showMessageDialog(GUI2.getWindows()[0], "You can start!");
                    GUI2.jPanel2.setVisible(true);
                    GUI2.setBoard();
                }
                if ((message.trim().equals("Player1 won!")))
                {
                    isAMove = false;
                    System.out.println("The other player won.");
                    JOptionPane.showMessageDialog(GUI2.getWindows()[0], "You lose :( The winner is Player1.");
                    GUI2.jPanel2.setVisible(false);
                }
                if (isAMove)
                {
                    try
                    {
                        int col = Integer.parseInt(message.trim());
                        GUI2.setInactiveBtns(true);
                        GUI2.setX(col, 1);
                    } catch (Exception ex)
                    {
                        System.out.println("Something went wrong...");
                    }
                }
                System.out.println("From: " + name + " msg: " + message);
                System.out.println("-----------------------");
                socket.close();
            } catch (IOException ex)
            {
                Logger.getLogger(ex.getMessage());
            }
        }
    }
}
