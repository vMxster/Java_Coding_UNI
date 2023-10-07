import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener {
    private static final int NUM_GRID = 9;
    
    private Random random = new Random();
    private JFrame frame = new JFrame();
    private JPanel titlePanel = new JPanel();
    private JPanel buttonPanel = new JPanel();
    private JLabel textField = new JLabel();
    private JButton[] buttons = new JButton[NUM_GRID];
    private boolean player1Turn;
    
    TicTacToe(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textField.setBackground(new Color(255,255,255));
        textField.setForeground(new Color(25,255,0));
        textField.setFont(new Font("Ink Free", Font.BOLD, 75));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("Tic Tac Toe");
        textField.setOpaque(true);

        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBounds(0, 0, 800, 100);

        buttonPanel.setLayout(new GridLayout(3, 3));
        buttonPanel.setBackground(new Color(150,150,150));

        for (int i=0; i<NUM_GRID ; i++) {
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);    
        }

        titlePanel.add(textField);
        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(buttonPanel);

        firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i=0; i<NUM_GRID ; i++) {
            if (e.getSource()==buttons[i]) {
                if (player1Turn) {
                    if (buttons[i].getText()=="") {
                        buttons[i].setForeground(new Color(255, 0, 0));
                        buttons[i].setText("X");
                        player1Turn=false;
                        textField.setText("O Turn");
                        check();
                    }
                } else {
                    if (buttons[i].getText()=="") {
                        buttons[i].setForeground(new Color(0, 0, 255));
                        buttons[i].setText("O");
                        player1Turn=true;
                        textField.setText("X Turn");
                        check();
                    }
                }
            }
        }
    }

    public void firstTurn() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(random.nextInt(2)==0) {
            player1Turn=true;
            textField.setText("X Turn");
        } else {
            player1Turn=false;
            textField.setText("O Turn");
        }
    }

    public void check() {
        // Check X win conditions
        if ((buttons[0].getText()=="X") && 
            (buttons[1].getText()=="X") &&
            (buttons[2].getText()=="X")) {  // First Horizonal Line
                xWins(0,1,2);
        }
        if ((buttons[3].getText()=="X") && 
            (buttons[4].getText()=="X") &&
            (buttons[5].getText()=="X")) {  // Second Horizonal Line
                xWins(3,4,5);
        }
        if ((buttons[6].getText()=="X") && 
            (buttons[7].getText()=="X") &&
            (buttons[8].getText()=="X")) {  // Third Horizonal Line
                xWins(6,7,8);
        }
        if ((buttons[0].getText()=="X") && 
            (buttons[3].getText()=="X") &&
            (buttons[6].getText()=="X")) {  // First Vertical Line
                xWins(0,3,6);
        }
        if ((buttons[1].getText()=="X") && 
            (buttons[4].getText()=="X") &&
            (buttons[7].getText()=="X")) {  // Second Vertical Line
                xWins(1,4,7);
        }
        if ((buttons[2].getText()=="X") && 
            (buttons[5].getText()=="X") &&
            (buttons[8].getText()=="X")) {  // Third Vertical Line
                xWins(2,5,8);
        }
        if ((buttons[0].getText()=="X") && 
            (buttons[4].getText()=="X") &&
            (buttons[8].getText()=="X")) {  // Cross Left->Right
                xWins(0,4,8);
        }
        if ((buttons[2].getText()=="X") && 
            (buttons[4].getText()=="X") &&
            (buttons[6].getText()=="X")) {  // Cross Right->Left
                xWins(2,4,6);
        }
        // Check O win conditions
        if ((buttons[0].getText()=="O") && 
            (buttons[1].getText()=="O") &&
            (buttons[2].getText()=="O")) {  // First Horizonal Line
                oWins(0,1,2);
        }
        if ((buttons[3].getText()=="O") && 
            (buttons[4].getText()=="O") &&
            (buttons[5].getText()=="O")) {  // Second Horizonal Line
                oWins(3,4,5);
        }
        if ((buttons[6].getText()=="O") && 
            (buttons[7].getText()=="O") &&
            (buttons[8].getText()=="O")) {  // Third Horizonal Line
                oWins(6,7,8);
        }
        if ((buttons[0].getText()=="O") && 
            (buttons[3].getText()=="O") &&
            (buttons[6].getText()=="O")) {  // First Vertical Line
                oWins(0,3,6);
        }
        if ((buttons[1].getText()=="O") && 
            (buttons[4].getText()=="O") &&
            (buttons[7].getText()=="O")) {  // Second Vertical Line
                oWins(1,4,7);
        }
        if ((buttons[2].getText()=="O") && 
            (buttons[5].getText()=="O") &&
            (buttons[8].getText()=="O")) {  // Third Vertical Line
                oWins(2,5,8);
        }
        if ((buttons[0].getText()=="O") && 
            (buttons[4].getText()=="O") &&
            (buttons[8].getText()=="O")) {  // Cross Left->Right
                oWins(0,4,8);
        }
        if ((buttons[2].getText()=="O") && 
            (buttons[4].getText()=="O") &&
            (buttons[6].getText()=="O")) {  // Cross Right->Left
                oWins(2,4,6);
        }
    }

    public void xWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for( int i=0; i<NUM_GRID ; i++) {
            buttons[i].setEnabled(false);
        }
        textField.setText("X Wins");
    }

    public void oWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for( int i=0; i<NUM_GRID ; i++) {
            buttons[i].setEnabled(false);
        }
        textField.setText("O Wins");
    }

}
