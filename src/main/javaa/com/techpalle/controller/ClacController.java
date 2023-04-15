package com.techpalle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClacController
{
	@RequestMapping(value="calc",params="btnAdd")
	public ModelAndView getAdd(String tbFn, String tbSn)
	{
		ModelAndView mv = new ModelAndView();
		//convert the string to integer
		int fn = Integer.parseInt(tbFn);
		int sn = Integer.parseInt(tbSn);
		
		//add the above two number and store in a variable
		int res=fn+sn;
		
		//put the result in modelandview
		mv.addObject("result", res);
		
		//redirect user to display.jsp
		mv.setViewName("display.jsp");
		
		return mv;
	}
	
	@RequestMapping(value="calc",params="btnSub")
	public ModelAndView getSub(String tbFn, String tbSn)
	{
		ModelAndView mv = new ModelAndView();
		//convert the string to integer
		int fn = Integer.parseInt(tbFn);
		int sn = Integer.parseInt(tbSn);
		
		//add the above two number and store in a variable
		int res=fn-sn;
		
		//put the result in modelandview
		mv.addObject("result", res);
		
		//redirect user to display.jsp
		mv.setViewName("display.jsp");
		
		return mv;
	}
	
	@RequestMapping(value="calc",params="btnMulti")
	public ModelAndView getMulti(String tbFn, String tbSn)
	{
		ModelAndView mv = new ModelAndView();
		//convert the string to integer
		int fn = Integer.parseInt(tbFn);
		int sn = Integer.parseInt(tbSn);
		
		//add the above two number and store in a variable
		int res=fn*sn;
		
		//put the result in modelandview
		mv.addObject("result", res);
		
		//redirect user to display.jsp
		mv.setViewName("display.jsp");
		
		return mv;
	}
	
	@RequestMapping(value="calc",params="btnDiv")
	public ModelAndView getDiv(String tbFn, String tbSn)
	{
		ModelAndView mv = new ModelAndView();
		//convert the string to integer
		int fn = Integer.parseInt(tbFn);
		int sn = Integer.parseInt(tbSn);
		
		//add the above two number and store in a variable
		int res=fn/sn;
		
		//put the result in modelandview
		mv.addObject("result", res);
		
		//redirect user to display.jsp
		mv.setViewName("display.jsp");
		
		return mv;
	}
}