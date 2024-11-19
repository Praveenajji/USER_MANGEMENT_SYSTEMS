package com.example.ums.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.ums.Service.UserService;
import com.example.ums.entity.User;



@Controller
public class UserController {
private final UserService userService;

public UserController(UserService userService) {
	super();
	this.userService = userService;
}
@PostMapping("/add-user")
public String addUser(User user) {
	userService.addUser(user);
	return "index.jsp";
}
@GetMapping("/display-users")
public String findAllUser(Model model) {
	List<User> user=userService.findAllUsers();
	model.addAttribute("user", user);
	return "display-users.jsp";
}


@GetMapping("/delete-user")
public String deleteproduct(@RequestParam("user_id") int  userid) {
	userService.deleteproduct( userid);
	return "display-users";
}
@GetMapping("/update-user")
public String findbyId(@RequestParam("user_id") int  userid,Model model) {
	User user=userService.findbyId(userid);
	model.addAttribute("user", user);
	return "fetch.jsp";
}
@PostMapping("/update-user")
public String editUser(@ModelAttribute User user) {
	userService.editUser(user);
	return "redirect:/display-users";
}


}
