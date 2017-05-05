package com.santuario.ws.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class HomeController {
	
	@RequestMapping("/home")
	public String acessarPaginaHome(){
		return "index";
	}

}
