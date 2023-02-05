package airport;

import rooms.Room;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StaticGUI {
	private static HashMap<JPanel, List> panels = new HashMap();
	
	private static double normalize(double min, double max, double value) {
	    return (value - min) / (max - min);
	}
	private static Color colorFor(double value) {
	    value = Math.max(0, Math.min(1, value));
	    int red = (int)(value * 255);
	    return new Color(red,255 - red,0);
	}

	public static void main(String[] args) {
		
		Airport airportlot = new Airport();
		airportlot.run();
		final List<List<Room>> airport = Airport.getAirport();

		HashMap<JLabel, String> labels = new HashMap();

		JLabel entrance = new JLabel();
		labels.put(entrance,"Entrance");

		
		JLabel entrance2 = new JLabel();
		labels.put(entrance2,"Entrance");

		
		JLabel entrance3 = new JLabel();
		labels.put(entrance3,"Entrance");

		
		JLabel baggageCheckIn = new JLabel();
		labels.put(baggageCheckIn,"BaggageCheckIn");

		
		JLabel checkIn = new JLabel();
		labels.put(checkIn,"CheckIn");

		
		JLabel checkIn2 = new JLabel();
		labels.put(checkIn2,"CheckIn");

		
		JLabel checkIn3 = new JLabel();
		labels.put(checkIn3,"CheckIn");

		
		JLabel checkIn4 = new JLabel();
		labels.put(checkIn4,"CheckIn VIP");

		
		JLabel security = new JLabel();
		labels.put(security,"Security");

		
		JLabel security2 = new JLabel();
		labels.put(security2,"Security");

		
		JLabel security3 = new JLabel();
		labels.put(security3,"Security");

		
		JLabel security4 = new JLabel();
		labels.put(security4,"Security VIP");

		
		JLabel shop = new JLabel();
		labels.put(shop,"Shop");

		
		JLabel shop2 = new JLabel();
		labels.put(shop2,"Shop");

		
		JLabel passportControl = new JLabel();
		labels.put(passportControl,"PassportControl");

		
		JLabel passportControl2 = new JLabel();
		labels.put(passportControl2,"PassportControl");

		
		JLabel terminal = new JLabel();
		labels.put(terminal,"Terminal");

		
		JLabel terminal2 = new JLabel();
		labels.put(terminal2,"Terminal");

		
		JLabel terminal3 = new JLabel();
		labels.put(terminal3,"Terminal");

		
		JLabel terminal4 = new JLabel();
		labels.put(terminal4,"Terminal");

		
		JLabel waitingRoom = new JLabel();
		labels.put(waitingRoom,"WaitingRoom");

		
		JLabel waitingRoom2 = new JLabel();
		labels.put(waitingRoom2,"WaitingRoom");

		
		JLabel waitingRoom3 = new JLabel();
		labels.put(waitingRoom3,"WaitingRoom");

		
		JLabel waitingRoom4 = new JLabel();
		labels.put(waitingRoom4,"WaitingRoom VIP");


		for (JLabel label:labels.keySet()){
			makeLabel(label, labels.get(label));
		}
		
		///////////////////
		
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
		panels.put(Panel4, Arrays.asList(airport.get(0).get(0), 200, 250, 100, 150));



		JPanel Panel5 = new JPanel();
		panels.put(Panel5,Arrays.asList(airport.get(0).get(1),200, 450, 100, 150));



		JPanel Panel6 = new JPanel();
		panels.put(Panel6,Arrays.asList(airport.get(0).get(2),200, 650, 100, 150));



		JPanel Panel7 = new JPanel();
		panels.put(Panel7,Arrays.asList(airport.get(2).get(0),325, 75, 200, 100));


		JPanel Panel8 = new JPanel();
		panels.put(Panel8,Arrays.asList(airport.get(1).get(0),325, 250, 200, 100));



		JPanel Panel9 = new JPanel();
		panels.put(Panel9,Arrays.asList(airport.get(1).get(1),325, 400, 200, 100));



		JPanel Panel10 = new JPanel();
		panels.put(Panel10,Arrays.asList(airport.get(1).get(2),325, 550, 200, 100));



		JPanel Panel11 = new JPanel();
		panels.put(Panel11,Arrays.asList(airport.get(5).get(0),550, 300, 150, 150));



		JPanel Panel12 = new JPanel();
		panels.put(Panel12,Arrays.asList(airport.get(5).get(1),550, 500, 150, 150));



		JPanel Panel13 = new JPanel();
		panels.put(Panel13,Arrays.asList(airport.get(4).get(0),550, 100, 150, 75));



		JPanel Panel14 = new JPanel();
		panels.put(Panel14,Arrays.asList(airport.get(4).get(1),550, 700, 150, 75));

		JPanel Panel15 = new JPanel();
		panels.put(Panel15,Arrays.asList(airport.get(6).get(0),750, 325, 150, 150));



		JPanel Panel16 = new JPanel();
		panels.put(Panel16,Arrays.asList(airport.get(6).get(1),750, 500, 150, 150));



		JPanel Panel17 = new JPanel();
		panels.put(Panel17,Arrays.asList(airport.get(6).get(2),750, 700, 150, 150));



		JPanel Panel18 = new JPanel();
		panels.put(Panel18,Arrays.asList(airport.get(7).get(0),950, 100, 100, 100));



		JPanel Panel19 = new JPanel();
		panels.put(Panel19,Arrays.asList(airport.get(7).get(1),950, 250, 100, 100));



		JPanel Panel20 = new JPanel();
		panels.put(Panel20,Arrays.asList(airport.get(7).get(2),950, 400, 100, 100));



		JPanel Panel21 = new JPanel();
		panels.put(Panel21,Arrays.asList(airport.get(7).get(3),950, 550, 100, 100));


		
		JPanel VIPPanel1 = new JPanel();
		panels.put(VIPPanel1,Arrays.asList(airport.get(1).get(0),200, 50, 100, 150));


		
		JPanel VIPPanel2 = new JPanel();
		panels.put(VIPPanel2,Arrays.asList(airport.get(1).get(0),325, 700, 200, 100));


		
		JPanel VIPPanel3 = new JPanel();
		panels.put(VIPPanel3,Arrays.asList(airport.get(6).get(3),750, 150, 150, 150));


		for (JPanel panel:panels.keySet()){
			makePanel(panel);
		}


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

		//repaint();
	}

	public static void makePanel(JPanel panel){
		panel.setBackground(colorFor(normalize(0, ((Room)panels.get(panel).get(0)).getMaxCapacity(),((Room)panels.get(panel).get(0)).getMaxCapacity())));
		panel.setBounds(200, 250, 100, 150);
		panel.setLayout(new BorderLayout());
	}

	public static void repaint(){
		for (JPanel panel:panels.keySet()){
			panel.setBackground(colorFor(normalize(0, ((Room)panels.get(panel).get(0)).getMaxCapacity(),((Room)panels.get(panel).get(0)).getMaxCapacity())));
		}

	}

	public static void makeLabel(JLabel label, String name){
		label.setText(name);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
	}
}