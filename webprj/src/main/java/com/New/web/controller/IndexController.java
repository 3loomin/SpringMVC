package com.New.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public void aaaa() {
		System.out.println("asdfasdf");
	}
	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		System.out.println("index controller");
//		ModelAndView mv = new ModelAndView("root.index");
//		mv.addObject("data", "Hello Spring MVC");
//		//mv.setViewName("/WEB-INF/view/index.jsp");
//		
//		
//
//		
//		
//		return mv;
//	}
	
}
