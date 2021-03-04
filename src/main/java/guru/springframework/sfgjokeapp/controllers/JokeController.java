package guru.springframework.sfgjokeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgjokeapp.services.JokeService;

@Controller
public class JokeController {
	
	
	private final JokeService jokeService;
	
	public JokeController( JokeService jokeService ) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/", ""})
	public String showJoke( Model model ) {
		String joke = jokeService.getJoke();
		System.out.println(joke);
		model.addAttribute( "joke", joke );
		return "index";
	}

}
