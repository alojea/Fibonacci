package com.alojea.fibonacci;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fibonacci")
public class FibonacciController {
	
	@GetMapping("findNumber")
	public ResponseEntity<Integer> findFibonacciNumber(@RequestParam int n)
	{
		return ResponseEntity.ok(fibonacci(n));
	}
	
	private int fibonacci(int position) {
		//Without this condition we have StackOverFlow
		if (position <= 1) {
			return position;
		}
		return fibonacci(position -1) + fibonacci(position -2);
	}

}
