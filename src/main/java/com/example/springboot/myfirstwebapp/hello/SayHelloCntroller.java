package com.example.springboot.myfirstwebapp.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class SayHelloCntroller {
	
	@RequestMapping ("say-hello")
	@ResponseBody
	private String sayHello() {
		return "Hello! What are you learning today?";
	}
	
	@RequestMapping ("say-hello-html")
	@ResponseBody
	private String sayHelloHtml() {
		StringBuffer sb =new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>");
		sb.append("My first html page");
		sb.append("</title>");
		sb.append("<head>");
		sb.append("<body>");
		sb.append("My first html page in body");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	@RequestMapping ("say-hello-jsp")
	private String sayHelloJsp() {
		return "sayHello";
	}
	
	
	

}
