package airport;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StaticGUI {

	public static void main(String[] args) {
		
		JLabel entrance = new JLabel();
		entrance.setText("Entrance");
		entrance.setVerticalAlignment(JLabel.CENTER);
		entrance.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel entrance2 = new JLabel();
		entrance.setText("Entrance");
		entrance.setVerticalAlignment(JLabel.CENTER);
		entrance.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel baggageCheckIn = new JLabel();
		baggageCheckIn.setText("BaggageCheckIn");
		baggageCheckIn.setVerticalAlignment(JLabel.CENTER);
		baggageCheckIn.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel checkIn = new JLabel();
		checkIn.setText("CheckIn");
		checkIn.setVerticalAlignment(JLabel.CENTER);
		checkIn.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel security = new JLabel();
		security.setText("Security");
		security.setVerticalAlignment(JLabel.CENTER);
		security.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel shop = new JLabel();
		shop.setText("Shop");
		shop.setVerticalAlignment(JLabel.CENTER);
		shop.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel passportControl = new JLabel();
		passportControl.setText("PassportControl");
		passportControl.setVerticalAlignment(JLabel.CENTER);
		passportControl.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel terminal = new JLabel();
		terminal.setText("Terminal");
		terminal.setVerticalAlignment(JLabel.CENTER);
		terminal.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel waitingRoom = new JLabel();
		waitingRoom.setText("WaitingRoom");
		waitingRoom.setVerticalAlignment(JLabel.CENTER);
		waitingRoom.setHorizontalAlignment(JLabel.CENTER);
		
		///////////////////
		
		JPanel redPanel1 = new JPanel();
		redPanel1.setBackground(Color.red);
		redPanel1.setBounds(50, 100, 100, 150);
		redPanel1.setLayout(new BorderLayout());
		
		JPanel redPanel2 = new JPanel();
		redPanel2.setBackground(Color.red);
		redPanel2.setBounds(50, 300, 100, 150);
		redPanel2.setLayout(new BorderLayout());
		
		JPanel redPanel3 = new JPanel();
		redPanel3.setBackground(Color.red);
		redPanel3.setBounds(50, 500, 100, 150);
		redPanel3.setLayout(new BorderLayout());
		
		JPanel bluePanel1 = new JPanel();
		bluePanel1.setBackground(Color.blue);
		bluePanel1.setBounds(250, 250, 50, 150);
		bluePanel1.setLayout(new BorderLayout());
		
		JPanel bluePanel2 = new JPanel();
		bluePanel2.setBackground(Color.blue);
		bluePanel2.setBounds(250, 350, 50, 150);
		bluePanel2.setLayout(new BorderLayout());
		
		
		JPanel bluePanel3 = new JPanel();
		bluePanel3.setBackground(Color.blue);
		bluePanel3.setBounds(250, 450, 50, 150);
		bluePanel3.setLayout(new BorderLayout());
		
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(new BorderLayout());
		
		//////////////////////
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(700,2000);
		frame.setVisible(true);
		redPanel1.add(entrance2);
		redPanel2.add(entrance2);
		redPanel3.add(entrance);
		bluePanel1.add(checkIn);
		bluePanel2.add(checkIn);
		bluePanel3.add(checkIn);
		frame.add(redPanel1);
		frame.add(redPanel2);
		frame.add(redPanel3);
		frame.add(bluePanel1);
		frame.add(bluePanel2);
		frame.add(bluePanel3);
		frame.add(greenPanel);
	}
}