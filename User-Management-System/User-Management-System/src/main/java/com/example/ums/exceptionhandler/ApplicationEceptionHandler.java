package com.example.ums.exceptionhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationEceptionHandler {
@ExceptionHandler
	public String handleUserException(Usernotfoundbyid ex,Model model) {
	model.addAttribute("errormessage",ex.getMessage());
	model.addAttribute("redirect",ex.getRedirecTo());
		return "error.jsp";
		
	}
}
