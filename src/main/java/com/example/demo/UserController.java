package com.example.demo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired 
	private UserService userService; 
	
@PostMapping(value="/saveuser")
	
	public ResponseEntity<User> save (@RequestBody User user)
	{
		User user1=userService.save(user);
		return new ResponseEntity<User>(user1,HttpStatus.OK);	
	}

@GetMapping("/{username}/{type}")
public List<String> search (@PathVariable String username,@PathVariable String type)
{
	User user1=userService.search(username);
	List<String> result=new ArrayList<>();
	System.out.print(user1);
	System.out.print(user1.getName());
	System.out.print(user1.getCategory());
	List<Category> list=user1.getCategory();
	Iterator<Category> itr=list.iterator();
	while(itr.hasNext()) {
		Category c=itr.next();
//		System.out.print(c.getType());
//		System.out.print(c.getPassword());
//		System.out.print(c.getUsername());
		if(c.getType().equals(type))
		{
			System.out.print(c.getType());
			System.out.print(c.getPassword());
			System.out.print(c.getUsername());
			result.add(c.getPassword());
			result.add(c.getUsername());
		}
	}
	return result;
//	return new ResponseEntity<User>(user1,HttpStatus.OK);	
}

}
