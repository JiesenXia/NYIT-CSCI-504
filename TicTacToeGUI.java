import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGUI extends JFrame implements ActionListener {

    private JButton[] buttons;
    private JLabel statusLabel;
    private boolean isXTurn;

    public TicTacToeGUI() {
        setTitle("Tic-Tac-Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 3));

        buttons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }

        statusLabel = new JLabel();
        statusLabel.setFont(new Font("Arial", Font.BOLD, 16));
        statusLabel.setText("X's turn");

        add(panel, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        isXTurn = true;
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (button.getText().isEmpty()) {
            if (isXTurn) {
                button.setText("X");
                isXTurn = false;
                statusLabel.setText("O's turn");
            } else {
                button.setText("O");
                isXTurn = true;
                statusLabel.setText("X's turn");
            }

            checkWinner();
        }
    }

    private void checkWinner() {
        String[] board = new String[9];
        for (int i = 0; i < 9; i++) {
            board[i] = buttons[i].getText();
        }

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i * 3].equals(board[i * 3 + 1]) && board[i * 3].equals(board[i * 3 + 2]) && !board[i * 3].isEmpty()) {
                declareWinner(board[i * 3]);
                return;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[i].equals(board[i + 3]) && board[i].equals(board[i + 6]) && !board[i].isEmpty()) {
                declareWinner(board[i]);
                return;
            }
        }

        // Check diagonals
        if (board[0].equals(board[4]) && board[0].equals(board[8]) && !board[0].isEmpty()) {
            declareWinner(board[0]);
            return;
        }

        if (board[2].equals(board[4]) && board[2].equals(board[6]) && !board[2].isEmpty()) {
            declareWinner(board[2]);
        }

        // Check for tie
        boolean isTie = true;
        for (String cell : board) {
            if (cell.isEmpty()) {
                isTie = false;
                break;
            }
        }

        if (isTie) {
            statusLabel.setText("It's a tie!");
        }
    }

    private void declareWinner(String winner) {
        statusLabel.setText(winner + " wins!");
        disableButtons();
    }

    private void disableButtons() {
        for (JButton button : buttons) {
            button.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        new TicTacToeGUI();
    }
}
