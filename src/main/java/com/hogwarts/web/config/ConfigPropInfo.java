package com.hogwarts.web.config;

import org.apache.commons.lang3.StringUtils;

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

	public static String DRIVER_DIR = null;

	public static String CHROME_PORT = null;

	public static boolean CHROME_PORT_IS_FIXED = false;

	static {
		Properties pro = new Properties();
		try {
			pro.load(ConfigPropInfo.class.getClassLoader().getResourceAsStream("config.properties"));

			COOKIE_FILE = pro.getProperty("test.cookie.file");

			DRIVER_EXPLICIT_WAIT= Long.parseLong(pro.getProperty("driver.explicit.wait"));

			DRIVER_DIR = pro.getProperty("test.driver.dir");

			CHROME_PORT = pro.getProperty("chrome.port");

			CHROME_PORT_IS_FIXED = StringUtils.isNotBlank(CHROME_PORT);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
