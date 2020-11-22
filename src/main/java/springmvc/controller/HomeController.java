package springmvc.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.Student;

@Controller
public class HomeController {

	// Using Models
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("Id", 1);
		model.addAttribute("name", "Gourav");

		List<String> friends = new ArrayList<String>();
		friends.add("gourav");
		friends.add("ankit");
		friends.add("ABC");

		model.addAttribute("f", friends);

		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		// Creating model and view object
		ModelAndView modelAndView = new ModelAndView();

		// setting the data
		modelAndView.addObject("name", "Uttam");

		List<String> phone = new ArrayList<String>();
		phone.add("7011929861");
		phone.add("9968270369");
		phone.add("8447727798");

		modelAndView.addObject("p", phone);

		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("now", now);

		LocalDate Date = LocalDate.now();
		modelAndView.addObject("date", Date);

		// setting the view name
		modelAndView.setViewName("help");
		return modelAndView;

	}

	

}
