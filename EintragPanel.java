package test;

import java.util.Date;

import javax.swing.JPanel;

public class EintragPanel {

	private String title;
	private String storyLine;
	private Date releaseDate = new Date();
	private int runTimeMin;
	private String country;
	
	
	public EintragPanel(Film movie) {
		// TODO Auto-generated constructor stub
		
		this.title = movie.getTitle();
		this.storyLine = movie.getStoryLine();
		this.releaseDate = movie.getReleaseDate();
		this.runTimeMin = movie.getRunTimeMin();
		this.country = movie.getCountry();
		
		
		
	}

	public static void init(){
		
		JPanel mainPanel = new JPanel();
		Film mainFilm = new Film();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
