package com.example.AverageCalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class AverageCalculatorCalculator {
	
	
	List<Integer> windowcurState;
	List<Integer> windowprevState = new ArrayList<>();
	
	@GetMapping("/number/e")
	public AverageCalculatorEntity calc(@RequestParam("numbers")List<Integer> num) {
		windowcurState = new ArrayList<>();
		for(int i=0;i<num.size();i++) {
			if(!windowcurState.contains(num.get(i))) {
				windowcurState.add(num.get(i));
				windowprevState.add(num.get(i));
			}
		}
		
		double avg;
		int sum=0;
		for(int i=0;i<windowcurState.size();i++) {
			sum+=windowcurState.get(i);
			
		}
		avg=sum/windowcurState.size();
		AverageCalculatorEntity data = new AverageCalculatorEntity(num, windowprevState, windowcurState, avg);
		return data;
	}
	
	

}
