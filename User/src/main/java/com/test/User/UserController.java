package com.test.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	 @Autowired
	 UserService service;
	   @RequestMapping(value = "/successful_user")
	   public OutPut getProductList(@RequestParam(value = "thresholdperc", required = true) Integer thresholdperc ) {
		   return service.getUsers(  thresholdperc);
	      }

}
