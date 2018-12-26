package net.wanho.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class IDUtil {
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSS") ;
	public static int randId(){
		//String str = sdf.format(new Date()) ;
		int rand = new Random().nextInt() ;
		//return Integer.parseInt(str+rand) ;
		return Math.abs(rand) ;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(randId());
		}
	}
}
