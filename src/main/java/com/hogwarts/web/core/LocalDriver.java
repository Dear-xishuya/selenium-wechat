package com.hogwarts.web.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author fyh
 * @date 2020/11/12
 * @desc
 */
public class LocalDriver implements IDriver {

	private WebDriver driver;

	@Override
	public WebDriver getBrowser(String browser) {
		switch (DriverEnum.getEnum(browser)){
			case CHROME:
				// TODO: 2020/11/12 chrome 浏览器的一些参数设置
				driver = new ChromeDriver();
				break;
			case FIREFOX:
				driver = new FirefoxDriver();
				break;
			default:
				driver = new ChromeDriver();
				break;

		}

		return driver;
	}
}
