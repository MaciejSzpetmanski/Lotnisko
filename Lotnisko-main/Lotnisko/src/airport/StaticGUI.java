package airport;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import airport.Airport;
import rooms.Room;

public class StaticGUI {
	
	private static double normalize(double min, double max, double value) {
	    return (value - min) / (max - min);
	}
	private static Color colorFor(double value) {
	    value = Math.max(0, Math.min(1, value));
	    int red = (int)(value * 255);
	    return new Color(red,1 - red,0);
	}

	public static void main(String[] args) {
		
		//Airport airportlot = new Airport();
		airportlot.run();
		final List<List<Room>> airport = airportlot.getAirport();
		JLabel entrance = new JLabel();
		entrance.setText("Entrance");
		entrance.setVerticalAlignment(JLabel.CENTER);
		entrance.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel entrance2 = new JLabel();
		entrance2.setText("Entrance");
		entrance2.setVerticalAlignment(JLabel.CENTER);
		entrance2.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel entrance3 = new JLabel();
		entrance3.setText("Entrance");
		entrance3.setVerticalAlignment(JLabel.CENTER);
		entrance3.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel baggageCheckIn = new JLabel();
		baggageCheckIn.setText("BaggageCheckIn");
		baggageCheckIn.setVerticalAlignment(JLabel.CENTER);
		baggageCheckIn.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel checkIn = new JLabel();
		checkIn.setText("CheckIn");
		checkIn.setVerticalAlignment(JLabel.CENTER);
		checkIn.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel checkIn2 = new JLabel();
		checkIn2.setText("CheckIn");
		checkIn2.setVerticalAlignment(JLabel.CENTER);
		checkIn2.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel checkIn3 = new JLabel();
		checkIn3.setText("CheckIn");
		checkIn3.setVerticalAlignment(JLabel.CENTER);
		checkIn3.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel checkIn4 = new JLabel();
		checkIn4.setText("CheckIn VIP");
		checkIn4.setVerticalAlignment(JLabel.CENTER);
		checkIn4.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel security = new JLabel();
		security.setText("Security");
		security.setVerticalAlignment(JLabel.CENTER);
		security.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel security2 = new JLabel();
		security2.setText("Security");
		security2.setVerticalAlignment(JLabel.CENTER);
		security2.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel security3 = new JLabel();
		security3.setText("Security");
		security3.setVerticalAlignment(JLabel.CENTER);
		security3.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel security4 = new JLabel();
		security4.setText("Security VIP");
		security4.setVerticalAlignment(JLabel.CENTER);
		security4.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel shop = new JLabel();
		shop.setText("Shop");
		shop.setVerticalAlignment(JLabel.CENTER);
		shop.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel shop2 = new JLabel();
		shop2.setText("Shop");
		shop2.setVerticalAlignment(JLabel.CENTER);
		shop2.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel passportControl = new JLabel();
		passportControl.setText("PassportControl");
		passportControl.setVerticalAlignment(JLabel.CENTER);
		passportControl.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel passportControl2 = new JLabel();
		passportControl2.setText("PassportControl");
		passportControl2.setVerticalAlignment(JLabel.CENTER);
		passportControl2.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel terminal = new JLabel();
		terminal.setText("Terminal");
		terminal.setVerticalAlignment(JLabel.CENTER);
		terminal.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel terminal2 = new JLabel();
		terminal2.setText("Terminal");
		terminal2.setVerticalAlignment(JLabel.CENTER);
		terminal2.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel terminal3 = new JLabel();
		terminal3.setText("Terminal");
		terminal3.setVerticalAlignment(JLabel.CENTER);
		terminal3.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel terminal4 = new JLabel();
		terminal4.setText("Terminal");
		terminal4.setVerticalAlignment(JLabel.CENTER);
		terminal4.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel waitingRoom = new JLabel();
		waitingRoom.setText("WaitingRoom");
		waitingRoom.setVerticalAlignment(JLabel.CENTER);
		waitingRoom.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel waitingRoom2 = new JLabel();
		waitingRoom2.setText("WaitingRoom");
		waitingRoom2.setVerticalAlignment(JLabel.CENTER);
		waitingRoom2.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel waitingRoom3 = new JLabel();
		waitingRoom3.setText("WaitingRoom");
		waitingRoom3.setVerticalAlignment(JLabel.CENTER);
		waitingRoom3.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel waitingRoom4 = new JLabel();
		waitingRoom4.setText("WaitingRoom VIP");
		waitingRoom4.setVerticalAlignment(JLabel.CENTER);
		waitingRoom4.setHorizontalAlignment(JLabel.CENTER);
		
		///////////////////

		List<JPanel> panels = new ArrayList();
		
		JPanel Panel1 = new JPanel();
		Panel1.setBackground(Color.cyan);
		Panel1.setBounds(50, 100, 100, 150);
		Panel1.setLayout(new BorderLayout());
		
		JPanel Panel2 = new JPanel();
		Panel2.setBackground(Color.cyan);
		Panel2.setBounds(50, 300, 100, 150);
		Panel2.setLayout(new BorderLayout());

		JPanel Panel3 = new JPanel();
		Panel3.setBackground(Color.cyan);
		Panel3.setBounds(50, 500, 100, 150);
		Panel3.setLayout(new BorderLayout());

		JPanel Panel4 = new JPanel();
		Panel4.setBackground(colorFor(normalize(0,airport.get(0).get(0).getMaxCapacity(),airport.get(0).get(0).getCapacityNow())));
		Panel4.setBounds(200, 250, 100, 150);
		Panel4.setLayout(new BorderLayout());
		panels.add(Panel4);

		JPanel Panel5 = new JPanel();
		Panel5.setBackground(colorFor(normalize(0,airport.get(0).get(1).getMaxCapacity(),airport.get(0).get(1).getCapacityNow())));
		Panel5.setBounds(200, 450, 100, 150);
		Panel5.setLayout(new BorderLayout());
		panels.add(Panel5);

		JPanel Panel6 = new JPanel();
		Panel6.setBackground(colorFor(normalize(0,airport.get(0).get(2).getMaxCapacity(),airport.get(0).get(2).getCapacityNow())));
		Panel6.setBounds(200, 650, 100, 150);
		Panel6.setLayout(new BorderLayout());
		panels.add(Panel6);

		JPanel Panel7 = new JPanel();
		Panel7.setBackground(colorFor(normalize(0,airport.get(2).get(0).getMaxCapacity(),airport.get(2).get(0).getCapacityNow())));
		Panel7.setBounds(325, 75, 200, 100);
		Panel7.setLayout(new BorderLayout());
		panels.add(Panel7);

		JPanel Panel8 = new JPanel();
		Panel8.setBackground(colorFor(normalize(0,airport.get(1).get(0).getMaxCapacity(),airport.get(1).get(0).getCapacityNow())));
		Panel8.setBounds(325, 250, 200, 100);
		Panel8.setLayout(new BorderLayout());
		panels.add(Panel8);

		JPanel Panel9 = new JPanel();
		Panel9.setBackground(colorFor(normalize(0,airport.get(1).get(1).getMaxCapacity(),airport.get(1).get(1).getCapacityNow())));
		Panel9.setBounds(325, 400, 200, 100);
		Panel9.setLayout(new BorderLayout());
		panels.add(Panel9);

		JPanel Panel10 = new JPanel();
		Panel10.setBackground(colorFor(normalize(0,airport.get(1).get(2).getMaxCapacity(),airport.get(1).get(2).getCapacityNow())));
		Panel10.setBounds(325, 550, 200, 100);
		Panel10.setLayout(new BorderLayout());
		panels.add(Panel10);

		JPanel Panel11 = new JPanel();
		Panel11.setBackground(colorFor(normalize(0,airport.get(5).get(0).getMaxCapacity(),airport.get(5).get(0).getCapacityNow())));
		Panel11.setBounds(550, 300, 150, 150);
		Panel11.setLayout(new BorderLayout());
		panels.add(Panel11);

		JPanel Panel12 = new JPanel();
		Panel12.setBackground(colorFor(normalize(0,airport.get(5).get(1).getMaxCapacity(),airport.get(5).get(1).getCapacityNow())));
		Panel12.setBounds(550, 500, 150, 150);
		Panel12.setLayout(new BorderLayout());
		panels.add(Panel12);

		JPanel Panel13 = new JPanel();
		Panel13.setBackground(colorFor(normalize(0,airport.get(4).get(0).getMaxCapacity(),airport.get(4).get(0).getCapacityNow())));
		Panel13.setBounds(550, 100, 150, 75);
		Panel13.setLayout(new BorderLayout());
		panels.add(Panel13);

		JPanel Panel14 = new JPanel();
		Panel14.setBackground(colorFor(normalize(0,airport.get(4).get(1).getMaxCapacity(),airport.get(4).get(1).getCapacityNow())));
		Panel14.setBounds(550, 700, 150, 75);
		Panel14.setLayout(new BorderLayout());
		panels.add(Panel14);

		JPanel Panel15 = new JPanel();
		Panel15.setBackground(colorFor(normalize(0,airport.get(6).get(0).getMaxCapacity(),airport.get(6).get(0).getCapacityNow())));
		Panel15.setBounds(750, 325, 150, 150);
		Panel15.setLayout(new BorderLayout());
		panels.add(Panel14);

		JPanel Panel16 = new JPanel();
		Panel16.setBackground(colorFor(normalize(0,airport.get(6).get(1).getMaxCapacity(),airport.get(6).get(1).getCapacityNow())));
		Panel16.setBounds(750, 500, 150, 150);
		Panel16.setLayout(new BorderLayout());
		panels.add(Panel16);

		JPanel Panel17 = new JPanel();
		Panel17.setBackground(colorFor(normalize(0,airport.get(6).get(2).getMaxCapacity(),airport.get(6).get(2).getCapacityNow())));
		Panel17.setBounds(750, 700, 150, 150);
		Panel17.setLayout(new BorderLayout());
		panels.add(Panel17);

		JPanel Panel18 = new JPanel();
		Panel18.setBackground(colorFor(normalize(0,airport.get(7).get(0).getMaxCapacity(),airport.get(7).get(0).getCapacityNow())));
		Panel18.setBounds(950, 100, 100, 100);
		Panel18.setLayout(new BorderLayout());
		panels.add(Panel18);

		JPanel Panel19 = new JPanel();
		Panel19.setBackground(colorFor(normalize(0,airport.get(7).get(1).getMaxCapacity(),airport.get(7).get(1).getCapacityNow())));
		Panel19.setBounds(950, 250, 100, 100);
		Panel19.setLayout(new BorderLayout());
		panels.add(Panel19);

		JPanel Panel20 = new JPanel();
		Panel20.setBackground(colorFor(normalize(0,airport.get(7).get(2).getMaxCapacity(),airport.get(7).get(2).getCapacityNow())));
		Panel20.setBounds(950, 400, 100, 100);
		Panel20.setLayout(new BorderLayout());
		panels.add(Panel20);

		JPanel Panel21 = new JPanel();
		Panel21.setBackground(colorFor(normalize(0,airport.get(7).get(3).getMaxCapacity(),airport.get(7).get(3).getCapacityNow())));
		Panel21.setBounds(950, 550, 100, 100);
		Panel21.setLayout(new BorderLayout());
		panels.add(Panel21);

		
		
		
		JPanel VIPPanel1 = new JPanel();
		VIPPanel1.setBackground(colorFor(normalize(0,airport.get(1).get(0).getMaxCapacity(),airport.get(1).get(0).getCapacityNow())));
		VIPPanel1.setBounds(200, 50, 100, 150);
		VIPPanel1.setLayout(new BorderLayout());
		panels.add(VIPPanel1);
		
		JPanel VIPPanel2 = new JPanel();
		VIPPanel2.setBackground(colorFor(normalize(0,airport.get(1).get(0).getMaxCapacity(),airport.get(1).get(0).getCapacityNow())));
		VIPPanel2.setBounds(325, 700, 200, 100);
		VIPPanel2.setLayout(new BorderLayout());
		panels.add(VIPPanel2);
		
		JPanel VIPPanel3 = new JPanel();
		VIPPanel3.setBackground(colorFor(normalize(0,airport.get(6).get(3).getMaxCapacity(),airport.get(6).get(3).getCapacityNow())));
		VIPPanel3.setBounds(750, 150, 150, 150);
		VIPPanel3.setLayout(new BorderLayout());
		panels.add(VIPPanel3);

		//////////////////////
		
		JPanel borderPanel = new JPanel();
		borderPanel.setBackground(Color.darkGray);		
		
		//////////////////////
		
		JButton button = new JButton("Start");
		JButton button2 = new JButton("Stop");
		JButton button3 = new JButton("Submit");
		JTextField textField = new JTextField();
		
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font("Consolas",Font.PLAIN,35));
		textField.setForeground(new Color(0x00FF00));
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);
		
		//////////////////////
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(2000,2000);
		frame.setLayout(new BorderLayout(2000,25));
		frame.add(borderPanel,BorderLayout.EAST);
		frame.setVisible(true);
		Panel1.add(entrance2);
		Panel2.add(entrance);
		Panel3.add(entrance3);
		Panel4.add(checkIn);
		Panel5.add(checkIn2);
		Panel6.add(checkIn3);
		VIPPanel1.add(checkIn4);
		Panel7.add(baggageCheckIn);
		Panel8.add(security);
		Panel9.add(security2);
		Panel10.add(security3);
		VIPPanel2.add(security4);
		Panel11.add(shop);
		Panel12.add(shop2);
		Panel13.add(passportControl);
		Panel14.add(passportControl2);
		Panel15.add(waitingRoom);
		Panel16.add(waitingRoom2);
		Panel17.add(waitingRoom3);
		VIPPanel3.add(waitingRoom4);
		Panel18.add(terminal);
		Panel19.add(terminal2);
		Panel20.add(terminal3);
		Panel21.add(terminal4);
	
		frame.add(Panel1);
		frame.add(Panel2);
		frame.add(Panel3);
		frame.add(Panel4);
		frame.add(Panel5);
		frame.add(Panel6);
		frame.add(VIPPanel1);
		frame.add(Panel7);
		frame.add(Panel8);
		frame.add(Panel9);
		frame.add(Panel10);
		frame.add(VIPPanel2);
		frame.add(Panel11);
		frame.add(Panel12);
		frame.add(Panel13);
		frame.add(Panel14);
		frame.add(Panel15);
		frame.add(Panel16);
		frame.add(Panel17);
		frame.add(VIPPanel3);
		frame.add(Panel18);
		frame.add(Panel19);
		frame.add(Panel20);
		frame.add(Panel21);
		borderPanel.add(button);
		borderPanel.add(button2);
		borderPanel.add(button3);
		borderPanel.add(textField);
	}

	public static void repaint(List<JPanel> panels){

	}
}