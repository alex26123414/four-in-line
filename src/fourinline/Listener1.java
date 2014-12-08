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

public class Listener1 extends Thread
{

    byte[] receiveData;
    byte[] sendData;
    DatagramPacket receivePacket;
    DatagramPacket sendPacket;
    InetAddress IPAddress;
    String command;
    int portNumber;
    String message;
    String name;

    public Listener1(String name, int portNumber) throws SocketException, UnknownHostException
    {
        this.portNumber = portNumber;
        this.command = name;
        System.out.println("In listener1 constructor.");
        this.name = name;
    }

    public void run()
    {
        int confirmation;
        Sender1 s = null;
        while (true)
        {
            try
            {
                DatagramSocket socket = new DatagramSocket(portNumber);
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
                    //JOptionPane.showConfirmDialog(null, "Let the game begin!");
                    confirmation = JOptionPane.showConfirmDialog(GUI1.getWindows()[0], "Do you want to play?", "Confirm",
                            JOptionPane.YES_NO_OPTION);
                    switch (confirmation)
                    {
                        case 0:
                            try
                            {
                                System.out.println("I want to start the game, too.");
                                s = new Sender1("Start the game", "Start!", 8882);
                                s.start();
                                GUI1.jPanel2.setVisible(true);
                                GUI1.setBoard();
                            } catch (SocketException ex)
                            {
                                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (UnknownHostException ex)
                            {
                                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            break;
                        case 1:
                            try
                            {
                                System.out.println("He doesn't want to play.");
                                s = new Sender1("Don't wanna play.", "NoGame!", 8882);
                                s.start();
                            } catch (SocketException ex)
                            {
                                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (UnknownHostException ex)
                            {
                                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
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
                    s = new Sender1("Game Ended.", "GameOver!", 8882);
                    s.start();
                    JOptionPane.showMessageDialog(GUI1.getWindows()[0], "Game ended by Player2!");
                    System.exit(0);  
                }
                if ((message.trim().equals("NoGame!")))
                {
                    isAMove = false;
                    System.out.println("Player2 doesn't want to play the game.");
                    JOptionPane.showMessageDialog(GUI1.getWindows()[0], "Player2 doesn't want to play the game...Sorry!");
                    GUI1.jPanel2.setVisible(false);
                    //System.exit(0);
                }
                if ((message.trim().equals("GameOver!")))
                {
                    isAMove = false;
                    System.out.println("Game Over");
                    JOptionPane.showMessageDialog(GUI1.getWindows()[0], "Game Over!");
                    System.exit(0);
                }
                if ((message.trim().equals("Start!")))
                {
                    isAMove = false;
                    System.out.println("Game started");
                    JOptionPane.showMessageDialog(GUI1.getWindows()[0], "You can start!");
                    GUI1.jPanel2.setVisible(true);
                    GUI1.setBoard();
                }
                if ((message.trim().equals("Player2 won!")))
                {
                    isAMove = false;
                    System.out.println("The other player won.");
                    JOptionPane.showMessageDialog(GUI1.getWindows()[0], "You lose :( The winner is Player2.");
                    GUI1.jPanel2.setVisible(false);
                }
                if (isAMove)
                {
                    try
                    {
                        int col = Integer.parseInt(message.trim());
                        GUI1.setX(col, 2);
                        GUI1.setInactiveBtns(true);
                    } catch (Exception ex)
                    {
                        System.out.println("Something went wrong...");
                    }
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
