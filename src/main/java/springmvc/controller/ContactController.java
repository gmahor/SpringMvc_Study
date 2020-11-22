package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Desc", "Fill The Form");
	}

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	// Third Method(easy method)
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {

		System.out.println(user);
		int userid = this.userService.createUser(user);
		model.addAttribute("success", "User Created Successfully id : " + userid);
		return "success";

	}

}

/*
 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
 * String handleForm(
 * 
 * @RequestParam(name="email")String email,
 * 
 * @RequestParam("user")String user,
 * 
 * @RequestParam("password")String password, Model model) {
 * 
 * 
 * 
 * 
 * model.addAttribute("email",email); model.addAttribute("user",user);
 * model.addAttribute("password",password);
 * 
 * System.out.printf("Email : %s , UserName : %s, Password : %s
 * \n",email,user,password);
 * 
 * // return "contact" return "success"; }
 * 
 * 
 * //Second method
 * 
 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
 * String handleForm(@RequestParam(name = "email") String
 * email, @RequestParam("user") String user,
 * 
 * @RequestParam("password") String password, Model model) {
 * 
 * User u = new User(); u.setEmail(email); u.setUser(user);
 * u.setPassword(password);
 * 
 * System.out.println(u);
 * 
 * model.addAttribute(u);
 * 
 * return "success";
 * 
 * }
 */