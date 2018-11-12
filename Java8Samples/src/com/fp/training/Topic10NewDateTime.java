package com.fp.training;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Topic10NewDateTime {
	
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.toString());                //2013-05-15
		System.out.println(localDate.getDayOfWeek().toString()); //WEDNESDAY
		System.out.println(localDate.getDayOfMonth());           //15
		System.out.println(localDate.getDayOfYear());            //135
		System.out.println(localDate.isLeapYear());              //false
		System.out.println(localDate.plusDays(12).toString());   //2013-05-27
		
		LocalTime localTime = LocalTime.of(12, 20);
		System.out.println(localTime.toString());    //12:20
		System.out.println(localTime.getHour());     //12
		System.out.println(localTime.getMinute());   //20
		System.out.println(localTime.getSecond());   //0
		System.out.println(localTime.MIDNIGHT);      //00:00
		System.out.println(localTime.NOON);          //12:00
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime.toString());      //2013-05-15T10:01:14.911
		System.out.println(localDateTime.getDayOfMonth()); //15
		System.out.println(localDateTime.getHour());       //10
		System.out.println(localDateTime.getNano());       //911000000
		
		Duration duration = Duration.ofMillis(5000);
		System.out.println(duration.toString());     //PT5S
		 
		duration = Duration.ofSeconds(60);
		System.out.println(duration.toString());     //PT1M
		 
		duration = Duration.ofMinutes(10);
		System.out.println(duration.toString());     //PT10M
		 
		duration = Duration.ofHours(2);
		System.out.println(duration.toString());     //PT2H
		 
		duration = Duration.between(Instant.now(), Instant.now().plus(Duration.ofMinutes(10)));
		System.out.println(duration.toString());  //PT10M
	}

}
