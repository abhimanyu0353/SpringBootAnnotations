package com.phoenix.Day16SpringBootAnnotations;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

	@PostMapping("/receive")
	public String getRequestData(SomeEntity obj)
	{
		System.out.println(obj.age);
		return "Method called";
	}
	
	@GetMapping("/ajax")
	public String getAjax()
	{
		return "GET method called through AJAX";
	}
	
	@PostMapping("/ajax")
	public String postAjax()
	{
		return "POST method called through AJAX";
	}
	
	@PutMapping("/ajax")
	public String putAjax()
	{
		return "Put method called through AJAX";
	}
	
	@DeleteMapping("/ajax")
	public String deleteAjax()
	{
		return "Delete method called through AJAX";
	}
}
