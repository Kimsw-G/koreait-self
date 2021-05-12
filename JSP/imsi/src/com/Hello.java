package com;

public class Hello {
	public static void main(String[] args) {
	
		String sBin1 = "1001011";
		String sBin2 = "0010000";
		
		int iBin1 = Integer.parseInt(sBin1, 2);
		int iBin2 = Integer.parseInt(sBin2, 2);
		String result = Integer.toBinaryString(iBin1&iBin2);
		System.out.println(result);
	}
}


