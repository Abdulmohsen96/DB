package gk.spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gk.spring.mvc.beans.Movie;
import gk.spring.mvc.dao.MovieDAO;

@Controller
public class MovieController {

	@Autowired
	private MovieDAO movieDAO;
	
	@RequestMapping(value = "/viewFilms", method = RequestMethod.GET)
	public String getMoviesListOrder(Model m) {
		List<Movie> list = movieDAO.getMoviesListOrder();
		m.addAttribute("list", list);
		return "viewFilms";
	}
	
	@RequestMapping(value = "/viewFilmsTitleASC", method = RequestMethod.GET)
	public String getMoviesTitleOrderASC(Model m) {
		List<Movie> list = movieDAO.getMoviesTitleOrderASC();
		m.addAttribute("list", list);
		return "viewFilms";
	}
	
	@RequestMapping(value = "/viewFilmsTitleDESC", method = RequestMethod.GET)
	public String getMoviesTitleOrderDESC(Model m) {
		List<Movie> list = movieDAO.getMoviesTitleOrderDESC();
		m.addAttribute("list", list);
		return "viewFilms";
	}
}
