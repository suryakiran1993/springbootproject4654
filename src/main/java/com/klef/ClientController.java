package com.klef;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController 
{
   @GetMapping("/")
   public String home()
   {
	   return "CI/CD and Cloud DevOps";
   }
   
   @GetMapping("/demo")
   public String demo()
   {
	   return "Jenkins Demo";
   }
}
