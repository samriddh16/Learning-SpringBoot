package com.service;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class ServiceAppImpl implements ServiceApp {

	@Override
	public String getWishMessage() {
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
	public Set<String> getLocaleInfo() {
		Locale locales[] = Locale.getAvailableLocales();
		Set<String> langSet = new HashSet<>();
		for(Locale l : locales) {
			langSet.add(l.getDisplayLanguage());
		}
		return langSet;
	}

}
