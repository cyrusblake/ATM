package ATM;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame{
	
	private final int window_width = 500;
	private final int window_height = 300;
	
	public Main() {
		// set the title bar text.
		setTitle("Grid Layout");
		
		// set the size of the window.
		setSize(window_width, window_height);
		
		// specify an action for the close button.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Add GridLayout manager to the content pane.
		setLayout(new GridLayout(4,4));
		
		//other buttons
		
		
		// Create six buttons
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton buttonX = new JButton("X");
		
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton buttonI = new JButton("|");
		
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton buttonO = new JButton("O");
		
		JButton button10 = new JButton("+");
		JButton button11 = new JButton("0");
		JButton button12 = new JButton("-");
		JButton buttonb = new JButton("");
		
		//Set button color
		buttonX.setBackground(Color.red);
		buttonI.setBackground(Color.yellow);
		buttonO.setBackground(Color.green);
		
		// Add the six buttons to the content pane.
		add(button1, BorderLayout.SOUTH);
		add(button2, BorderLayout.SOUTH);
		add(button3, BorderLayout.SOUTH);
		add(buttonX, BorderLayout.SOUTH);
		
		add(button4, BorderLayout.SOUTH);
		add(button5, BorderLayout.SOUTH);
		add(button6, BorderLayout.SOUTH);
		add(buttonI, BorderLayout.SOUTH);
		
		add(button7, BorderLayout.SOUTH);
		add(button8, BorderLayout.SOUTH);
		add(button9, BorderLayout.SOUTH);
		add(buttonO, BorderLayout.SOUTH);
		
		add(button10, BorderLayout.SOUTH);
		add(button11, BorderLayout.SOUTH);
		add(button12, BorderLayout.SOUTH);
		add(buttonb, BorderLayout.SOUTH);
		
		button1.addActionListener(new ButtonListener());
		
		
		//Display the window
		setVisible(true);
		
		
	}
	
	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, "Hello");
		}
		
	}
	
	
	public static void main(String[] args) {
		new Main();

	}

}
