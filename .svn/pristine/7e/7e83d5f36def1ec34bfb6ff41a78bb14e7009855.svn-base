package com.wanho.java115.sql;

import org.apache.log4j.Logger;
import org.junit.Test;

public class SqlLoadTest {
	private static final Logger log = Logger.getLogger(SqlLoadTest.class);
	@Test
	public void testMysqlConnetcion(){
		 try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
	}
}
