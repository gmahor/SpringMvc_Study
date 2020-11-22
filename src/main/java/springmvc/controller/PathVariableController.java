package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {

	// @RequestMapping("/user/{userId}") - ex1
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int id, @PathVariable("userName") String name, Model m) {
		System.out.println(id + " = " + name);

		m.addAttribute("id", id);
		m.addAttribute("name", name);

		return "pathvariable";
	}


}
