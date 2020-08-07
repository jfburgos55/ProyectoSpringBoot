/**
 * 
 */
package com.platzi.ereservation.vista.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controlador para controlar login personalizado.
 * 
 * @author devp
 *
 */
@Controller
@RequestMapping("app")
public class LoginController {
	@GetMapping(value = { "/login", "/" })
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		String errorMessage = "Usuario y/o contraseñas Incorrectos!!";
		mav.addObject("errorMsg", errorMessage);
		mav.setViewName("login");
		return mav;
	}

	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		return mav;
	}
}
