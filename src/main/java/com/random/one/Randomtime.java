package com.random.one;

import java.time.LocalTime;

public class Randomtime {
	
	public static LocalTime printrandomtime(LocalTime localTime) {

		
		//LocalTime localTime = LocalTime.now();
	    System.out.println("Current Hour: " + localTime.getHour());
	    System.out.println("Current Minute: " + localTime.getMinute());
	    System.out.println("Current Second: " + localTime.getSecond());
	    
	    //create mins variables
	    long currentmins = (localTime.getHour()*60) + localTime.getMinute();
	    long remainingminstoday = 1439 - currentmins;
	    long randomtime=(int)(Math.random()*((remainingminstoday-0)+1))+0;
	    
	    localTime = localTime.plusMinutes(randomtime);
	    
	    System.out.println("Elapsed Mins today: " + currentmins);
	    System.out.println("Remaining mins today to add: " + remainingminstoday);
	    System.out.println("Random minutes generated to be added: " + randomtime);
	    System.out.println("Random time to be added: " + randomtime/60 + " hrs " + randomtime%60 + " mins");
	    System.out.println("Random time after current time: " + localTime);
	    System.out.println("Cron tab : " + localTime.getMinute() + " " + localTime.getHour() + " * * *");
	    
	    return localTime;
	}
}
