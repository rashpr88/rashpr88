package n;

import java.awt.EventQueue;




import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Panel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.TitledBorder;

import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import com.toedter.calendar.JDateChooser;
import java.awt.SystemColor;
import com.toedter.calendar.JDayChooser;

public class book  {

	private JFrame frame;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	JButton b5 = new JButton("Book");
	static JDateChooser dateChooser = new JDateChooser();
	static JDateChooser dateChooser_1 = new JDateChooser();
	JLabel lblNewLabel_7 = new JLabel("Select room no :");
	static JComboBox comboBox = new JComboBox();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					book window = new book();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the application.
	 * 
	 */
	
	
	JPanel panel = new JPanel();
	JPanel panel_2 = new JPanel();
	private static JTextField textField_4;
	private JTextField textField_5;
	private static JTextField textField_6;
	private JTextField textField_7;
	private static JTextField textField_8;
    
	
	
	
	public book() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 930, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		
		JButton b1 = new JButton("Luxury Single Room");
		b1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		b1.setBackground(new Color(0, 204, 255));
		b1.setBounds(167, 77, 166, 30);
		frame.getContentPane().add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b1) {
					Component[] comp = panel_2.getComponents();
					for(int n=0; n<comp.length; n++) {
						comp[n].setEnabled(false);
					}
					textField_8.setText("Luxury Single Room");
					textField_8.setVisible(true);
					lblNewLabel_7.setVisible (false);
					lblNewLabel_7.setOpaque(false);
					comboBox.setVisible(false);
				}
					
			}
		});
		
		
		JButton b2 = new JButton("Delux Single Room");
		b2.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		b2.setBackground(new Color(0, 153, 204));
		b2.setBounds(343, 77, 167, 30);
		frame.getContentPane().add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b2) {
					Component[] comp = panel_2.getComponents();
					for(int n=0; n<comp.length; n++) {
						comp[n].setEnabled(false);
					}
					textField_8.setText("Delux Single Room");
					textField_8.setVisible(true);
					lblNewLabel_7.setVisible (false);
					lblNewLabel_7.setOpaque(false);
					comboBox.setVisible(false);
				}
					
			}
		});
		
		JButton b3 = new JButton("Luxury Double Room");
		b3.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		b3.setForeground(Color.WHITE);
		b3.setBackground(new Color(0, 51, 204));
		b3.setBounds(520, 77, 189, 30);
		frame.getContentPane().add(b3);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b3) {
					Component[] comp = panel_2.getComponents();
					for(int n=0; n<comp.length; n++) {
						comp[n].setEnabled(true);
					}
					textField_8.setText("Luxury Double Room");
					textField_8.setVisible(true);
					lblNewLabel_7.setVisible (false);
					lblNewLabel_7.setOpaque(false);
					comboBox.setVisible(false);
					
				}
					
			}
		});
		
		JButton b4 = new JButton("Delux Double Room");
		b4.setForeground(Color.WHITE);
		b4.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		b4.setBackground(new Color(0, 51, 153));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b4) {
					Component[] comp = panel_2.getComponents();
					for(int n=0; n<comp.length; n++) {
						comp[n].setEnabled(true);
					}
					textField_8.setText("Delux Double Room");
					textField_8.setVisible(true);
					lblNewLabel_7.setVisible (false);
					lblNewLabel_7.setOpaque(false);
					comboBox.setVisible(false);
					
					
				}
					
			}
		});
		b4.setBounds(719, 77, 184, 30);
		frame.getContentPane().add(b4);
		
		
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Customer1 details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(21, 277, 384, 173);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		//panel.setVisible(false);
		
		textField = new JTextField();
		textField.setBounds(107, 22, 244, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel l2 = new JLabel("name");
		l2.setBounds(10, 25, 46, 14);
		panel.add(l2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(107, 53, 244, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(107, 84, 244, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(107, 115, 244, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("add");
		lblNewLabel_3.setBounds(10, 56, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("id");
		lblNewLabel_4.setBounds(10, 87, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("con");
		lblNewLabel_5.setBounds(10, 118, 46, 14);
		panel.add(lblNewLabel_5);
		
		
		
		
		b5.setForeground(Color.BLACK);
		b5.setBackground(Color.GREEN);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==b5 && textField_6.getText()==null) {
					
					single_booking();
				}
				else {
					double_booking();
				}
			}
		});
		b5.setBounds(352, 480, 89, 42);
		frame.getContentPane().add(b5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 0));
		panel_1.setBounds(0, 0, 924, 53);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Booking");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose room type :");
		lblNewLabel_1.setBackground(new Color(255, 255, 204));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(20, 79, 142, 22);
		lblNewLabel_1.setOpaque(true);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Check in :");
		lblNewLabel_2.setBackground(new Color(255, 255, 204));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(21, 158, 72, 30);
		lblNewLabel_2.setOpaque(true);
		frame.getContentPane().add(lblNewLabel_2);
		

		
		JLabel lblNewLabel_6 = new JLabel("Check out : ");
		lblNewLabel_6.setBackground(new Color(255, 255, 204));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(501, 159, 82, 30);
		lblNewLabel_6.setOpaque(true);
		frame.getContentPane().add(lblNewLabel_6);
		
		
		panel_2.setBorder(new TitledBorder(null, "Customer2 details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(501, 277, 402, 173);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		textField_5 = new JTextField();
		textField_5.setBounds(138, 84, 226, 20);
		textField_5.setColumns(10);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(138, 21, 226, 20);
		textField_6.setColumns(10);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(138, 115, 226, 20);
		textField_7.setColumns(10);
		panel_2.add(textField_7);
		
		textField_4 = new JTextField();
		textField_4.setBounds(138, 53, 226, 20);
		textField_4.setColumns(10);
		panel_2.add(textField_4);
		
		JLabel l2_1 = new JLabel("name");
		l2_1.setBounds(24, 24, 46, 14);
		panel_2.add(l2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("add");
		lblNewLabel_3_1.setBounds(24, 56, 46, 14);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("id");
		lblNewLabel_4_1.setBounds(24, 87, 46, 14);
		panel_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("con");
		lblNewLabel_5_1.setBounds(24, 118, 46, 14);
		panel_2.add(lblNewLabel_5_1);
		
		
	    comboBox.setBounds(436, 224, 120, 22);
		frame.getContentPane().add(comboBox);
     	comboBox.setVisible (false);
		
		JButton btnNewButton = new JButton("Check  Available Rooms\r\n");
		btnNewButton.setBackground(new Color(204, 255, 0));
		
		// Checking room availability
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton)   {
					if (dateChooser.getDate() == null || dateChooser_1.getDate() == null) {
						JOptionPane.showMessageDialog(null, "Please pick both check in and check out dates ","Missing Check in",JOptionPane.WARNING_MESSAGE);
						
					}
					
						
					
					else if (textField_8.getText().isEmpty()) {
					
						
					
						JOptionPane.showMessageDialog(null, "Please pick a room type ","Missing Room Type",JOptionPane.WARNING_MESSAGE);
						
					}
						
					else {
						
						
					
					lblNewLabel_7.setVisible (true);
					lblNewLabel_7.setOpaque(true);
					
					
						
						try {
							getRooms();
						} catch (IOException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
						
					}
			
		}
		}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(21, 217, 196, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.setBounds(814, 499, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
		lblNewLabel_7.setBackground(new Color(255, 255, 204));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(274, 218, 131, 30);
		lblNewLabel_7.setVisible(false);
		lblNewLabel_7.setOpaque(false);
		frame.getContentPane().add(lblNewLabel_7);
		
		JButton btnNewButton_2 = new JButton("Cancel");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_2) {
					
				}
			}
		});
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setBounds(464, 480, 99, 42);
		frame.getContentPane().add(btnNewButton_2);
		
		
		dateChooser.setBounds(167, 158, 166, 30);
		frame.getContentPane().add(dateChooser);
		
	    
		dateChooser_1.setBounds(670, 158, 110, 30);
		frame.getContentPane().add(dateChooser_1);
		
		textField_8 = new JTextField();
		textField_8.setBounds(167, 118, 166, 30);
		textField_8.setVisible(false);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
	}


	

	public static void  double_booking() {
		//File handling or db
		if (textField_8.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please pick a room type ","title",JOptionPane.WARNING_MESSAGE);
			
		}
		else if (dateChooser.getDate() == null || dateChooser_1.getDate() == null) {
			JOptionPane.showMessageDialog(null, "Please pick both check in and check out dates ","Missing Check in",JOptionPane.WARNING_MESSAGE);
		}
		else if (comboBox.getSelectedItem() == null) {
			JOptionPane.showMessageDialog(null, "Please pick the desired room no by checking available rooms. ","Missing Check in",JOptionPane.WARNING_MESSAGE);
		}
		
		 
		 
		
		else {
			if (textField.getText().isEmpty() || textField_1.getText().isEmpty() || textField_2.getText().isEmpty() || textField_3.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please complete customer_1 details ","title",JOptionPane.WARNING_MESSAGE);
				
			}
			else {	
				Date ci = dateChooser.getDate();
				Date co = dateChooser_1.getDate();
				DateFormat df =new SimpleDateFormat("yyyy-MM-dd");
				
				String sd = df.format(ci);
				String  ed= df.format(co);
				
				LocalDate s = LocalDate.parse(sd);
				LocalDate e = LocalDate.parse(ed);
				java.util.List<LocalDate> dates = s.datesUntil(e.plusDays(1)).collect(Collectors.toList());
				int i;
				for (i=0;  i < dates.size();i++) {
					
					LocalDate date = dates.get(i);
					String cdetails = " Name = "+textField.getText()+ "\n Address = "+textField_1.getText()+"\n ID = "+textField_2.getText()+"\n Contact No. ="+textField_3.getText()+
							 "\n Room No. - "+comboBox.getSelectedItem()+"\n Room Type - "+textField_8.getText()+"\n *****************************************************************************************************";
					 File allrooms = new File("C:\\Users\\Rashini De Silva\\Desktop\\"+date+".txt");
					 String roomno =comboBox.getSelectedItem()+",";
					 File bytype = new File("C:\\Users\\Rashini De Silva\\Desktop\\"+textField_8.getText()+date+".txt");
					 File byroom = new File("C:\\Users\\Rashini De Silva\\Desktop\\"+comboBox.getSelectedItem()+date+".txt");
					 if (byroom.exists()==true) {
						 JOptionPane.showMessageDialog(null, "Please check room availabilty and select a room no for the dates selected. ","Booking Unavailable",JOptionPane.WARNING_MESSAGE);
						 break;
						 
					 }
					 else {
					 try {
						FileWriter w1 = new FileWriter("C:\\Users\\Rashini De Silva\\Desktop\\"+date+".txt");
						w1.write(roomno);
						 w1.close();
						 FileWriter w2 = new FileWriter("C:\\Users\\Rashini De Silva\\Desktop\\"+textField_8.getText()+date+".txt");
							w2.write(roomno);
							 w2.close();
							 FileWriter w3 = new FileWriter("C:\\Users\\Rashini De Silva\\Desktop\\"+comboBox.getSelectedItem()+date+".txt");
								w3.write(cdetails);
								 w3.close();
								 
								 if (i +1 == dates.size()  ) {
									 JOptionPane.showMessageDialog(null, "Room no - "+comboBox.getSelectedItem()+" is successfully booked by "+ textField.getText()+".","Booking Success",JOptionPane.INFORMATION_MESSAGE);
									 
								 }
						
					} 
					
					 
					 catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();

					 }
					 }
					
				}
				
				
					
				
				
				//String days = Days.daysBetween(dateChooser.getDate(), dateChooser_1.getDate()).getDays() ;
				
				 
		
			}
		}
		 
	}

	
	public static void single_booking() {
		// TODO Auto-generated method stub
		String q = " textField.getText() +textField_1.getText()";
	}
	
	public static void getRooms() throws IOException  {
		comboBox.removeAllItems();
		Date ci = dateChooser.getDate();
		Date co = dateChooser_1.getDate();
		DateFormat df =new SimpleDateFormat("yyyy-MM-dd");
		
		String sd = df.format(ci);
		String  ed= df.format(co);
		
		LocalDate s = LocalDate.parse(sd);
		LocalDate e = LocalDate.parse(ed);
		java.util.List<LocalDate> dates = s.datesUntil(e.plusDays(1)).collect(Collectors.toList());
		List<String> list = new ArrayList<String>();
		int i ;
		for (int in=0;  in < dates.size();in++) {
			LocalDate date = dates.get(in);
			Path path = Paths.get("C:\\Users\\Rashini De Silva\\Desktop\\"+textField_8.getText()+date+".txt");
			if(Files.exists(path)) {
			byte [] d = Files.readAllBytes(Paths.get("C:\\Users\\Rashini De Silva\\Desktop\\"+textField_8.getText()+date+".txt"));
			String  an = new String(d);
			String [] n1 = an.split(",");
			List<String> li1 = new ArrayList(Arrays.asList(n1));
			list.addAll(li1);
			
			}
			else {
				list.add("");
			}
			if(in+1 == dates.size()) {
				byte[] f = Files.readAllBytes(Paths.get("C:\\Users\\Rashini De Silva\\Desktop\\"+textField_8.getText()+".txt"));
				String  bn = new String(f);
				String [] n2 = bn.split(",");
				List<String> li2 = new ArrayList(Arrays.asList(n2));
				li2.removeAll(list);
			for (int n=0; n<li2.size(); n++ ) {
				comboBox.addItem(li2.get(n));
			
				
			}
				 
			comboBox.setVisible (true);
				
			} 
			
			 
		     
			 }
		
        
	}
		
		
		
		
	}



	


