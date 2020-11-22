package springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CentralizedException {

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

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String exceptionHandlerGeneric(Model m) {

		m.addAttribute("n", "Null Point Exception Occur");

		return "null_page";

	}

}
