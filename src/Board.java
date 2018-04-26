import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;


public class Board {

	private JFrame frame;
	private JLabel[] board;
	private JPanel panel;
	/**
	 * @wbp.nonvisual location=136,341
	 */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Board window = new Board();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Board() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(100, 100, 300, 678);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(25,13,0,0));
		
		board = new JLabel[325];
		for(int i = 0; i < 325; i++){
			board[i] = new JLabel();
			board[i].setBorder(new LineBorder(Color.black));
			board[i].setOpaque(true);
		}
		updateBoard();

		
		board[40].setBackground(Color.red);
		updateBoard();
	}
		

	private void updateBoard(){
		panel.removeAll();
		for(int i = 0; i < 325; i++){
			panel.add(board[i]);
		}
	}
}

