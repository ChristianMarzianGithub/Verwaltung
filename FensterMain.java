package verwaltung;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;

public class FensterMain {
	
	public FensterMain(){
		
	}
	
	public static void createAndShowGUI() throws SQLException, ClassNotFoundException{
		// JFrame erzeugen
		JFrame frame = new JFrame("Verwaltung");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		//Where the GUI is created:
		JMenuBar menuBar;
		JMenu menu,menu1;
		JMenuItem menuItem1;
		JMenuItem menuItem2;
		
		DefaultListModel listModel;
		listModel = new DefaultListModel();
	

		//Create the menu bar.
		menuBar = new JMenuBar();

		//Build the first menu.
		menu = new JMenu("Datei");
		

		menuBar.add(menu);

		
		//a group of JMenuItems
		menuItem1 = new JMenuItem("Sprache");
		menuItem2 = new JMenuItem("Info");

		
		menu.add(menuItem1);
		menu.add(menuItem2);

		
		
		JPanel sideBarPanel = new JPanel();
		sideBarPanel.setBackground(Color.RED);
		sideBarPanel.setPreferredSize(new Dimension(200,500));
				
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.BLUE);
		
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.gray);
		topPanel.setPreferredSize(new Dimension(1000,50));
		topPanel.add(menuBar);
		
		ImageIcon img = new ImageIcon("C:/Users/Chris/Desktop/verwaltungIcon.jpg");
		frame.setIconImage(img.getImage());
		
		frame.setPreferredSize(new Dimension(1000,500));
				
		
		
		

		JList jlist = new JList(CalcVerwaltung.getData());
		jlist.setFixedCellHeight(50);
		jlist.addMouseListener(new MouseAdapter(){
	          @Override
	          public void mouseClicked(MouseEvent e) {
	              System.out.println("Mouse click.");
	              int index = jlist.getSelectedIndex();
	              System.out.println("Index Selected: " + index);
	              String s = (String) jlist.getSelectedValue();
	              System.out.println("Value Selected: " + s.toString());
	          }
	    });
		
		
	    JScrollPane scrollPane1 = new JScrollPane(jlist);
	    scrollPane1.setPreferredSize(new Dimension(200,500));
		
		// ContentPane haelt standardmaeﬂig ein BorderLayout
		frame.getContentPane().add(menuBar, BorderLayout.PAGE_START);
		frame.getContentPane().add(centerPanel, BorderLayout.CENTER);
		frame.getContentPane().add(scrollPane1, BorderLayout.LINE_START);
		
		// Framegroeﬂe anpassen
		// Frame sichtbar machen
		
		frame.pack();
		
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
	}
}
