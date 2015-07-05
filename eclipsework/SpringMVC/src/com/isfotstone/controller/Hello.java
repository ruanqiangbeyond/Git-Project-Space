package com.isfotstone.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hello")
//　访问此Controller里面的请求是，前面都要加上hello，如果此处没有hello,则不用加。
public class Hello {
	
	@RequestMapping("/hello")
	//http://localhost:8090/SpringMVC/hello/hello.do
	public ModelAndView hello() {
		ModelAndView mv =new ModelAndView();
		mv.addObject("message", "hell spring mvc");
		mv.setViewName("hello");
		return mv;
	}
	
	@RequestMapping(value={"/", "hello_"})
	//http://localhost:8090/SpringMVC/hello///.do
	//http://localhost:8090/SpringMVC/hello/hello_.do
	public ModelAndView hello_(ModelAndView mv) {
		mv.addObject("message", "hell spring mvc");
		mv.setViewName("hello");
		return mv;
	}	
	
	@RequestMapping("/say")
	public ModelAndView say(ModelAndView mv) {
		System.out.println("hello spring mvc");
		mv.addObject("message", "hello spring mvc");
		mv.setViewName("hello");
		return mv;
	}
	
	@RequestMapping("/doSay")
	//http://localhost:8090/SpringMVC/hello/doSay.do?num=100
	// num变量接收用户传入的参数，并赋值给n变量
	public ModelAndView doSay(@RequestParam("num") int n, HttpServletRequest request,ModelAndView mv) {
		System.out.println(n);
		request.setAttribute("message", "spring mvc 获取参数");
		mv.setViewName("hello");
		return mv;
	}
	@RequestMapping("/doSay_")
	//http://localhost:8090/SpringMVC/hello/doSay_.do?n=100
	// n变量直接接收用户传入的参数
	public ModelAndView doSay_(@RequestParam int n, HttpServletRequest request,ModelAndView mv) {
		System.out.println(n);
		request.setAttribute("message", "spring mvc 获取参数");
		mv.setViewName("hello");
		return mv;
	}
	
	@RequestMapping("str")
	public String str(HttpServletRequest requst) {
		System.out.println("return String test");
		requst.setAttribute("message", "spring mvc very good!");
		return "hello";
	}
}
