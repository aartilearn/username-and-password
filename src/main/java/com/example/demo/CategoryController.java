package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/category")
public class CategoryController {
	
@Autowired 
private CategoryService2 cateoryservice;

public ResponseEntity<Category> search(@PathVariable String username)
{
	Category category1 = cateoryservice.search(username);
	return new ResponseEntity<Category>(category1,HttpStatus.OK);
}


	
}
