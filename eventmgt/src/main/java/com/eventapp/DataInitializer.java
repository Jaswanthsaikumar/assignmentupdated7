package com.eventapp;



import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.eventapp.entities.Event;
import com.eventapp.entities.EventUser;
import com.eventapp.service.EventService;
import com.eventapp.service.EventUserService;

@Component
public class DataInitializer implements CommandLineRunner{

	@Autowired
	private EventService eService;
	
	@Autowired
	private EventUserService userService;
	@Override
	public void run(String... args) throws Exception {

		
		Event event1=new Event("Bharathyanam dance", "Chennai", 500.00, LocalDate.of(2021,Month.JANUARY,22), 20, 15);
		Event event2=new Event("Westren dance", "Hyd", 400.00, LocalDate.of(2021,Month.JANUARY,26), 15, 21);
		Event event3=new Event("classic dance", "Chennai", 300.00, LocalDate.of(2021,Month.FEBRUARY,30), 10, 17);
		Event event4=new Event("Singing ", "Delhi", 700.00, LocalDate.of(2021,Month.MARCH,8), 5, 23);
		Event event5=new Event("Bangra dance", "punjab", 450.00, LocalDate.of(2021,Month.APRIL,21), 15, 24);
		
		eService.addEvent(event1);
		eService.addEvent(event2);
		eService.addEvent(event3);
		eService.addEvent(event4);
		eService.addEvent(event5);
		
		
		EventUser users1=new EventUser("Sai","sai143",Arrays.asList("ROLE_ADMIN"));
		
		EventUser users2=new EventUser("kumari","kumari143",Arrays.asList("ROLE_CLERK"));
		
		userService.addUser(users1);
		userService.addUser(users2);
	}

}
