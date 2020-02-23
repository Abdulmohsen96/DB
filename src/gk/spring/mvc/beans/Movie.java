package gk.spring.mvc.beans;

public class Movie {

	private int position;
	private String title;
	private String year;
	private String genres;
	private String directors;
	public Movie(int position, String title, String year, String genres, String directors) {
		super();
		this.position = position;
		this.title = title;
		this.year = year;
		this.genres = genres;
		this.directors = directors;
	}
	public Movie() {
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	public String getDirectors() {
		return directors;
	}
	public void setDirectors(String directors) {
		this.directors = directors;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
}
