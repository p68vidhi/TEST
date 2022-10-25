package com.test.User;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
	  @Autowired
	   RestTemplate restTemplate;

	public OutPut getUsers( Integer thresholdperc)
	{
		URI uri = null;
		try {
			uri = new URI( "https://jsonmock.hackerrank.com/api/article_users/search?page=1");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   Response res= restTemplate.getForEntity(
uri , Response.class).getBody();
	  
	   List<User> users = res.getData();
	   int pages = res.getTotal_pages();
	   
	   for(int i =2;i<=pages;i++)
	   {
		   try {
			uri = new URI( "https://jsonmock.hackerrank.com/api/article_users/search?page="+2);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   res= restTemplate.getForEntity(
				   uri , Response.class).getBody();
		  
		    users.addAll(res.getData());
	   }
	   //int count  = 30;
	   
	   OutPut output = new OutPut();
	   output.setUsers(new ArrayList<OutputUser>());
	   
	   output.setThresholdperc(thresholdperc);
	   for(User user: users)
	   {
		  Double thresholdpercCalc = (double) ((user.getSubmitted() / user.getSubmission_count()) * 100);
		  
		  if(thresholdpercCalc>thresholdperc)
		  {
			  OutputUser outputUser = new OutputUser();
			  outputUser.setUsername(user.getUsername());
			  outputUser.setSubmission_count(user.getSubmission_count());
			  outputUser.setSubmitted(user.getSubmitted());
			  outputUser.setApproval_rate_perc(thresholdpercCalc);
			  output.getUsers().add(outputUser);
		  }
	   }
		return output;
	}

}
