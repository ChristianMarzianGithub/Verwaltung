package verwaltung;

import java.util.Date;

public class Film {

	private String title;
	private String storyLine;
	private String releaseDate;
	private int runTimeMin;
	private String country;
	
	
	public Film(){
		
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
