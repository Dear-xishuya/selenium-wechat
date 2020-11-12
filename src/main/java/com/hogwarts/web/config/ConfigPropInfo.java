package com.hogwarts.web.config;

import java.io.IOException;
import java.util.Properties;

/**
 * @author fyh
 * @date 2020/11/11
 * @desc
 */
public class ConfigPropInfo {

	public static String COOKIE_FILE = null;

	public static long DRIVER_EXPLICIT_WAIT = 0;

	static {
		Properties pro = new Properties();
		try {
			pro.load(ConfigPropInfo.class.getClassLoader().getResourceAsStream("config.properties"));

			COOKIE_FILE = pro.getProperty("test.cookie.file");

			DRIVER_EXPLICIT_WAIT= Long.parseLong(pro.getProperty("driver.explicit.wait"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
