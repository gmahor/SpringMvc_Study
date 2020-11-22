package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.Student;

@Controller
public class ComplexController {

	@RequestMapping("/complex")
	public String complexForm() {
		return "complexform";
	}

	@RequestMapping(path = "/complexform", method = RequestMethod.POST)
	public String handleComplex(@ModelAttribute Student student, BindingResult result) {

		if(result.hasErrors()) {
			return "complexform";
		}
		
		
		System.out.println(student);
		System.out.println(student.getAddress());

		return "success";

	}

}
