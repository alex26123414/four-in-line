/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourinline;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author alex
 */
public class GUI1 extends javax.swing.JFrame
{

    static int[][] board = new int[6][7];
    static Sender1 s;

    /**
     * Creates new form GUI
     */
    public GUI1()
    {
        initComponents();
        setBoard();
        setLocationRelativeTo(null);
        try
        {
            Listener1 l = new Listener1("gui1", 8881);
            l.start();
        } catch (SocketException ex)
        {
            Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex)
        {
            Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jButtonNewGame = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton0 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUI1");
        setMaximumSize(new java.awt.Dimension(425, 560));
        setMinimumSize(new java.awt.Dimension(425, 560));

        jButtonNewGame.setBackground(new java.awt.Color(255, 102, 255));
        jButtonNewGame.setText("New Game");
        jButtonNewGame.setToolTipText("");
        jButtonNewGame.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonNewGameActionPerformed(evt);
            }
        });

        jButtonCancel.setBackground(new java.awt.Color(255, 102, 255));
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonCancelActionPerformed(evt);
            }
        });

        GUI1.jPanel2.setVisible(false);

        jButton0.setBackground(new java.awt.Color(255, 102, 255));
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton0ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 255));
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 102, 255));
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 102, 255));
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 102, 255));
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 102, 255));
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 102, 255));
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 255));
        jPanel1.setForeground(new java.awt.Color(255, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(323, 303));
        jPanel1.setMinimumSize(new java.awt.Dimension(323, 303));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButtonNewGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewGame)
                    .addComponent(jButtonCancel))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        // TODO add your handling code here:
        setX(0, 1);
        sendMove(0);
        setInactiveBtns(false);
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setX(1, 1);
        sendMove(1);
        setInactiveBtns(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonCancelActionPerformed
    {//GEN-HEADEREND:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        Sender1 s = null;
        try
        {
            s = new Sender1("setX in gui1", "EndGame", 8882);
        } catch (SocketException ex)
        {
            Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex)
        {
            Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
        }
        s.start();
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setX(2, 1);
        sendMove(2);
        setInactiveBtns(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setX(3, 1);
        sendMove(3);
        setInactiveBtns(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setX(4, 1);
        sendMove(4);
        setInactiveBtns(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton5ActionPerformed
    {//GEN-HEADEREND:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setX(5, 1);
        sendMove(5);
        setInactiveBtns(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton6ActionPerformed
    {//GEN-HEADEREND:event_jButton6ActionPerformed
        // TODO add your handling code here:
        setX(6, 1);
        sendMove(6);
        setInactiveBtns(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButtonNewGameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonNewGameActionPerformed
    {//GEN-HEADEREND:event_jButtonNewGameActionPerformed
        // TODO add your handling code here:
        Sender1 s = null;
        try
        {
            s = new Sender1("setX in gui1", "NewGame", 8882);
        } catch (SocketException ex)
        {
            Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex)
        {
            Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
        }
        s.start();
    }//GEN-LAST:event_jButtonNewGameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() ->
        {
            new GUI1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private static javax.swing.JButton jButton0;
    private static javax.swing.JButton jButton1;
    private static javax.swing.JButton jButton2;
    private static javax.swing.JButton jButton3;
    private static javax.swing.JButton jButton4;
    private static javax.swing.JButton jButton5;
    private static javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonNewGame;
    private static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

    public static void setBoard()
    {
        for (int i = 0; i < board.length; i++)
        {
            int[] board1 = board[i];
            for (int j = 0; j < board1.length; j++)
            {
                board[i][j] = 0;
            }
        }
        updateBoardGUI();
    }

    public static void setX(int col, int player)
    {
        boolean somebodyWon = false;
        boolean isColumnFull = true;
        for (int i = board.length - 1; i >= 0; i--)
        {
            if (board[i][col] == 0)
            {
                board[i][col] = player;
                isColumnFull = false;
                if (checkWin(i, col, player))
                {
                    try
                    {
                        s = new Sender1("Winner in gui1", "Player1 won!", 8882);
                        s.start();
                        JOptionPane.showMessageDialog(GUI1.getWindows()[0], "Congratulations! You won! :D");
                        GUI1.jPanel2.setVisible(false);
                        somebodyWon = true;
                    } catch (SocketException ex)
                    {
                        Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnknownHostException ex)
                    {
                        Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            }
        }
        if (isColumnFull)
        {
            JOptionPane.showMessageDialog(GUI1.getWindows()[0], "That column is full. Another must be chosen!");
        } else
        {
            updateBoardGUI();
            if (somebodyWon == false)
            {
                if (checkIfIsFull(board))
                {
                    try
                    {
                        s = new Sender1("Board is full", "NoWinner", 8882);
                    } catch (SocketException ex)
                    {
                        Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnknownHostException ex)
                    {
                        Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    s.start();
                    JOptionPane.showMessageDialog(GUI1.getWindows()[0], "Board is full, nobody won.");
                    GUI1.jPanel2.setVisible(false);
                }
            }
        }
    }

    public static void sendMove(int col)
    {
        try
        {
            s = new Sender1("setX in gui1", "" + col, 8882);
            s.start();
        } catch (Exception ex)
        {
            Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateBoardGUI()
    {
        jPanel1.removeAll();

        jPanel1.setLayout(new GridLayout(6, 7));
        jPanel1.setSize(new Dimension(323, 303));
        for (int i = 0; i < board.length; i++)
        {
            int[] board1 = board[i];
            for (int j = 0; j < board1.length; j++)
            {
                int c = board1[j];
                JLabel jl = new JLabel(" " + c + " ");
                jl.setFont(new java.awt.Font("Tahoma", 0, 38));
                jPanel1.add(jl);
            }
        }
        jPanel1.setVisible(false);
        jPanel1.setVisible(true);
    }

    private static boolean checkIfIsFull(int[][] board)
    {
        for (int i = 0; i < board.length; i++)
        {
            int[] board1 = board[i];
            for (int j = 0; j < board1.length; j++)
            {
                if (board1[j] == 0)
                {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkWin(int R, int C, int player)
    {
        // diagonal (NW --> SE)
        if (checkFour(R - 3, R + 4, C - 3, C + 4, player))
        {
            return true;
        } else // diagonal (SW --> NE)
        if (checkFour(R + 3, R - 4, C - 3, C + 4, player))
        {
            return true;
        } else // straight across (W --> E)
        if (checkFour(R, R, C - 3, C + 4, player))
        {
            return true;
        } else // straight down (N --> S)
        if (checkFour(R - 3, R + 4, C, C, player))
        {
            return true;
        }
        return false;
    }

    private static boolean checkFour(int startRow, int endRow, int startCol, int endCol,
            int player)
    {
        int rowStep = (startRow > endRow ? -1 : (startRow < endRow ? 1 : 0));
        int colStep = (startCol > endCol ? -1 : (startCol < endCol ? 1 : 0));
        int count = 0;
        int row = startRow;
        int col = startCol;

        for (; row != endRow || col != endCol; row += rowStep, col += colStep)
        {
            // check bounds
            if (row < 0 || col < 0 || row >= 6 || col >= 7)
            {
                continue;
            }
            if (board[row][col] == player)
            {
                count++;       // counting the continuous player pieces
            } else
            {
                count = 0; // discontinuous sequence -- must reset count
            }
            if (count == 4)
            {
                break;  // four-in-a-row found
            }
        }
        return (count == 4);
    }

    public static void setInactiveBtns(boolean inactive)
    {
        jButton0.setEnabled(inactive);
        jButton1.setEnabled(inactive);
        jButton2.setEnabled(inactive);
        jButton3.setEnabled(inactive);
        jButton4.setEnabled(inactive);
        jButton5.setEnabled(inactive);
        jButton6.setEnabled(inactive);
    }
}
