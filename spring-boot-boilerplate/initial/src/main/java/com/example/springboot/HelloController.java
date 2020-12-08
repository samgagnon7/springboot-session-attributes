package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@RestController
@SessionAttributes("sessionString")
public class HelloController {

	@RequestMapping("/homepage")
	public String index(HttpServletRequest request) {
		String session = (String)request.getSession().getAttribute("cart");
		return "Page d'accueil. Variable de session: " + session;
	}

	@RequestMapping("/defineSessionAttribute/{value}")
	public String defineSessionAttribute(HttpServletRequest request, @PathVariable("value") String value) {

		request.getSession().setAttribute("cart", value);

		return "Ajout de variable de session: " + value;
	}
}