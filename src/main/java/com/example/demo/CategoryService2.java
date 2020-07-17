package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService2 {
	
	@Autowired 
	private CategoryRepository categoryRepository;

	public Category search (String username) {
         
		//CategorycategoryRepository.findByName(username);
		return null;
		
	}

}
