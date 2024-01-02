package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
	
//	home handler
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Home - Contact Manager");
		return "home";
	}
	
	
//	about handler
	
	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "About - Contact Manager");
		return "about";
	}
	
//	signup handler
	
	@RequestMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("title", "Register - Contact Manager");
		return "signup";
	}
	
	
//	@Autowired
//	private UserRepository userRepository;
//	
//	@GetMapping("/test")
//	@ResponseBody
//	public String test() {
//		
//	User user = new User();
//	user.setName("Minal");
//	user.setEmail("m1@g.com");
//	user.setPassword("123");
//	
//	Contact contact = new Contact();
//	user.getContacts().add(contact);
//	
//	userRepository.save(user);
//		return "Working";
//	}

}



