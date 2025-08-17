package com.runner;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.document.Medal;
import com.document.Player;
import com.document.Sport;
import com.service.IPlayerOTMService;

@Component("runner")
public class OTMPlayerRunner implements CommandLineRunner {
	
	@Autowired
	IPlayerOTMService service;

	@Override
	public void run(String... args) throws Exception {
		/*Player p = new Player(3500,"Samriddh","Patna",22);
		Sport s1 = new Sport(200,"Badminton","Outdoor",List.of("Racket", "Shuttlecock", "Badminton Shoes"));
		Sport s2 = new Sport(201,"Cricket","Outdoor",List.of("Bat", "Ball", "Pads"));
		Sport s3 = new Sport(202,"Table Tennis","Indoor",List.of("Racket", "Table Tennis Ball", "Table"));
		Medal m1 = new Medal(300,"Gold","Badminton");
		Medal m2 = new Medal(301,"Silver","Cricket");
		Medal m3 = new Medal(302,"Bronze","Table Tennis");
		p.setSports(List.of(s1,s2,s3));
		p.setMedals(Map.of("Inter-State Badminton Championship",m1,"National Youth Cricket League",m2,
				"All India University Table Tennis Tournament",m3));
		try {
			System.out.println(service.savePlayerData(p));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			service.getPlayerData(3500);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
