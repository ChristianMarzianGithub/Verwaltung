package verwaltung;


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class EintragPanel extends JPanel {

	
	private String title;
	private String storyLine;
	private String releaseDate;
	private int runTimeMin;
	private String country;
	private JLabel lblTitle = new JLabel();
	private JLabel lblReleaseDate = new JLabel();
	private JTextPane tpStoryLine = new JTextPane();
	private JLabel lblRunTimeMin = new JLabel();
	private JLabel lblCountry = new JLabel();
	private JLabel lblHandlung = new JLabel();
	private JPanel panelDetail = new JPanel();
	
	public EintragPanel(Film movie) {
		// TODO Auto-generated constructor stub
		
		this.title = movie.getTitle();
		this.storyLine = movie.getStoryLine();
		this.releaseDate = movie.getReleaseDate();
		this.runTimeMin = movie.getRunTimeMin();
		this.country = movie.getCountry();
		
		
		
		
				
		this.init();

		
		
		this.setLayout(null);
		panelDetail.setLocation(0,0);
		panelDetail.setSize(500, 500);

		panelDetail.setLayout(null);
		
		
		lblTitle.setLocation(0, 0);
		lblTitle.setSize(100,50);
		
		lblReleaseDate.setLocation(0, 25);
		lblReleaseDate.setSize(250,50);
		
		lblRunTimeMin.setLocation(0, 50);
		lblRunTimeMin.setSize(250,50);
		
		lblCountry.setLocation(0, 75);
		lblCountry.setSize(250,50);
		
		lblHandlung.setLocation(0, 100);
		lblHandlung.setSize(250,50);
		
		tpStoryLine.setLocation(0, 135);
		tpStoryLine.setSize(500,150);
		tpStoryLine.setOpaque(false);
		

		panelDetail.add(lblTitle );	
		panelDetail.add(lblReleaseDate);
		panelDetail.add(lblRunTimeMin);
		panelDetail.add(lblCountry);
		panelDetail.add(lblHandlung);
		panelDetail.add(tpStoryLine);
		
		this.add(panelDetail);
		
		this.setVisible(true);
	}

	public void init(){		
		lblTitle.setText("Titel: " + title );	
		lblReleaseDate.setText("ReleaseDate: " + releaseDate);
		lblRunTimeMin.setText("Laufzeit: " + runTimeMin);
		lblCountry.setText("Land: " + country);
		lblHandlung.setText("Handlung:");
		tpStoryLine.setText(storyLine);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;		
	}

	public String getStoryLine() {
		return storyLine;
	}

	public void setStoryLine(String storyLine) {
		this.storyLine = storyLine;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getRunTimeMin() {
		return runTimeMin;
	}

	public void setRunTimeMin(int runTimeMin) {
		this.runTimeMin = runTimeMin;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
