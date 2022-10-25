package com.test.User;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import lombok.EqualsAndHashCode.Include;

@SpringBootTest
public class UserServiceTest {

	@Autowired
	UserService userService;
	
	@Mock
	RestTemplate restTemplate = new RestTemplate();
	
	@Test
	public void testGetUsers()
	{
	//	restTemplate
		 Response response = new Response();
		 response.setPage("1");
		 response.setTotal_pages(2);
		 List<User> users = new ArrayList<>();
		 User user = new User();
		 user.setId(1);
		 user.setUsername("epaga");
		 user.setAbout("Java developer / team leader at inetsoftware.de");
		 user.setSubmission_count(197);
		 user.setSubmitted(654);
		 users.add(user);
		 response.setData(users);
		 
		 
		 final String baseUrl = "https://jsonmock.hackerrank.com/api/article_users/search?page=1";
		    try {
				URI uri = new URI(baseUrl);
				 Mockito.when(restTemplate.getForEntity(
						 uri,
						    Response.class)
						).thenReturn(new ResponseEntity(null, HttpStatus.OK));
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		 
		OutPut op = userService.getUsers(30);
		
		assertEquals(30, op.thresholdperc);
		
	}
}
