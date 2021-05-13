package com;

import java.sql.Date;
import java.util.Calendar;

public class Hello {
	public static void main(String[] args) {
	
		int a =Calendar.getInstance().get(Calendar.DAY_OF_WEEK)-1;
		int b = (int)Math.pow(2, a);
		System.out.println(b);
		System.out.println(73 & b);
		
		
	}
}

 
