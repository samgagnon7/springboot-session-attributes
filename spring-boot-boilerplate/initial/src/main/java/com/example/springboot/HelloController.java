package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

	@RequestMapping("/accueil")
	public String index(HttpServletRequest request) {
		String session = (String)request.getSession().getAttribute("variableDeSession");
		request.getSession().setMaxInactiveInterval(30);
		return "Page d'accueil. Variable de session: " + session;
	}

	@RequestMapping("/definirVariableDeSession/{value}")
	public String defineSessionAttribute(HttpServletRequest request, @PathVariable("value") String value) {

		// ajout de variable de session
		request.getSession().setAttribute("variableDeSession", value);

		// Expiration
		request.getSession().setMaxInactiveInterval(30);

		return "Ajout de variable de session: " + value;
	}
}