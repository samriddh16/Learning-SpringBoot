package com.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service("service")
public class ServiceImpl implements IService {

	@Override
	public String getWelcomeMessage() {
		LocalDateTime ldt = LocalDateTime.now();
		int hour = ldt.getHour();
		if (hour < 12)
			return "Good Morning";
		else if (hour < 16)
			return "Good Afternoon";
		else if (hour < 20)
			return "Good Evening";
		else
			return "Good Night";
	}

	@Override
	public String getSeasonName() {
		LocalDateTime ld = LocalDateTime.now();
		System.out.println("FindSeasonName() method");
		if (ld.getMonthValue() == 3 || ld.getMonthValue() == 4)
			return "Happy Vasant(Spring)";
		else if (ld.getMonthValue() == 5 || ld.getMonthValue() == 6)
			return "Happy Grishma(Summer)";
		else if (ld.getMonthValue() == 7 || ld.getMonthValue() == 8)
			return "Happy Varsha(Monsoon)";
		else if (ld.getMonthValue() == 9 || ld.getMonthValue() == 10)
			return "Happy Sharad(Atumn)";
		else if (ld.getMonthValue() == 11 || ld.getMonthValue() == 12)
			return "Happy Hemant(Pre-Winter)";
		else
			return "Happy Shishir(Winter)";
	}

}
