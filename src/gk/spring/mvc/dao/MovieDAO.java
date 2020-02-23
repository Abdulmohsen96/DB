package gk.spring.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import gk.spring.mvc.beans.Movie;


public class MovieDAO {
	
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Movie> getMoviesListOrder() {
		String sqlQuery = "SELECT * FROM MyBestFilms";
		
		return jdbcTemplate.query(sqlQuery, new RowMapper<Movie>() {

			@Override
			public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
				Movie movie = new Movie();
				movie.setPosition(rs.getInt("Position"));
				movie.setTitle(rs.getString("Title"));
				movie.setYear(rs.getString("Year"));
				movie.setGenres(rs.getString("Genres"));
				movie.setDirectors(rs.getString("Directors"));
				return movie;
			}});
	}
	
	public List<Movie> getMoviesTitleOrderASC() {
		String sqlQuery = "SELECT * FROM MyBestFilms ORDER BY Title ASC";
		
		return jdbcTemplate.query(sqlQuery, new RowMapper<Movie>() {

			@Override
			public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
				Movie movie = new Movie();
				movie.setPosition(rs.getInt("Position"));
				movie.setTitle(rs.getString("Title"));
				movie.setYear(rs.getString("Year"));
				movie.setGenres(rs.getString("Genres"));
				movie.setDirectors(rs.getString("Directors"));
				return movie;
			}});
	}
	
	public List<Movie> getMoviesTitleOrderDESC() {
		String sqlQuery = "SELECT * FROM MyBestFilms ORDER BY Title DESC";
		
		return jdbcTemplate.query(sqlQuery, new RowMapper<Movie>() {

			@Override
			public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
				Movie movie = new Movie();
				movie.setPosition(rs.getInt("Position"));
				movie.setTitle(rs.getString("Title"));
				movie.setYear(rs.getString("Year"));
				movie.setGenres(rs.getString("Genres"));
				movie.setDirectors(rs.getString("Directors"));
				return movie;
			}});
	}
	
	public Movie getMovieByPosition(int Position) {
		String sqlQuery = "SELECT * FROM MyBestFilms WHERE Position = ?";
		return jdbcTemplate.queryForObject(sqlQuery, new Object[]{Position}, (rs, rowNum) ->
        new Movie(
        		rs.getInt("Position"),
                rs.getString("Title"),
                rs.getString("Year"),
                rs.getString("Genres"),
                rs.getString("Directors")
        ));
	}
}
