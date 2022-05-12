package com.kritika.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("add")
	public String add(@RequestParam("t1")int num1, @RequestParam("t2") int num2, HttpSession s)
	{
		int num3 = num1+num2;
		s.setAttribute("num3",num3);
		System.out.println("Working...");
		return "Welcome.jsp";
	}

}
