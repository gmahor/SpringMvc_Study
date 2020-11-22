package springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ExceptionController {

	@RequestMapping("/ex")
	public String showex() {

		String a = null;
		System.out.println(a.length());

		return "pathvariable";
	}

	/*
	 * If Any Exception will our in your programme. now Exception handler automatic
	 * redirect you in null page.
	 */

	// @ExceptionHandler({ NullPointerException.class, NumberFormatException.class
	// })
	// public String exceptionHandlerNull(Model m) {
	// m.addAttribute("n", "Null Point Exception Occur");
	// return "null_page";
	// }

	/*
	 * Generic Exception Example:= Now you can handle all the Exception without give
	 * there name.
	 * 
	 * ResponseStatus is basically a function that give what type of error u r
	 * facing. 404 error or 500 error etc...
	 */

//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = Exception.class)
//	public String exceptionHandlerGeneric(Model m) {
//
//		m.addAttribute("n", "Null Point Exception Occur");
//
//		return "null_page";
//
//	}
}
