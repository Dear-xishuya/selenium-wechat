package com.hogwarts.web.model;

/**
 * @author fyh
 * @date 2020/11/14
 * @desc 浏览器对象
 */
public class Browser {

	private String browserName;

	public Browser() {
	}

	public Browser(String browserName) {
		this.browserName = browserName;
	}

	public String getBrowserName() {
		return browserName;
	}

	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}
}
