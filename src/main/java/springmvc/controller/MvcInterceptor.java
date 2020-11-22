package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MvcInterceptor {

	@RequestMapping("/aclass")
	public String interceptorEx() {
		return "a";
	}

	@RequestMapping(path = "/process", method = RequestMethod.POST)
	public String Ex2(@RequestParam("aclass") String name, Model m) {

		m.addAttribute("name", name);

		System.out.println(name);

		return "b";
	}

}
