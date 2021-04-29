package com;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
//		TransPort tp = new TransPort();
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:ApplicationContext.xml");
		// xml을 로딩하는 클래스가 존재.
		TransPort transport = ctx.getBean("tWalk",TransPort.class);
		transport.move();
		
		ctx.close();
	}
}
