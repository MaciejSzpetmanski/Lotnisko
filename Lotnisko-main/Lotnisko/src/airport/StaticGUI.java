package airport;

import rooms.Room;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticGUI {
	private static List<List> panels = new ArrayList<>();
	
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
		Airport.Initiate(5,5,5,5,5,5,5,5,5,5);

		final List<List<Room>> airport = Airport.getAirport();

		List<List> labels = new ArrayList<>();

		JLabel entrance = new JLabel();
		labels.add(Arrays.asList(entrance,"Entrance"));

		
		JLabel entrance2 = new JLabel();
		labels.add(Arrays.asList(entrance2,"Entrance"));

		
		JLabel entrance3 = new JLabel();
		labels.add(Arrays.asList(entrance3,"Entrance"));

		
		JLabel baggageCheckIn = new JLabel();
		labels.add(Arrays.asList(baggageCheckIn,"BaggageCheckIn"));

		
		JLabel checkIn = new JLabel();
		labels.add(Arrays.asList(checkIn,"CheckIn"));

		
		JLabel checkIn2 = new JLabel();
		labels.add(Arrays.asList(checkIn2,"CheckIn"));

		
		JLabel checkIn3 = new JLabel();
		labels.add(Arrays.asList(checkIn3,"CheckIn"));

		
		JLabel checkIn4 = new JLabel();
		labels.add(Arrays.asList(checkIn4,"CheckIn VIP"));

		
		JLabel security = new JLabel();
		labels.add(Arrays.asList(security,"Security"));

		
		JLabel security2 = new JLabel();
		labels.add(Arrays.asList(security2,"Security"));

		
		JLabel security3 = new JLabel();
		labels.add(Arrays.asList(security3,"Security"));

		
		JLabel security4 = new JLabel();
		labels.add(Arrays.asList(security4,"Security VIP"));

		
		JLabel shop = new JLabel();
		labels.add(Arrays.asList(shop,"Shop"));

		
		JLabel shop2 = new JLabel();
		labels.add(Arrays.asList(shop2,"Shop"));

		
		JLabel passportControl = new JLabel();
		labels.add(Arrays.asList(passportControl,"PassportControl"));

		
		JLabel passportControl2 = new JLabel();
		labels.add(Arrays.asList(passportControl2,"PassportControl"));

		
		JLabel terminal = new JLabel();
		labels.add(Arrays.asList(terminal,"Terminal"));

		
		JLabel terminal2 = new JLabel();
		labels.add(Arrays.asList(terminal2,"Terminal"));

		
		JLabel terminal3 = new JLabel();
		labels.add(Arrays.asList(terminal3,"Terminal"));

		
		JLabel terminal4 = new JLabel();
		labels.add(Arrays.asList(terminal4,"Terminal"));

		
		JLabel waitingRoom = new JLabel();
		labels.add(Arrays.asList(waitingRoom,"WaitingRoom"));

		
		JLabel waitingRoom2 = new JLabel();
		labels.add(Arrays.asList(waitingRoom2,"WaitingRoom"));

		
		JLabel waitingRoom3 = new JLabel();
		labels.add(Arrays.asList(waitingRoom3,"WaitingRoom"));

		
		JLabel waitingRoom4 = new JLabel();
		labels.add(Arrays.asList(waitingRoom4,"WaitingRoom VIP"));


		for (List l:labels){
			makeLabel((JLabel)l.get(0), (String) l.get(1));
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
		panels.add(Arrays.asList(Panel4, airport.get(0).get(0), 200, 250, 100, 150));



		JPanel Panel5 = new JPanel();
		panels.add(Arrays.asList(Panel5, airport.get(0).get(1),200, 450, 100, 150));



		JPanel Panel6 = new JPanel();
		panels.add(Arrays.asList(Panel6, airport.get(0).get(2),200, 650, 100, 150));



		JPanel Panel7 = new JPanel();
		panels.add(Arrays.asList(Panel7,airport.get(2).get(0),325, 75, 200, 100));


		JPanel Panel8 = new JPanel();
		panels.add(Arrays.asList(Panel8,airport.get(1).get(0),325, 250, 200, 100));



		JPanel Panel9 = new JPanel();
		panels.add(Arrays.asList(Panel9,airport.get(1).get(1),325, 400, 200, 100));



		JPanel Panel10 = new JPanel();
		panels.add(Arrays.asList(Panel10,airport.get(1).get(2),325, 550, 200, 100));



		JPanel Panel11 = new JPanel();
		panels.add(Arrays.asList(Panel11,airport.get(5).get(0),550, 300, 150, 150));



		JPanel Panel12 = new JPanel();
		panels.add(Arrays.asList(Panel12,airport.get(5).get(1),550, 500, 150, 150));



		JPanel Panel13 = new JPanel();
		panels.add(Arrays.asList(Panel13,airport.get(4).get(0),550, 100, 150, 75));



		JPanel Panel14 = new JPanel();
		panels.add(Arrays.asList(Panel14,airport.get(4).get(1),550, 700, 150, 75));

		JPanel Panel15 = new JPanel();
		panels.add(Arrays.asList(Panel15,airport.get(6).get(0),750, 325, 150, 150));



		JPanel Panel16 = new JPanel();
		panels.add(Arrays.asList(Panel16,airport.get(6).get(1),750, 500, 150, 150));



		JPanel Panel17 = new JPanel();
		panels.add(Arrays.asList(Panel17,airport.get(6).get(2),750, 700, 150, 150));



		JPanel Panel18 = new JPanel();
		panels.add(Arrays.asList(Panel18,airport.get(7).get(0),950, 100, 100, 100));



		JPanel Panel19 = new JPanel();
		panels.add(Arrays.asList(Panel19,airport.get(7).get(1),950, 250, 100, 100));



		JPanel Panel20 = new JPanel();
		panels.add(Arrays.asList(Panel20,airport.get(7).get(2),950, 400, 100, 100));



		JPanel Panel21 = new JPanel();
		panels.add(Arrays.asList(Panel21,airport.get(7).get(3),950, 550, 100, 100));


		
		JPanel VIPPanel1 = new JPanel();
		panels.add(Arrays.asList(VIPPanel1,airport.get(1).get(0),200, 50, 100, 150));


		
		JPanel VIPPanel2 = new JPanel();
		panels.add(Arrays.asList(VIPPanel2,airport.get(1).get(0),325, 700, 200, 100));


		
		JPanel VIPPanel3 = new JPanel();
		panels.add(Arrays.asList(VIPPanel3,airport.get(6).get(3),750, 150, 150, 150));


		makePanel();


		//////////////////////
		
		JPanel borderPanel = new JPanel();
		JPanel borderPanel2 = new JPanel();
		borderPanel.setBackground(Color.darkGray);
		borderPanel2.setBackground(Color.darkGray);
		
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

		List<List> texts = new ArrayList<>();
		//List<JLabel> textLabels = new ArrayList<>();

		JLabel lCI = new JLabel("CheckIns:");
		//textLabels.add(lCI);
		JTextField tCI = new JTextField();
		texts.add(Arrays.asList(lCI,tCI));

		JLabel lS = new JLabel("Security:");
		//textLabels.add(lS);
		JTextField tS = new JTextField();
		texts.add(Arrays.asList(lS,tS));

		JLabel lPC = new JLabel("Passport Controll:");
		//textLabels.add(lPC);
		JTextField tPC = new JTextField();
		texts.add(Arrays.asList(lPC,tPC));

		JLabel lSh = new JLabel("Shops:");
		//textLabels.add(lSh);
		JTextField tSh = new JTextField();
		texts.add(Arrays.asList(lSh,tSh));

		JLabel lBC = new JLabel("Baggage CheckIn:");
		//textLabels.add(lBC);
		JTextField tBC = new JTextField();
		texts.add(Arrays.asList(lBC,tBC));

		JLabel lWR = new JLabel("Waiting Rooms:");
		//textLabels.add(lWR);
		JTextField tWR = new JTextField();
		texts.add(Arrays.asList(lWR,tWR));

		JLabel lT = new JLabel("Termianls:");
		//textLabels.add(lT);
		JTextField tT = new JTextField();
		texts.add(Arrays.asList(lT,tT));

		JButton b = new JButton("submit");
		

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
		//borderPanel2.setSize(10,10);
		borderPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		borderPanel.add(button,gbc);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;
		gbc.gridy = 0;
		borderPanel.add(button2,gbc);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 1;
		borderPanel.add(button3,gbc);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;
		gbc.gridy = 1;
		borderPanel.add(textField,gbc);

		int i=2;
		for (List l:texts) {
			((JLabel)l.get(0)).setForeground(Color.WHITE);
			gbc.fill = GridBagConstraints.HORIZONTAL;
			gbc.gridx = 0;
			gbc.gridy = i;
			borderPanel.add((Component) l.get(0), gbc);
			gbc.gridx = 1;
			gbc.gridy = i;
			borderPanel.add((Component) l.get(1),gbc);
			i++;
		}
		gbc.gridx = 0;
		gbc.gridy = 10;
		borderPanel.add(b,gbc);

		//airportlot.run();
	}

	public static void makePanel(){
		for (List l:panels){
			//makePanel((JPanel)l.get(0));
			((JPanel)l.get(0)).setBackground(colorFor(normalize(0, ((Room)l.get(1)).getMaxCapacity(),((Room)l.get(1)).getCapacityNow())));
			((JPanel)l.get(0)).setBounds((Integer) l.get(2), (Integer) l.get(3), (Integer) l.get(4), (Integer) l.get(5));
			((JPanel)l.get(0)).setLayout(new BorderLayout());
		}

	}

	public static void refresh(){
		for (List l:panels){
			((JPanel)l.get(0)).setBackground(colorFor(normalize(0, ((Room)l.get(1)).getMaxCapacity(),((Room)l.get(1)).getCapacityNow())));
		}

	}

	public static void makeLabel(JLabel label, String name){
		label.setText(name);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
	}
	
	public static void makeTextField(TextField t1){
		t1.setPreferredSize(new Dimension(250,40));
		t1.setFont(new Font("Consolas",Font.PLAIN,35));
		t1.setForeground(new Color(0x00FF00));
		t1.setBackground(Color.black);
		//t1.setCaretColor(Color.white);
	}
}