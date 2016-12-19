package verwaltung;


import java.awt.Color;
import java.awt.Dimension;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class EintragPanel extends JPanel {

	
	private String title;
	private String storyLine;
	private Date releaseDate = new Date();
	private int runTimeMin;
	private String country;
	private JLabel lblTitle = new JLabel();
	private JLabel lblRD = new JLabel();
	
	
	public EintragPanel(Film movie) {
		// TODO Auto-generated constructor stub
		
		this.title = movie.getTitle();
		this.storyLine = movie.getStoryLine();
		this.releaseDate = movie.getReleaseDate();
		this.runTimeMin = movie.getRunTimeMin();
		this.country = movie.getCountry();
		
		
		
		
				
		this.init();

		
		lblTitle.setOpaque(true);
		lblTitle.setBackground(Color.YELLOW);
		
		
		lblRD.setOpaque(true);
		lblRD.setBackground(Color.YELLOW);
//		this.setLayout(null);
//		lblTitle.setLocation(10, 100);
//		lblTitle.setSize(200,25);
		
		
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.add(lblTitle );
		this.add(lblRD);
		
		
		this.setVisible(true);
	}

	public void init(){		
		lblTitle.setText("Titel: " + title );	
		lblRD.setText("ReleaseDate: " + releaseDate);
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

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
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
