package verwaltung;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class FensterMain {
	
	public FensterMain(){
		
	}
	
	public static void createAndShowGUI(){
		// JFrame erzeugen
		JFrame frame = new JFrame("Verwaltung");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel sideBarPanel = new JPanel();
		sideBarPanel.setBackground(Color.RED);
		sideBarPanel.setPreferredSize(new Dimension(200,500));
		
		
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.BLUE);
		
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.gray);
		topPanel.setPreferredSize(new Dimension(1000,50));
		
		ImageIcon img = new ImageIcon("C:/Users/Chris/Desktop/verwaltungIcon.jpg");
		frame.setIconImage(img.getImage());
		
		
		String labels[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "B", "C", "D", 
				"E", "F", "G", "H", "I", "J", "B", "C", "D", "E", "F", "G", "H", "I", "J",
				"B", "C", "D", "E", "F", "G", "H", "I", "J" };
		JList jlist = new JList(labels);
	    JScrollPane scrollPane1 = new JScrollPane(jlist);
	    scrollPane1.setPreferredSize(new Dimension(200,500));
		
		// ContentPane haelt standardmaeßig ein BorderLayout
		frame.getContentPane().add(topPanel, BorderLayout.PAGE_START);
		frame.getContentPane().add(centerPanel, BorderLayout.CENTER);
		frame.getContentPane().add(scrollPane1, BorderLayout.LINE_START);
		
		// Framegroeße anpassen
		// Frame sichtbar machen
		
		frame.pack();
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
