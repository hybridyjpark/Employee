package webapp.test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import webapp.escape.Background;
import webapp.escape.Screen;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateTest {

	static Log log = LogFactory.getLog(DateTest.class);
	
	@SuppressWarnings("deprecation")
	@Test
	public void test1() {
		Date current = new Date();
		log.info(current.toLocaleString());
	}
	
	@Test
	public void test2() { 
		Calendar current = Calendar.getInstance();
		
		log.info(current.getTime().toLocaleString());
	}
	
	@Test
	public void test3() {
		Date current = new Date();
		
		log.info("year = " + (current.getYear() + 1900));
		log.info("month = " + (current.getMonth() + 1));
		log.info("date = " + current.getDate());
		log.info("week = " + current.getDay());
	}
	
	@Test
	public void test4(){
		Date date = new Date(2015-1900, 3-1, 1);
		
		log.info("start week = " + date.getDay());
		
		int month = date.getMonth();
		while(true) {
			date.setDate(date.getDate() + 1);
			
			if(month != date.getMonth())
				break;
		}
		
		date.setDate(date.getDate() - 1);
		log.info("end week = " + date.getDay());
		log.info("end date = " + date.getDate());
		
		log.info(date.toLocaleString());
	}
	
	//1 2 3 4 5 6 7
	// ......
	// ....
	// 29 30 31
	@Test
	public void test5() {
		
		int month = 1;
		int day = 1;
		Date date = new Date(2015-1900, month -1, day);
		
		day = 1;
		month = 3;
		log.info("start day = " + date.getDate());
		
		while(true) {
			date.setDate(date.getDate() + 1);
			
			for(int i = 1 ; i < date.getMonth(); i++) {
				for(int j = 0; j < 7; j++){
					log.info(date.getDate());
				}
			}
			if(month != date.getMonth()){
				 break;	
			}
		} // while
	}
	
	@Test
	public void test6() {
		Screen.clear();
		Scanner scan = new Scanner(System.in);
		
		while(true){
			Screen.cursorPosition(5, 1);
			System.out.print("[yyyy/MM] : ");
			String param = scan.nextLine();
		
			if(param.equals("."))
				break;
			System.out.println("param = " + param);
		}
		
		//Screen.reset();
	}

}
